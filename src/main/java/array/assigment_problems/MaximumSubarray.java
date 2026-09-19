package array.assigment_problems;

import java.util.Scanner;

public class MaximumSubarray {

    public static int maxSubArray(int[] nums) {

        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {

            // Decide: extend the subarray or start fresh
            currentSum = Math.max(nums[i], currentSum + nums[i]);

            // Update the best sum found so far
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int result = maxSubArray(nums);

        System.out.println(result);

        scanner.close();
    }
}