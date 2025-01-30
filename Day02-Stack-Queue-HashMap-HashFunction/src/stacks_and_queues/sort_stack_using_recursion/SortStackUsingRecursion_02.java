package stacks_and_queues.sort_stack_using_recursion;

import java.util.Stack;

public class SortStackUsingRecursion_02 {

    // Function to sort the stack recursively
    public static void sortStack(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int top = stack.pop(); // Remove the top element
            sortStack(stack); // Sort the remaining stack
            insertInSortedOrder(stack, top); // Insert the popped element in the sorted order
        }
    }

    // Helper function to insert an element in a sorted stack
    private static void insertInSortedOrder(Stack<Integer> stack, int element) {
        if (stack.isEmpty() || stack.peek() <= element) {
            stack.push(element);
        } else {
            int top = stack.pop();
            insertInSortedOrder(stack, element);
            stack.push(top);
        }
    }

    // Main method to test the sorting
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(1);
        stack.push(3);
        stack.push(2);
        stack.push(4);

        System.out.println("Original Stack: " + stack);

        sortStack(stack);

        System.out.println("Sorted Stack: " + stack);
    }
}