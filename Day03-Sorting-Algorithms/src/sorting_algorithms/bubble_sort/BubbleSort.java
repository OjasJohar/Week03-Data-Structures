package sorting_algorithms.bubble_sort;

public class BubbleSort {

    public static void bubbleSort(int[] marks){
        int n=marks.length;
        boolean swapped=false;

        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(marks[j]>marks[j+1]){
                    int temp=marks[j];
                    marks[j]=marks[j+1];
                    marks[j+1]=temp;
                    swapped=true;
                }
            }
            //To break loop if in first pass array is found to be sorted.
            if(!swapped)break;
        }
    }

    public static void displayArray(int[] marks){
        for(int num : marks){
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
