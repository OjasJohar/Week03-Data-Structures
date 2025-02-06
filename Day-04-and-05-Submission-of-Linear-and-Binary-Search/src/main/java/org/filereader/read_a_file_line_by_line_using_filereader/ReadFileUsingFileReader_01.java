package org.filereader.read_a_file_line_by_line_using_filereader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileUsingFileReader_01 {

    public static void main(String[] args) {

        String textFile="src/main/java/org/filereader/read_a_file_line_by_line_using_filereader/textFile.txt";

        //Create a FileReader object to read from the file.
        try (  FileReader fileReader = new FileReader(textFile);
             //Wrap the FileReader in a BufferedReader to read lines efficiently.
             BufferedReader bufferedReader = new BufferedReader(fileReader)  ) {

            String line;
            //Use a loop to read each line using the readLine() method.
            while ((line = bufferedReader.readLine()) != null) {
                //print it to the console.
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }

    }
}
