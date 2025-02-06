package string_buffer;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CompareStringTest {

    @Test
    void stringBuilderAndBuilderPerformanceTest(){

        long startTime, endTime;

        //Initialize two StringBuffer and StringBuilder objects.
        StringBuffer buffer=new StringBuffer();
        StringBuilder builder=new StringBuilder();

        String str="ojas";

        //Perform string concatenation on objects.
        startTime=System.nanoTime();
        for(int i=0; i<1000000; i++){
            buffer.append(str);
        }
        endTime=System.nanoTime();
        long bufferTime=(endTime-startTime);
        System.out.println("Time Taken By StringBuffer  :"+ bufferTime +" ns");

        //Perform string concatenation on objects.
        startTime=System.nanoTime();
        for(int i=0; i<1000000; i++){
            builder.append(str);
        }
        endTime=System.nanoTime();
        long builderTime=(endTime-startTime);
        System.out.println("Time Taken By StringBuilder :"+  builderTime +" ns");


        assertTrue(builderTime<bufferTime);
    }

}
