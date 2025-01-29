package doubly_linked_list.library_management_system;

public class BookLinkedList {
    private BookNode head;
    private BookNode tail;

    public void addAtBeginning(String bookTitle,String author,String genre,int bookID, String availabilityStatus){
        BookNode node=new BookNode(bookTitle, author, genre, bookID, availabilityStatus);
        if(head==null){
            head=node;
            tail=node;
            //tail.prev=head;
            return;
        }
        //Adding to head
        node.next=head;
        //from head adding the node at prev
        head.prev=node;
        //assigning node the head.
        head=node;
    }

    public void addAtEnd(String bookTitle,String author,String genre,int bookID, String availabilityStatus){
        BookNode node=new BookNode(bookTitle, author, genre, bookID, availabilityStatus);
        if(tail==null){
            tail=node;
        }
        //adding node at end
        tail.next=node;
        //adding tail to node's prev
        node.prev=tail;
        //making node the tail
        tail=node;
    }

    public void addAtSpecific(int position, String bookTitle,String author,String genre,int bookID, String availabilityStatus){
        BookNode node=new BookNode(bookTitle, author, genre, bookID, availabilityStatus);
        if(position<0){
            System.out.println("Invalid Request");
            //To stop the function here.
            return;
        }
        if(position==0){
            addAtBeginning(bookTitle, author, genre, bookID, availabilityStatus);
            //To stop the function here.
            return;
        }
        BookNode temp=head;
        for(int i=0;temp!=null && i<position-1;i++){
            temp=temp.next;
        }
        node.next=temp.next;
        temp.next=node;
        node.prev=temp;
        temp.next.next.prev=node;
    }

    public void removeByBookID(int bookID){
        if(head.bookID==bookID){
            System.out.println("Removing node with id "+bookID);
            head=head.next;
            head.prev=null;
            return;
        }
        BookNode temp=head;
        System.out.println("Removing node with id "+bookID);
        while(temp!=null){
            if(temp.bookID==bookID){
                temp=temp.prev;
                if(temp.next.next!=null) {
                    temp.next=temp.next.next;
                    temp.next.prev=temp;
                }
                else{
                    temp.next=null;
                }
                return;
            }
            temp=temp.next;
        }
    }

    public void display(){
        BookNode temp=head;
        while(temp!=null){
            System.out.println("---Book Details---");
            System.out.println("Title  :"+temp.bookTitle);
            System.out.println("Author :"+temp.author);
            System.out.println("Genre  :"+temp.genre);
            System.out.println("Book Id:"+temp.bookID);
            System.out.println("Availability:"+temp.availabilityStatus);
            temp=temp.next;
        }
    }

    //method to Search for a book by Book Title.
    public void searchByBookTitle(String bookTitle){
        BookNode temp=head;
        while(temp!=null){
            if(temp.bookTitle.equals(bookTitle)){
                System.out.println("Book Found : Title = " +temp.bookTitle + ", Author = " + temp.author + ", Genre = "
                        + temp.genre + ", BookId = " + temp.bookID + ", availability = " + temp.availabilityStatus);
                return;
            }
            temp=temp.next;
        }
        System.out.println("Book with title " + bookTitle + " not found.");
    }

    //method to update a book’s Availability Status by book ID
    public void updateAvailabilityStatus(int bookID, String availabilityStatus){
        BookNode temp=head;
        while(temp!=null){
            if(temp.bookID==bookID){
                temp.availabilityStatus = availabilityStatus;
                System.out.println("Book's availability status with id " + bookID +" is updated.");
                return;
            }
            temp=temp.next;
        }
        System.out.println("Book with id " + bookID + " not found.");
    }

    //method to display all books in backward order.
    public void displayBackward(){
        BookNode temp=tail;
        System.out.println("Books record in backward order.\n");
        while(temp!=null){
            System.out.println("ID       :" +temp.bookID);
            System.out.println("Title    :" +temp.bookTitle);
            System.out.println("Author   :" +temp.author);
            System.out.println("Genre    :" +temp.genre);
            System.out.println("Availability status:" +temp.availabilityStatus + "\n");
            temp=temp.prev;
        }
    }

    //method to count total number of books.
    public int countBooks(){
        int bookCount=0;
        BookNode temp=head;
        while(temp!=null){
            bookCount++;
            temp=temp.next;
        }
        System.out.println("Total Books Count :"+bookCount);
        return bookCount;
    }
}