package recursive_vs_iterative_fibonacci_computation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_RecursiveVsIterative_05 {

    @Test
    void test05A() {
        int res=RecursiveVsIterativeFibonacciComputation_05.fibonacciIterative(6);
        int output = 8;
        Assertions.assertEquals(output, res);
    }

    @Test
    void test05B(){
        int res = RecursiveVsIterativeFibonacciComputation_05.fibonacciRecursive(7);
        int output = 13;
        Assertions.assertEquals(output, res);
    }
}
