package circular_linked_list.task_scheduler;

public class Task {
    int taskID;
    String taskName;
    int priority;
    String dueDate;
    Task next;

    public Task(int taskID, String taskName, int priority, String dueDate) {
        this.taskID = taskID;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }
}
