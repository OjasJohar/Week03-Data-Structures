package sorting_algorithms.counting_sort;

import java.util.Arrays;

public class SortStudentAges_07 {

    public static void main(String[] args) {
        int[] ages = {12, 15, 11, 18, 12, 14, 10, 13, 17, 16, 15, 10};
        CountingSort.display(ages);

        int[] sortedAges = CountingSort.countSort(ages);
        System.out.println(Arrays.toString(sortedAges));
    }
}
