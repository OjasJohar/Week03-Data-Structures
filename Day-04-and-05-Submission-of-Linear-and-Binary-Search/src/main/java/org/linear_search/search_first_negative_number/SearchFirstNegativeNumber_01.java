package org.linear_search.search_first_negative_number;

import java.util.Scanner;

public class SearchFirstNegativeNumber_01 {

    public static int findNegative(int[] arr){
        for(int i=0; i<arr.length; i++){
            if(arr[i]<0){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.print("Enter the size of Array :");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];

        System.out.println("Enter the numbers :");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        int result=findNegative(arr);

        if(result>=0){
            System.out.println("Negative Number "+ arr[result] +" Found At Index "+result);
        } else
            System.out.println("Negative Number Not Found.");
    }
}
