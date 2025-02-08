package recursive_vs_iterative_fibonacci_computation;

public class RecursiveVsIterativeFibonacciComputation_05 {

    public static void main(String[] args) {
        long startTime, endTime;
        System.out.println("Comparing Recursive Vs Iterative :");

        int[] nums={10, 30, 50};
        for(int i=0; i<nums.length; i++){
            startTime=System.nanoTime();
            int x=fibonacciIterative(nums[i]);
            endTime=System.nanoTime();
            System.out.println("Iterative :"+(double)(endTime-startTime)/1000+" ms");

            startTime=System.nanoTime();
            int y=fibonacciRecursive(nums[i]);
            endTime=System.nanoTime();
            System.out.println("Recursive :"+(double)(endTime-startTime)/1000+" ms");
            System.out.println("----------------------------");
        }
    }

    public static int fibonacciIterative(int n) {
        int a= 0, b = 1, sum;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }

    public static int fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }
}
