package binary_search;

import org.binary_search.find_rotation_point_in_rotated_sorted_array.FindRotationPoint_01;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FindRotationTest {

   @Test
   void binarySearchTest(){
      FindRotationPoint_01 obj=new FindRotationPoint_01();
      int[] arr1={5,6,7,8,9,1,2,3,4};
      int smallest=obj.binarySearch(arr1);
      assertEquals(1,smallest);
   }
}
