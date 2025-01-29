package singly_linked_list.student_record_management;

public class StudentRecordManagement_01 {

    public static void main(String[] args){
        //Creating StudentLinkedList class's object.
        StudentLinkedList list=new StudentLinkedList();

        //Calling Methods:
        list.addAtStart(34, "Ojas Johar", 21, "A");
        list.addAtEnd(36, "Om Tarmakar", 22, "C");
        list.addAtStart(2,"Anush Tenguriya", 21, "B");
        list.addToSpecific(1, 13, "Anush Sharma", 23, "D");

        list.displayRecord();
        list.deleteByRollName(13);

        list.displayRecord();
        list.searchRecord(34);

        list.updateGrade(36, "B");
        list.displayRecord();
    }
}
