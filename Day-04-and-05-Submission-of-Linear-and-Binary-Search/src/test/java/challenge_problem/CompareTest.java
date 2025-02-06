package challenge_problem;

import org.challenge_problem.compare_stringbuilder_stringbuffer_filereader_inputstreamreader.Compare_01;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CompareTest {

    @Test
    void stringBuilderAndBuilderPerformanceTest(){

        long builderTime= Compare_01.stringBuilderPerformance();
        long bufferTime= Compare_01.stringBufferPerformance();

        assertTrue(builderTime<bufferTime);
    }

    @Test
    void filePerformanceTest(){
        String filePath="src/main/java/org/challenge_problem/compare_stringbuilder_stringbuffer_filereader_inputstreamreader/file";
          long fileReaderTime= Compare_01.fileReaderPerformance(filePath);
          long inputReaderPerformance= Compare_01.inputStreamReaderPerformance(filePath);

          assertTrue(fileReaderTime >inputReaderPerformance);
    }
}
