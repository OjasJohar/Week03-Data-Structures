package org.stringbuffer.compare_stringbuffer_with_stringbuilder_for_string_concatenation;

import java.util.Scanner;

public class CompareStringBufferWithStringBuilder_02 {

    public static void main(String[] args) {
        long startTime, endTime;

        //Initialize two StringBuffer and StringBuilder objects.
        StringBuffer buffer=new StringBuffer();
        StringBuilder builder=new StringBuilder();

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String to append :");
        String str=sc.next();

        //Perform string concatenation on objects.
        startTime=System.nanoTime();
        for(int i=0; i<1000000; i++){
            buffer.append(str);
        }
        endTime=System.nanoTime();
        System.out.println("Time Taken By StringBuffer  :"+ (endTime-startTime) +" ns");

        //Perform string concatenation on objects.
        startTime=System.nanoTime();
        for(int i=0; i<1000000; i++){
            builder.append(str);
        }
        endTime=System.nanoTime();
        System.out.println("Time Taken By StringBuilder :"+ (endTime-startTime) +" ns");

    }
}
