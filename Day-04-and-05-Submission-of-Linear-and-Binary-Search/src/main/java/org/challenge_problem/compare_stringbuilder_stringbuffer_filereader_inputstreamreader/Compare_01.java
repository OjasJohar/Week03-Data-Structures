package org.challenge_problem.compare_stringbuilder_stringbuffer_filereader_inputstreamreader;

import java.io.*;

public class Compare_01 {

    public static void main(String[] args) {
        long startTime, endTime;

        // Testing StringBuilder Performance
        startTime = System.nanoTime();
        StringBuilder sb = new StringBuilder("Ojas");
        for (int i = 0; i < 1000000; i++) {
            sb.append(" Performance Test");
        }
        endTime = System.nanoTime();
        System.out.println("Time Taken by StringBuilder: " + (endTime - startTime) + " ns");

        // Testing StringBuffer Performance
        startTime = System.nanoTime();
        StringBuffer sbf = new StringBuffer("Ojas");
        for (int i = 0; i < 1000000; i++) {
            sbf.append(" Performance Test");
        }
        endTime = System.nanoTime();
        System.out.println("Time Taken by StringBuffer : " + (endTime - startTime) + " ns");

        String filePath="src/main/java/org/challenge_problem/compare_stringbuilder_stringbuffer_filereader_inputstreamreader/file";

        //Preparing the file.
        try (FileWriter writer=new FileWriter(filePath)){
            writer.write(sb.toString());
            writer.write(sbf.toString());
        }catch(IOException e){
            e.printStackTrace();
        }

        try (BufferedReader br=new BufferedReader(new FileReader(filePath))) {
            startTime = System.nanoTime();
            String line;
            int count=0;
            while((line=br.readLine())!=null){
                count++;
            }
            endTime = System.nanoTime();
            System.out.println("FileReader Time       : " + (endTime - startTime) + " ns");
        }catch(IOException e){
            e.printStackTrace();
        }

        //prefer using an InputStreamReader wrapping a FileInputStream to read from a file.
        try(BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream(filePath))))
        {
            startTime = System.nanoTime();
            String line;
            int count=0;
            while((line= br.readLine())!=null){
                count++;
            }
            endTime = System.nanoTime();
            System.out.println("InputStreamReader Time: " + (endTime - startTime) + " ns");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
