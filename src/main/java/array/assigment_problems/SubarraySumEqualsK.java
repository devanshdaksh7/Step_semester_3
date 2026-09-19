package array.assigment_problems;

import java.util.HashMap;
import java.util.Scanner;

public class SubarraySumEqualsK {

    public static int subarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> prefixSums = new HashMap<>();

        // Empty prefix
        prefixSums.put(0, 1);

        int currentSum = 0;
        int count = 0;

        for (int num : nums) {

            currentSum += num;

            // Check if an earlier prefix gives sum k
            if (prefixSums.containsKey(currentSum - k)) {
                count += prefixSums.get(currentSum - k);
            }

            // Store frequency of current prefix sum
            prefixSums.put(
                currentSum,
                prefixSums.getOrDefault(currentSum, 0) + 1
            );
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] nums = {1, 1, 1};
        int k = 2;

        int result = subarraySum(nums, k);

        System.out.println(result);

        scanner.close();
    }
}