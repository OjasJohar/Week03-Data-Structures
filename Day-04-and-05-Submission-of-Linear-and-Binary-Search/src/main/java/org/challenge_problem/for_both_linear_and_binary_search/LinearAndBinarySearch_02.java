package org.challenge_problem.for_both_linear_and_binary_search;

import java.util.Arrays;

public class LinearAndBinarySearch_02 {

    public static int findingFirstMissingPositiveNumber(int[] arr){

        int[] temp=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<arr.length && arr[i]>=0){
                temp[arr[i]]++;
            }
        }
        int answer=temp.length;
        if(arr[0]!=0){
            answer=temp.length+1;
        }
        for(int i=1;i<temp.length;i++){
            if(temp[i]==0){
                answer=i;
                break;
            }
        }
        return answer;
    }

    public static int binarySearch(int[] arr, int target){
        int left=0;
        int right=arr.length-1;

        while(left<right){
            int mid=(left+right)/2;

            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]>target){
                right=mid-1;
            }else if(arr[mid]<target){
                left=mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={9,0,8,-2,-4,10,14,9,3};
        int val=findingFirstMissingPositiveNumber(arr);
        System.out.println("First missing positive integer : " + val);

        int target=9;
        Arrays.sort(arr); //{-4,-2,0,3,8,9,9,10,14}
        System.out.println(Arrays.toString(arr));
        int found=binarySearch(arr,target);
        if(found==-1){
            System.out.println("Target not found.");
        }else{
            System.out.println("Target found at index " + found);
        }
    }
}
