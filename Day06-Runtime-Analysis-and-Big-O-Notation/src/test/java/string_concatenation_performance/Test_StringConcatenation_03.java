package string_concatenation_performance;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_StringConcatenation_03 {

    @Test
    void test03A(){
        String string="OOOOOOOOOO";
        String str=StringConcatenationPerformance_03.usingString(10);
        Assertions.assertEquals(string, str);
    }

    @Test
    void test03B(){
        String string="OOOOOOOOOO";
        String str=StringConcatenationPerformance_03.usingStringBuffer(10);
        Assertions.assertEquals(string, str);
    }

    @Test
    void test03C(){
        String string="OOOOOOOOOO";
        String str=StringConcatenationPerformance_03.usingStringBuilder(10);
        Assertions.assertEquals(string, str);
    }
    @Test
    void test03D(){
        String string="OOOOOOOOOO";

        long startTime=System.nanoTime();
        String str1=StringConcatenationPerformance_03.usingStringBuilder(1000);
        long endTime=System.nanoTime();
        long builderTime=endTime-startTime;

        startTime=System.nanoTime();
        String str2=StringConcatenationPerformance_03.usingStringBuffer(1000);
        endTime=System.nanoTime();
        long bufferTime=endTime-startTime;

        startTime=System.nanoTime();
        String str3=StringConcatenationPerformance_03.usingString(1000);
        endTime=System.nanoTime();
        long stringTime=endTime-startTime;
        Assertions.assertTrue(stringTime>builderTime && stringTime>bufferTime);
    }
}
