package search_target_in_large_dataset;

public class SearchTargetInLargeDataset_01 {

    public static long linearSearch(int[] arr){
        long startTime=System.nanoTime();
        for(int i=0; i<arr.length; i++){
            if(arr[i]==arr.length){
                break;
            }
        }
        long endTime=System.nanoTime();
        return (endTime-startTime);
    }

    public static long binarySearch(int[] arr){
        long startTime=System.nanoTime();
        int left=0;
        int right=arr.length-1;
        int target=arr.length;

        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==target){
                break;
            }
            else if(arr[mid]<target){
                left=mid+1;
            }
            else if(arr[mid]>target){
                right=mid-1;
            }
        }
        long endTime=System.nanoTime();
        return (endTime-startTime);
    }

    public static void main(String[] args) {
        //Storing diff sizes in array so that we don't need to declare multiple loops.
        int[] sizes={1000, 10000, 1000000};

        for(int i=0; i<sizes.length; i++){
            //Comparing performance of Linear Search(O(N)) and Binary Search(O(log N)).
            System.out.println("Comparing Performance For "+sizes[i]+" Dataset :");

            //local scope so after every iteration arr reinitialize.
            int[] arr=new int[sizes[i]];
            for(int j=0; j<arr.length;j++){
                arr[j]=j+1;
            }
            long time1=linearSearch(arr);
            System.out.println("Linear Search :"+(double)(time1/1000)+" ms");

            long time2=binarySearch(arr);
            System.out.println("Binary Search :"+(double)(time2/1000)+" ms");
        }
    }
}
