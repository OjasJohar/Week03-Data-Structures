package sorting_algorithms.insertion_sort;

public class SortEmployeeIDs_02 {

    public static void main(String[] args) {

        System.out.print("Employee IDs : ");
        int[] ids={55, 34, 12, 32 ,28, 60, 54, 89, 13};

        InsertionSort.displaySorted(ids);

        System.out.println("Sorted Employee IDs :");
        InsertionSort.insertionSort(ids);
        InsertionSort.displaySorted(ids);
    }
}
