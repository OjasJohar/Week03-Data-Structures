package sorting_large_data_efficiently;

public class SortingLargeDataEfficiently_02 {

    public static void main(String[] args) {
        long startTime, endTime;
        int[] sizes={1000, 10000, 1000000};

        for(int i=0; i<sizes.length; i++){

            int[] arr=new int[sizes[i]];
            for(int j=0; j<sizes[i]; j++){
                arr[j]=(int)(Math.random()*100000);
            }
            //Compare sorting algorithms
            System.out.println("Comparing Time Duration For "+sizes[i]+" Dataset:");

            startTime=System.nanoTime();
            quickSort(arr, 0, arr.length-1);
            endTime=System.nanoTime();
            System.out.println("Quick Sort  :"+(double)(endTime-startTime)/1000+" ms");

            startTime=System.nanoTime();
            mergeSort(arr, 0, arr.length-1);
            endTime=System.nanoTime();
            System.out.println("Merge Sort  :"+(double)(endTime-startTime)/1000+" ms");

            bubbleSort(arr);
        }
    }

    public static void bubbleSort(int[] arr){
        long startTime=System.nanoTime();
        for(int i=0; i<arr.length-1;i++){
            for(int j=0; j<arr.length-i-1; j++){

                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        long endTime=System.nanoTime();
        System.out.println("Bubble Sort :"+(double)(endTime-startTime)/1000+" ms");
    }

    public static void quickSort(int[] arr, int left, int right){
        //Recursive Quick Sort Function:
        if(left<right){
            int pivotIndex=partition(arr, left, right);

            quickSort(arr, left, pivotIndex-1);
            quickSort(arr, pivotIndex+1, right);
        }
    }

    public static int partition(int[] arr, int left, int right){
        //Method to partition the array.
        int pivot=arr[right];
        //Choosing last element as pivot.
        int i=left-1;
        //pointer for smaller element.

        for(int j=left; j<right; j++){
            if(arr[j]<pivot){
                i++;
                //Swap arr[i] with arr[j]
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }

        }
        //Swap arr[i+1] with pivot (arr[right])
        int temp=arr[i+1];
        arr[i+1]=arr[right];
        arr[right]=temp;
        return i+1;//Returning pivot index.
    }

    public static void mergeSort(int[] arr, int left, int right){

        if(left<right){

            int mid=left+(right-left)/2;

            //Recursively calling.
            mergeSort(arr, left, mid);
            mergeSort(arr, mid+1, right);

            merge(arr, left, mid, right);

        }
    }

    public static void merge(int[] arr, int left, int mid, int right){
        int n1=mid-left+1;
        int n2=right-mid;

        //Create Temporary Arrays
        int[] leftArr=new int[n1];
        int[] rightArr=new int[n2];

        for(int i=0; i<n1; i++){
            leftArr[i]=arr[left+i];
        }
        for(int j=0; j<n2; j++){
            rightArr[j]=arr[mid+j+1];
        }

        //merge.
        int i=0, j=0, k=left;
        while(i<n1 && j<n2){
            if(leftArr[i]<=rightArr[j]){
                arr[k]=leftArr[i];
                i++;
                k++;
            } else {
                arr[k]=rightArr[j];
                j++;
                k++;
            }
        }

        while(i<n1){
            arr[k]=leftArr[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k]=rightArr[j];
            j++;
            k++;
        }
    }
}
