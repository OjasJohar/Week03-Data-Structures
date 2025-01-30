package stacks_and_queues.implement_queue_using_stacks;

public class ImplementQueueUsingStacks_01 {

    public static void main(String[] args) {
        QueueUsingStack queue=new QueueUsingStack();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println(queue.dequeue());
        System.out.println(queue.peek());
        System.out.println(queue.dequeue());
        System.out.println(queue.isEmpty());
        System.out.println(queue.dequeue());
        System.out.println(queue.isEmpty());

    }
}