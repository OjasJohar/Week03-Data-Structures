package sorting_algorithms.bubble_sort;

public class SortStudentMarks_01 {

    public static void main(String[] args) {

        System.out.println("Students Marks :");
        int[] marks={36, 44, 22, 76, 88, 12, 46, 55, 44, 21};

        BubbleSort.displayArray(marks);

        System.out.println("Sorted Marks :");
        BubbleSort.bubbleSort(marks);

        BubbleSort.displayArray(marks);
    }
}
