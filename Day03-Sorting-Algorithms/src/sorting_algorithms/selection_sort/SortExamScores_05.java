package sorting_algorithms.selection_sort;

public class SortExamScores_05 {

    public static void main(String[] args) {

        int[] scores={89,65,76,34,54,16,0,98,93,19};

        System.out.println("Array of book price before sorting.");
        for(int score:scores){
            System.out.print(score + " ");
        }

        SelectionSort obj=new SelectionSort();
        obj.selectionSort(scores);
        System.out.println("\nArray of book price after sorting.");
        for(int score:scores){
            System.out.print(score + " ");
        }
    }
}
