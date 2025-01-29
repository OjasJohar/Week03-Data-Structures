package singly_linked_list.student_record_management;

public class StudentNode {
    int rollNumber;
    String name;
    int age;
    String grade;
    StudentNode next;

    //Imagine it as a node that carries below-mentioned attributes.
    public StudentNode(int rollNumber, String name, int age, String grade){
        this.rollNumber=rollNumber;
        this.name=name;
        this.age=age;
        this.grade=grade;
        this.next=null;//Meaning it is not pointing to anyone.
    }
}
