package stacks_and_queues.implement_queue_using_stacks;

import java.util.Stack;

public class QueueUsingStack {
    Stack<Integer> stackEnqueue;
    Stack<Integer> stackDequeue;

    QueueUsingStack(){
        this.stackEnqueue=new Stack<>();
        this.stackDequeue=new Stack<>();
    }

    public void enqueue(int value){
        stackEnqueue.push(value);
    }

    public int dequeue(){
        if(stackDequeue.isEmpty()){
            if(stackEnqueue.isEmpty()){
                throw new RuntimeException("Queue is empty.");
            }while(!stackEnqueue.isEmpty()){
                stackDequeue.push(stackEnqueue.pop());
            }
        }
        return stackDequeue.pop();
    }

    public int peek(){
        if(stackDequeue.isEmpty()){
            if(stackEnqueue.isEmpty()){
                throw new RuntimeException("Queue is empty.");
            }while(!stackEnqueue.isEmpty()){
                stackDequeue.push(stackEnqueue.pop());
            }
        }
        return stackDequeue.peek();
    }

    public boolean isEmpty(){
        return stackEnqueue.isEmpty() && stackDequeue.isEmpty();
    }
}