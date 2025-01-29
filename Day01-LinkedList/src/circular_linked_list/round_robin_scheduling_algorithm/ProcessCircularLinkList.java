package circular_linked_list.round_robin_scheduling_algorithm;

public class ProcessCircularLinkList {
    private Process head,tail;

    ProcessCircularLinkList(){
        this.head=null;
        this.tail=null;
    }

    //1.method to add a new process at the end of circular link list
    public void addProcess(int processID, int burstTime, int priority){
        Process newNode=new Process(processID,burstTime,priority);
        if(head==null){
            head=newNode;
            tail=newNode;
            return;
        }
        tail.next=newNode;
        newNode.next=head;
        tail=newNode;
    }

    //2.method to remove a process by process ID
    public void removeProcess(int processID){
        if(head==null){
            System.out.println("There is no process in the waiting.");
            return;
        }
        Process current=head,prev=null;
        do{
            if(current.processID==processID){
                if(current==head){
                    tail.next=head.next;
                    head=head.next;
                    return;
                }
                if(current==tail){
                    prev.next=head;
                    tail=prev;
                }else{
                    prev.next=current.next;
                }
                return;
            }
            prev=current;
            current=current.next;
        }while(current!=head);
    }

    //helping method to count number of process;
    public int countProcess(){
        if(head==null){
            return 0;
        }
        Process temp=head;
        int count=0;
        do{
            count++;
            temp=temp.next;
        }while(temp!=head);
        return count;
    }

    //3.method to simulate the scheduling of processes in a round-robin manner with a fixed time quantum
    public void roundRobinScheduling(int quantumTime){
        if(head==null){
            System.out.println("There is no process, list is already empty.");
            return;
        }
        Process current=head;
        int totalTurnaroundTime=0, totalWaitingTime=0, completedProcesses=0;
        int totalProcess=countProcess();

        while(totalProcess>0){
            if (current.burstTime > 0) {
                int executionTime = Math.min(current.burstTime, quantumTime);
                current.burstTime -= executionTime;
                System.out.println("Executing Process " + current.processID + " for " + executionTime + "ms.");
                if (current.burstTime == 0) {
                    totalTurnaroundTime += executionTime + totalWaitingTime;
                    totalWaitingTime += totalTurnaroundTime - executionTime;
                    removeProcess(current.processID);
                    totalProcess--;
                    completedProcesses++;
                }
            }
            current = current.next;
        }
        System.out.println("Average Waiting Time: " + (double) totalWaitingTime / completedProcesses);
        System.out.println("Average Turnaround Time: " + (double) totalTurnaroundTime / completedProcesses);
    }
}
