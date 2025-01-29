package circular_linked_list.task_scheduler;

public class TaskScheduler_03 {
    public static void main(String[] args) {
        TaskCircularLinkList taskList =new TaskCircularLinkList();
        taskList.addAtBeginning(101, "Task 1", 2, "2025-02-10");
        taskList.addAtEnd(102, "Task 2", 1, "2025-02-15");
        taskList.addAtPosition(2, 103, "Task 3", 3, "2025-02-20");
        taskList.displayTasks();

        System.out.println("\nViewing tasks:");
        taskList.viewCurrentTask();

        taskList.deleteByTaskId(102);
        System.out.println("\nAfter removing task with Task ID 102:");
        taskList.displayTasks();

        System.out.println("\nSearch tasks by Priority 3:");
        taskList.searchByPriority(3);
    }
}
