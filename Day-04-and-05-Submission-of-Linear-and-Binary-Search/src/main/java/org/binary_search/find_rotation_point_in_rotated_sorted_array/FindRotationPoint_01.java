package org.binary_search.find_rotation_point_in_rotated_sorted_array;

public class FindRotationPoint_01 {

    public static int binarySearch(int[] arr){
        int left=0;
        int right=arr.length-1;
        int smallest=arr[0];
        int mid;
        while(left<=right){
            mid=left+(right-left)/2;

            if(arr[mid]<arr[right]){
                right=mid;
            }else if(arr[mid]>arr[right]){
                left=mid+1;
            }else if(left==right){
                smallest=arr[left];
                break;
            }

        }
        return smallest;
    }

    public static void main(String[] args) {
        int[] arr={9,8,7,6,5,4,3,2,1};
        int smallest=binarySearch(arr);

        System.out.println("Smallest Number in the rotated sorted array is: " + smallest);
    }
}
