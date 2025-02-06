package string_buider;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.stringbuilder.remove_duplicate_from_a_string.RemoveDuplicatesUsingStringBuilder_02;

public class RemoveDuplicatesTest {

    @Test
    void removingTest(){
        String s="Hello, My name is OjasJohar";
        String rev= RemoveDuplicatesUsingStringBuilder_02.removeDuplicates(s);
        assertEquals("Helo, MynamisOjJhr",rev);
    }

}
