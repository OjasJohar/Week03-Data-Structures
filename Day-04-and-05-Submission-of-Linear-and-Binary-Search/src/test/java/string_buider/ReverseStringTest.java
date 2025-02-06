package string_buider;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.stringbuilder.reverse_a_string.ReverseStringUsingStringBuilder_01;

public class ReverseStringTest {

    @Test
    void reverseTest(){
        String s="Hello world";
        String rev= ReverseStringUsingStringBuilder_01.reverseString(s);
        assertEquals("dlrow olleH",rev);
    }
}
