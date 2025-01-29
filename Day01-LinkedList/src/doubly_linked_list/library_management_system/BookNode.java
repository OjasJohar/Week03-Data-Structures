package doubly_linked_list.library_management_system;

public class BookNode {
    String bookTitle;
    String author;
    String genre;
    int bookID;
    String availabilityStatus;
    BookNode next;
    BookNode prev;

    public BookNode(String bookTitle,String author,String genre,int bookID, String availabilityStatus){
        this.bookTitle=bookTitle;
        this.author=author;
        this.genre=genre;
        this.bookID=bookID;
        this.availabilityStatus=availabilityStatus;
        this.next=null;
        this.prev=null;
    }
}
