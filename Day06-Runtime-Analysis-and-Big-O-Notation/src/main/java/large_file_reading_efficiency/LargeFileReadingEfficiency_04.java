package large_file_reading_efficiency;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LargeFileReadingEfficiency_04 {

    public static void main(String[] args) {
        String file1="src/main/java/large_file_reading_efficiency/1mb.txt";
        String file2="src/main/java/large_file_reading_efficiency/100mb.txt";
        String file3="src/main/java/large_file_reading_efficiency/500mb.txt";

        String[] str={file1, file2, file3};
        for(int i=0; i< str.length; i++){
            System.out.println("Comparing Speed for different size files :");
            String textFile=str[i];

            long time1=forFileReader(textFile);
            System.out.println("FileReader        :"+(time1/10000)+ " ms");

            long time2=forInputStreamReader(textFile);
            System.out.println("InputStreamReader :"+(time2/10000)+ " ms");
        }
    }

    public static long forFileReader(String textFile){
        long startTime=System.nanoTime();
        try(FileReader fr=new FileReader(textFile)){
            int line;
            while((line= fr.read())!=-1){
                //Just for reading.
            }
        } catch(IOException e){
            System.out.println("Can't Read File .");
        }
        long endTime=System.nanoTime();
        return (endTime-startTime);
    }

    public static long forInputStreamReader(String textFile){
        long startTime=System.nanoTime();
        try(InputStreamReader isr=new InputStreamReader(new FileInputStream(textFile))) {
            int line;
            while((line=isr.read())!=-1){
                //Just for reading.
            }
        } catch (IOException e){
            System.out.println("Can't Read File .");
        }
        long endTime=System.nanoTime();
        return (endTime-startTime);
    }
}
