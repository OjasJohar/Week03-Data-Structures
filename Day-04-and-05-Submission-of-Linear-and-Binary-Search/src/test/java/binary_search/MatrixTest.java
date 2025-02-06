package binary_search;

import org.binary_search.search_target_value_in_2d_sorted_matrix.SearchTargetValue_03;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MatrixTest {

    @Test
    void matrixSearchTest(){
        int row=5,column=5;
        int[][] arr=new int[row][];
        arr[0]=new int[]{1,2,3,4,5};
        arr[1]=new int[]{6,7,8,9,10};
        arr[2]=new int[]{11,12,13,14,15};
        arr[3]=new int[]{16,17,18,19,20};
        arr[4]=new int[]{21,22,23,24,25};

        int target1=21;
        int target2=36;
        SearchTargetValue_03 obj=new SearchTargetValue_03();
        boolean found1=obj.binarySearchMatrix(arr,target1);
        assertEquals(true,found1);

        boolean found2=obj.binarySearchMatrix(arr,target2);
        assertEquals(false,found2);

    }
}
