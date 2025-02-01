package sorting_algorithms.merge_sort;

public class SortAnArrayOfBookPrices_03 {

    public static void main(String[] args) {

        System.out.print("List of prices :");
        int[] prices={123, 44, 6556, 33 ,55, 75, 10, 435};
        MergeSort.printArray(prices);

        System.out.println("Sorted Price :");
        MergeSort.mergeSort(prices, 0, prices.length-1);

        MergeSort.printArray(prices);
    }
}
