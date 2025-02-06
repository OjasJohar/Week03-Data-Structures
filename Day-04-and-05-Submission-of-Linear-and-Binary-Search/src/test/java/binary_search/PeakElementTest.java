package binary_search;

import org.binary_search.find_peak_element_in_array.FindPeakElementInArray_02;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PeakElementTest {

    @Test
    void peakTest(){
        int[] arr = {1, 2, 4, 5, 7, 8, 3};
        int value= FindPeakElementInArray_02.peakElement(arr);

        assertEquals(8,value);
    }
}
