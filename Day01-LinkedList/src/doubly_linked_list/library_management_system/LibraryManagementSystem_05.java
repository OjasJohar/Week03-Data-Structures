package doubly_linked_list.library_management_system;

public class LibraryManagementSystem_05 {

    public static void main(String[] args){

        BookLinkedList list=new BookLinkedList();
        list.addAtBeginning("Java", "Ojas", "Study",22, "Available");
        list.addAtBeginning("C++", "Johar", "Study",11, "Avalable");
        list.addAtEnd("Python", "Anush", "Study",27, "Avalable");
        list.addAtSpecific(1, "Rust", "Sejal", "Study", 34, "Avalable");
        list.display();
        list.countBooks();

        list.removeByBookID(11);
        list.display();

        list.searchByBookTitle("Java");
        list.updateAvailabilityStatus(22, "Not Available");
        list.displayBackward();
        list.countBooks();
    }
}
