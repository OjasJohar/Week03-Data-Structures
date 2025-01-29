package circular_linked_list.round_robin_scheduling_algorithm;

public class RoundRobinScheduling_06 {
    public static void main(String[] args) {
        ProcessCircularLinkList processQueue = new ProcessCircularLinkList();
        processQueue.addProcess(1, 10, 1);
        processQueue.addProcess(2, 5, 2);
        processQueue.addProcess(3, 8, 3);

        int timeQuantum = 3;
        processQueue.roundRobinScheduling(timeQuantum);
    }
}
