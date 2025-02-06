package InputStreamReader;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadAndWriteTest {

    @Test
    void testing(){
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
        System.out.println("Testing Completed");
    }
}
