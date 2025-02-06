package challenge_problem;

import org.challenge_problem.for_both_linear_and_binary_search.LinearAndBinarySearch_02;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
public class LinearAndBinaryTest {

    @Test
    void firstPositiveTest(){
        int[] arr={9,0,8,-2,-4,10,14,9,3};
        int val= LinearAndBinarySearch_02.findingFirstMissingPositiveNumber(arr);
        assertEquals(1,val);
    }

    @Test
    void binarySearchTest(){
        int[] arr={9,0,8,-2,-4,10,14,9,3};
        int target=9;
        Arrays.sort(arr);
        int found=LinearAndBinarySearch_02.binarySearch(arr,target);
        assertEquals(6,found);
    }
}
