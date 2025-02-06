package org.stringbuilder.reverse_a_string;

import java.util.Scanner;

public class ReverseStringUsingStringBuilder_01 {

    public static String reverseString(String input){
        //Creating a new StringBuilder object.
        StringBuilder sb=new StringBuilder();

        //Append the string to the StringBuilder.
        sb.append(input);

        //Using the reverse() method of StringBuilder to reverse the string.
        sb.reverse();
        System.out.println("Reversing the String :"+sb);

        //toString is needed because sb is of type StringBuilder and result is of type String.
        return sb.toString();
    }

    public static void main(String[] args) {
        //Take user input.
        System.out.print("Enter the String :");

        //Creating Scanner Object.
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();

        //Calling method.
        String result=reverseString(input);

        //Printing the result.
        System.out.println("Result :"+result);

        //Closing Scanner class.
        sc.close();
    }
}
