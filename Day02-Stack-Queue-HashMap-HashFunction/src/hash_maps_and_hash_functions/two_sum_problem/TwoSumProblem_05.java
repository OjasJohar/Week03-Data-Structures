package hash_maps_and_hash_functions.two_sum_problem;

import java.util.*;

public class TwoSumProblem_05 {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>(); // Stores (value, index)

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // Check if complement exists in map
            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};
            }

            // Store current number and index
            numMap.put(nums[i], i);
        }

        return new int[]{}; // Return empty array if no solution found
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);
        if (result.length == 2) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No solution found.");
        }
    }
}