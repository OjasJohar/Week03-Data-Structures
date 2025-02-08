package comparing_different_data_structures_for_searching;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_ComparingDataStructures_06 {

    @Test
    void test06A(){
        long res=ComparingDataStructures_06.forArray(100000);
        Assertions.assertTrue(res>0);
    }

    @Test
    void test06B(){
        long res=ComparingDataStructures_06.forHashSet(100000);
        Assertions.assertTrue(res>0);
    }

    @Test
    void test06C(){
        long res=ComparingDataStructures_06.forTreeSet(100000);
        Assertions.assertTrue(res>0);
    }

    @Test
    void test06D(){
        long res1=ComparingDataStructures_06.forArray(100000);
        long res2=ComparingDataStructures_06.forHashSet(100000);
        long res3=ComparingDataStructures_06.forTreeSet(100000);
        Assertions.assertTrue(res1>res2 && res2<res3);
    }
}
