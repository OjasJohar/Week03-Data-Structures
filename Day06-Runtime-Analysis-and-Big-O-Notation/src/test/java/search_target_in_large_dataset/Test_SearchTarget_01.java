package search_target_in_large_dataset;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_SearchTarget_01 {

    @Test
    void test01A(){
        int[] arr=new int[1000];
        for(int j=0; j<arr.length;j++){
            arr[j]=j+1;
        }
        long time=SearchTargetInLargeDataset_01.linearSearch(arr);
        Assertions.assertTrue(time>0);
    }
    @Test
    void test01B(){
        int[] arr=new int[1000];
        for(int j=0; j<arr.length;j++){
            arr[j]=j+1;
        }
        long time=SearchTargetInLargeDataset_01.binarySearch(arr);
        Assertions.assertTrue(time>0);
    }
    @Test
    void test01C(){
        int[] arr=new int[1000];
        for(int j=0; j<arr.length;j++){
            arr[j]=j+1;
        }
        long time1=SearchTargetInLargeDataset_01.binarySearch(arr);
        long time2=SearchTargetInLargeDataset_01.linearSearch(arr);
        Assertions.assertTrue(time2>time1);
    }
}
