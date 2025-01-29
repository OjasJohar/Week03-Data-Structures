package circular_linked_list.task_scheduler;

public class TaskCircularLinkList {
    Task head;
    TaskCircularLinkList(){
        head=null;
    }

    //1.method to add a node at beginning
    public void addAtBeginning(int taskID, String taskName, int priority, String dueDate){
        Task newNode=new Task(taskID,taskName,priority,dueDate);
        if(head==null){
            head=newNode;
            newNode.next=newNode;
            return;
        }
        Task temp=head;
        while(temp.next!=head){
            temp=temp.next;
        }
        newNode.next=head;
        temp.next=newNode;
        head=newNode;
    }

    //1.method to add a node at end
    public void addAtEnd(int taskID, String taskName, int priority, String dueDate){
        Task newNode=new Task(taskID,taskName,priority,dueDate);
        if(head==null){
            head=newNode;
            newNode.next=newNode;
            return;
        }
        Task temp=head;
        while(temp.next!=head){
            temp=temp.next;
        }
        temp.next=newNode;
        newNode.next=head;
    }

    //1.method to add a node at specific postion
    public void addAtPosition(int position,int taskID, String taskName, int priority, String dueDate){
        if(position<=0){
            addAtBeginning(taskID,taskName,priority,dueDate);
            return;
        }

        Task temp=head;
        for(int i=1;temp.next!=head && i<position-1;i++){
            temp=temp.next;
        }

        if(temp==head){
            addAtEnd(taskID,taskName,priority,dueDate);
            return;
        }

        Task newNode=new Task(taskID,taskName,priority,dueDate);
        newNode.next=temp.next;
        temp.next=newNode;
    }

    //2.method to remove a node by task id.
    public void deleteByTaskId(int taskID){
        if(head==null){
            System.out.println("List is already empty.");
            return;
        }
        //if first node is the node we want to delete
        Task temp=head;
        if(head.taskID==taskID){
            while(temp.next!=head){
                temp=temp.next;
            }
            head=head.next;
            temp.next=head;
            System.out.println("task with id " + taskID + " is deleted.");
            return;
        }

        while(temp.next!=head && temp.next.taskID!=taskID){
            temp=temp.next;
        }
        if(temp.next==head){
            System.out.println("Task with id " + taskID + " not found.");
            return;
        }
        temp.next=temp.next.next;
    }

    //??
    //3.method to view the current task and move to the next
    public void viewCurrentTask() {
        if (head == null) {
            System.out.println("No tasks in the list.");
            return;
        }
        Task temp = head;
        do {
            System.out.println("Task ID: " + temp.taskID + ", Task Name: " + temp.taskName +
                    ", Priority: " + temp.priority + ", Due Date: " + temp.dueDate);
            temp = temp.next;
        } while (temp != head);
    }

    //4.method to display all tasks in the list starting from head node
    public void displayTasks() {
        if (head == null) {
            System.out.println("No tasks in the list.");
            return;
        }
        Task temp = head;
        do {
            System.out.println("Task ID: " + temp.taskID + ", Task Name: " + temp.taskName +
                    ", Priority: " + temp.priority + ", Due Date: " + temp.dueDate);
            temp = temp.next;
        } while (temp != head);
    }

    //5. method to search for a task by Priority
    public void searchByPriority(int priority){
        Task temp=head;
        boolean found=false;
        do{
            if(temp.priority==priority){
                found=true;
                System.out.println("Task found : Task ID: " + temp.taskID + ", Task Name: " + temp.taskName +
                        ", Priority: " + temp.priority + ", Due Date: " + temp.dueDate);
            }
            temp=temp.next;
        }while(temp!=head);
        if(!found){
            System.out.println("Task with priority " + priority + " not found.");
        }
    }
}
