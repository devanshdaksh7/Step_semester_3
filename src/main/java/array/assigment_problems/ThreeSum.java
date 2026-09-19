package array.assigment_problems;

import java.util.Arrays;
import java.util.Scanner;

public class ThreeSum {

    public static int[][] threeSum(int[] nums) {

        Arrays.sort(nums);

        int[][] temp = new int[nums.length * nums.length][3];
        int count = 0;

        for (int i = 0; i < nums.length - 2; i++) {

            // Skip duplicate first values
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {

                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {

                    temp[count][0] = nums[i];
                    temp[count][1] = nums[left];
                    temp[count][2] = nums[right];
                    count++;

                    left++;
                    right--;

                    // Skip duplicate second values
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }

                    // Skip duplicate third values
                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }

                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        // Create result array with exact size
        int[][] result = new int[count][3];

        for (int i = 0; i < count; i++) {
            result[i] = temp[i];
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] nums = {-1, 0, 1, 2, -1, -4};

        int[][] result = threeSum(nums);

        System.out.println(Arrays.deepToString(result));

        scanner.close();
    }
}