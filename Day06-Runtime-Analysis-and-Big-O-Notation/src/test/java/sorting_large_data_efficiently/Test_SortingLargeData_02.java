package sorting_large_data_efficiently;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class Test_SortingLargeData_02 {

    @Test
    void test02A(){
        int[] arr={5,1,9,4,8,12,0,4};
        int[] expectedArr={5,1,9,4,8,12,0,4};
        Arrays.sort(expectedArr);

        SortingLargeDataEfficiently_02.bubbleSort(arr);

        Assertions.assertArrayEquals(expectedArr, arr);
    }
    @Test
    void test02B(){
        int[] arr={6,1,2,8,9,17,0,4};
        int[] expectedArr={6,1,2,8,9,17,0,4};
        Arrays.sort(expectedArr);

        SortingLargeDataEfficiently_02.quickSort(arr, 0, arr.length-1);
        Assertions.assertArrayEquals(expectedArr, arr);
    }
    @Test
    void test02C(){
        int[] arr={7,1,2,8,6,19,0,6};
        int[] expectedArr={7,1,2,8,6,19,0,6};
        Arrays.sort(expectedArr);

        SortingLargeDataEfficiently_02.mergeSort(arr, 0, arr.length-1);
        Assertions.assertArrayEquals(expectedArr, arr);
    }
}
