package string_buffer;

import org.junit.jupiter.api.Test;
import org.stringbuffer.concatenate_strings_using_stringbuffer.ConcatenateStringsUsingStringBuffer_01;

import static org.junit.jupiter.api.Assertions.*;


public class ConcatenateStringTest {

    @Test
    void concatenateTesting(){
        String[] arr={"oj", "as", "jo", "ha", "r"};
        String con= ConcatenateStringsUsingStringBuffer_01.concatenateString(arr);
        assertEquals("ojasjohar",con);
    }

}
