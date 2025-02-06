package linear_search;

import org.junit.jupiter.api.Test;
import org.linear_search.search_for_specific_word_in_list_of_sentences.SearchSpecificWord_02;


import static  org.junit.jupiter.api.Assertions.*;
public class SpecificWordTest {

    @Test
    void specificWordSentenceTest(){
        String[] sentences=new String[5];
        sentences[0]="Hello world";
        sentences[1]="Good morning sir";
        sentences[2]="How are you";
        sentences[3]="Today the sky looks beautiful";
        sentences[4]="you are welcome";

        String word="you";
        String found= SearchSpecificWord_02.linearSearch(sentences,word);
        assertEquals("How are you", found);
    }
}
