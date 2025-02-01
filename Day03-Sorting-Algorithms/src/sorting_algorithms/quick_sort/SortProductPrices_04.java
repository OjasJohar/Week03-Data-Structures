package sorting_algorithms.quick_sort;

public class SortProductPrices_04 {

    public static void main(String[] args) {
        System.out.print("Product Prices : ");
        int[] prices = {200, 350, 50, 23, 55,10, 203, 400, 325};

        for(int price : prices) {
            System.out.print(price + " ");
        }


        QuickSort obj = new QuickSort();
        obj.quickSort(prices, 0, prices.length-1);
        System.out.println("\nPrice of products after sorting:");
        for (int price : prices) {
            System.out.print(price + " ");
        }
    }
}
