package org.stringbuffer.concatenate_strings_using_stringbuffer;

import java.util.Arrays;
import java.util.Scanner;

public class ConcatenateStringsUsingStringBuffer_01 {

    public static String concatenateString(String[] words){
        //Create a new StringBuffer object.
        StringBuffer sb=new StringBuffer();

        //Iterate through each string in the array and append it to the StringBuffer.
        for(int i=0;i<words.length;i++){
            sb.append(words[i]);
        }

        //Returning the concatenated string after the loop finishes.
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println("Enter the Strings till 5 words:");
        Scanner sc=new Scanner(System.in);

        String[] words=new String[5];
        for(int i=0;i<words.length;i++){
            System.out.print((i+1) +".");
            words[i]=sc.next();
        }
        //Displaying the array of string.
        System.out.println(Arrays.toString(words));

        //Calling method
        String result=concatenateString(words);
        //Printing result.
        System.out.println("Concatenated String :"+result);

        //Closing Scanner class
        sc.close();
    }
}
