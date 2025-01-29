package singly_linked_list.student_record_management;

public class StudentLinkedList {
    //Creating head to work with node(StudentNode).
    StudentNode head;

    public void addAtStart(int rollNumber, String name, int age, String grade){
        System.out.println("Adding Student Record");
        //(newNode) is the reference of object to create a node.
        StudentNode newNode=new StudentNode(rollNumber, name, age, grade);
        //joining with existing node or null node.
        newNode.next=head;
        //then making itself the head.
        head=newNode;
    }

    public void addAtEnd(int rollNumber, String name, int age, String grade){
        System.out.println("Adding Student Record");
        StudentNode newNode=new StudentNode(rollNumber, name, age, grade);
        if(head==null){
            //because of null it works like addAtStart().
            newNode.next=head;
            head=newNode;
        }
        else{
            StudentNode temp=head;
            while(temp.next!=null){
                //reaching the end of nodes.
                temp=temp.next;
            }
            //Adding the new node after the last node(.next).
            temp.next=newNode;
        }
    }

    public void addToSpecific(int position, int rollNumber, String name, int age, String grade){
        System.out.println("Adding Student Record");
        StudentNode newNode=new StudentNode(rollNumber, name, age, grade);
        if(position<0){
            System.out.println("Invalid input .");
            return;
        }
        if(position==0){
            addAtStart(rollNumber, name, age, grade);
            return;
        }
        StudentNode temp=head;
        for(int i=0;temp!=null && i<position-1;i++){
            temp=temp.next;
        }
        if(temp==null){
            System.out.println("Out Of Range .");
            return;
        }
        //joining new node with the right side node first.
        newNode.next=temp.next;
        //then joining the current node with the new node.
        temp.next=newNode;

    }

    public void deleteByRollName(int rollNumber){
        if(head==null){
            System.out.println("List is empty .");
            return;
        }
        if(head.rollNumber== rollNumber){
            head=head.next;
            System.out.println("Node with roll number "+ rollNumber+ " is deleted. ");
            return;
        }
        StudentNode temp=head;
        while(temp.next!=null){
            if(temp.next.rollNumber==rollNumber){
                System.out.println("Node with roll number "+ rollNumber+ " is deleted. ");
                //here we are deleting the node by standing at the node before it.
                temp.next=temp.next.next;
                return;
            }
            temp=temp.next;
        }
        System.out.println("Node with roll number"+ rollNumber+ " not found. ");
    }

    public void searchRecord(int rollNumber){
        //Way to make temp.
        StudentNode temp=head;
        while(temp!=null){
            if(temp.rollNumber==rollNumber){
                System.out.println("Node with Roll Number "+rollNumber+ "found.");
                return;
            }
            temp=temp.next;
        }
        System.out.println("Roll number is not present.");
    }

    public void displayRecord(){
        StudentNode temp=head;
        System.out.println("----Student Records----");
        while(temp!=null){
            System.out.println("Roll Number:"+temp.rollNumber);
            System.out.println("Name       :"+temp.name);
            System.out.println("Age        :"+temp.age);
            System.out.println("Grade      :"+temp.grade);
            temp=temp.next;
        }
    }

    public void updateGrade(int rollNumber, String grade){
        //Way to make temp.
        StudentNode temp=head;
        while(temp!=null){
            if(temp.rollNumber==rollNumber){
                System.out.println("Grade of Roll Number "+rollNumber+ " is "+temp.grade);
                System.out.println("After the update...");
                System.out.println("\nUpgraded Grade :"+ grade);
                temp.grade=grade;
                return;
            }
            temp=temp.next;
        }
        System.out.println("Roll number is not present.");
    }
}
