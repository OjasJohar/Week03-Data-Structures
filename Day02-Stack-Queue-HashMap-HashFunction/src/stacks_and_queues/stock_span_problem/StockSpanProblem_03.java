package stacks_and_queues.stock_span_problem;

import java.util.Stack;

public class StockSpanProblem_03 {

    public static int[] calculateSpan(int[] prices) {
        int n = prices.length;
        int[] span = new int[n];  // Result array
        Stack<Integer> stack = new Stack<>(); // Stack to store indices

        for (int i = 0; i < n; i++) {
            // Pop elements from stack while they have a smaller or equal price
            while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
                stack.pop();
            }

            // Calculate span
            span[i] = stack.isEmpty() ? (i + 1) : (i - stack.peek());

            // Push current index onto stack
            stack.push(i);
        }

        return span;
    }

    public static void main(String[] args) {
        int[] prices = {100, 80, 60, 70, 60, 75, 85,72};
        int[] result = calculateSpan(prices);

        // Print the spans
        for (int span : result) {
            System.out.print(span + " ");
        }
    }
}
