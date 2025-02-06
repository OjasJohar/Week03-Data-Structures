package org.filereader.count_occurrence_of_word_in_file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CountOccurrenceOfWord_02{

    public static void main(String[] args) {
        String textFile="src\\main\\java\\org\\filereader\\count_occurrence_of_word_in_file\\wordFile.txt";

        System.out.print("Enter the target word :");
        Scanner sc=new Scanner(System.in);
        String targetWord=sc.next();

        //Initialize a counter variable to keep track of word occurrences.
        int count=0;

        //Create a FileReader to read from the file and wrap it in a BufferedReader.
        try(FileReader fr=new FileReader(textFile); BufferedReader br=new BufferedReader(fr))
        {
            String line;
            while ( (line = br.readLine()) != null) {
                String[] words = line.split("\\s+"); // Split line into words
                for (String word : words) {
                    if (word.equalsIgnoreCase(targetWord)) {
                        count++;
                    }
                }
            }
            System.out.println("The word '" + targetWord + "' appears " + count + " times in the file.");
        } catch (IOException e){
        System.err.println("Error reading file: " + e.getMessage());
        }

        //Closing the Scanner class.
        sc.close();
    }
}
