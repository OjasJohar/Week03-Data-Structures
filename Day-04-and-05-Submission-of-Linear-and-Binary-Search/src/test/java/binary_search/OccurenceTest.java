package binary_search;

import org.binary_search.find_first_and_last_occurrence_of_element.FindFirstAndLastOccurrence_04;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OccurenceTest {

    @Test
    void firstOccurrence(){

        int[] arr={1,2,4,6,7,7,8,9,9,9};
        int target=9;
        int firstIndex= FindFirstAndLastOccurrence_04.firstOccurrence(arr,target);

        assertEquals(7,firstIndex);
    }

    @Test
    void lastOccurrence(){

        int[] arr={1,2,4,6,7,7,8,9,9,9};
        int target=9;
        int lastIndex=FindFirstAndLastOccurrence_04.lastOccurrence(arr,target);

        assertEquals(9,lastIndex);
    }
}
