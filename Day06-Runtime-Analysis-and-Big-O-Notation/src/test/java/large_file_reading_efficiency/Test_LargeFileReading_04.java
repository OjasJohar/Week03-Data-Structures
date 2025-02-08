package large_file_reading_efficiency;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_LargeFileReading_04 {

    @Test
    void test04A(){
        String file3="src/main/java/large_file_reading_efficiency/1mb.txt";

        long res=LargeFileReadingEfficiency_04.forFileReader(file3);
        Assertions.assertTrue(res>0);
    }
    @Test
    void test04B(){
        String file3="src/main/java/large_file_reading_efficiency/1mb.txt";

        long res=LargeFileReadingEfficiency_04.forInputStreamReader(file3);
        Assertions.assertTrue(res>0);
    }
    @Test
    void test04C(){
        String file3="src/main/java/large_file_reading_efficiency/1mb.txt";

        long res1=LargeFileReadingEfficiency_04.forFileReader(file3);
        long res2=LargeFileReadingEfficiency_04.forInputStreamReader(file3);
        Assertions.assertTrue(res2<res1);
    }
}
