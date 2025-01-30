package hash_maps_and_hash_functions.Check_a_pair;
import java.util.*;

public class CheckPairWithGivenSumInArray_02 {

    public static boolean hasPairWithSum(int[] arr, int target) {
        Set<Integer> seen = new HashSet<>();

        for (int num : arr) {
            int complement = target - num;

            // Check if complement exists
            if (seen.contains(complement)) {
                System.out.println("Pair found: (" + num + ", " + complement + ")");
                return true;
            }

            // Add the number to the set
            seen.add(num);
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = {10, 15, 3, 7};
        int target = 17;

        if (!hasPairWithSum(arr, target)) {
            System.out.println("No pair found.");
        }
    }
}