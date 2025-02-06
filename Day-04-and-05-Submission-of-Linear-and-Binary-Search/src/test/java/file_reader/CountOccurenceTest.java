package file_reader;

import org.filereader.count_occurrence_of_word_in_file.CountOccurrenceOfWord_02;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CountOccurenceTest {
    @Test
    void countingTest(){
        String filePath="src\\main\\java\\org\\filereader\\count_occurrence_of_word_in_file\\wordFile.txt";
        String str="ojas";
        int count= CountOccurrenceOfWord_02.counting(filePath,str);
        assertEquals(1,count);
    }
}
