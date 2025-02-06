package org.inputstreamreader.convert_byte_stream_to_character_stream;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConvertByteToCharacterStream_01 {

    public static void main(String[] args) {

        String filePath="src/main/java/org/inputstreamreader/convert_byte_stream_to_character_stream/file";
        try (FileInputStream fI=new FileInputStream(filePath);
             InputStreamReader iSR=new InputStreamReader(fI);
             BufferedReader bR=new BufferedReader(iSR);)
        {
            String line;
            while((line=bR.readLine())!=null){
                System.out.println(line);
            }

        }catch(IOException e){
            e.printStackTrace();
        }

    }
}
