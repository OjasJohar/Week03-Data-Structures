package org.binary_search.search_target_value_in_2d_sorted_matrix;

public class SearchTargetValue_03 {

    public static boolean binarySearchMatrix(int[][] matrix, int target){
        int numRow=matrix[0].length;
        int numColumns=matrix.length;
        int left=0;
        int right=numRow*numColumns-1;
        while(left<=right){
            int mid=(left+right)/2;
            //Convert mid to row and column indices using row = mid / numColumns and col = mid % numColumns.
            int row=mid/numColumns;
            int col=mid%numColumns;

            if(matrix[row][col]==target){
                return true;
            }else if(matrix[row][col]<target){
                left=mid+1;
            }else if(matrix[row][col]>target){
                right=mid-1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int row=5,column=5;
        int[][] arr=new int[row][];
        arr[0]=new int[]{1,2,3,4,5};
        arr[1]=new int[]{6,7,8,9,10};
        arr[2]=new int[]{11,12,13,14,15};
        arr[3]=new int[]{16,17,18,19,20};
        arr[4]=new int[]{21,22,23,24,25};

        int target1=21;
        int target2=34;

        System.out.println("Target1: " + target1);
        if(binarySearchMatrix(arr,target1)){
            System.out.println("Found.");
        }else{
            System.out.println("Not Found.");
        }

        System.out.println("Target2: " + target2);
        if(binarySearchMatrix(arr,target2)){
            System.out.println("Found.");
        }else{
            System.out.println("Not Found.");
        }
    }
}
