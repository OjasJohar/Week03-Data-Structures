package org.inputstreamreader.read_user_input_and_write_to_file;

import java.io.*;

public class ReadUserInputAndWriteToFile_02 {

    public static void main(String[] args) {

        String filePath = "src/main/java/org/inputstreamreader/read_user_input_and_write_to_file/file";

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
        {
            FileWriter writer = new FileWriter(filePath);
            String line;

            while (!(line = br.readLine()).equals("exit")) {
                writer.write(line + "\n");
                //it clears the writer of any element that may be or maybe not inside the writer.
                writer.flush();
            }
            System.out.println("Successfully written in the file");
            //Closing the file after the input is finished.
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
