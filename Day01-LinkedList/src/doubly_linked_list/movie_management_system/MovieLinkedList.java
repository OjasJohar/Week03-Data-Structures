package doubly_linked_list.movie_management_system;

public class MovieLinkedList {
    private MovieNode head, tail;

    MovieLinkedList(){
        this.head=null;
        this.tail=null;
    }

    //1. method to add a node at the beginning
    public void addAtBeginning(String movieTitle, String director, int yearOfRelease, double rating){
        MovieNode newNode=new MovieNode(movieTitle,director,yearOfRelease,rating);
        if(head==null){
            //newNode.next=head;
            head=newNode;
            tail=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }

    //1. method to add a node at the end;
    public void addAtEnd(String movieTitle, String director, int yearOfRelease, double rating){
        MovieNode newNode=new MovieNode(movieTitle,director,yearOfRelease,rating);
        if(head==null){
            // newNode.next=head;
            head=newNode;
            tail=newNode;
            return;
        }
        newNode.prev=tail;
        tail.next=newNode;
        tail=newNode;
    }

    //1. method to add a node at specific position
    public void addAtPosition(int position, String movieTitle, String director, int yearOfRelease, double rating){
        if(position<0){
            System.out.println("Invalid position.");
            return;
        }
        if(position==0){
            addAtBeginning(movieTitle,director,yearOfRelease,rating);
            return;
        }

        MovieNode newNode=new MovieNode(movieTitle,director,yearOfRelease,rating);
        MovieNode temp=head;
        for(int i=0;temp!=null && i<position-1;i++){
            temp=temp.next;
        }
        if(temp==null){
            System.out.println("Position overflow.");
            return;
        }
        newNode.next=temp.next;
        newNode.prev=temp;
        if(temp.next!=null){
            temp.next.prev=newNode;
        }
        temp.next=newNode;

        if(temp==tail){
            tail=newNode;
        }
    }

    //2.method to remove a node by movie title.
    public void deleteByMovieTitle(String movieTitle){
        if(head==null){
            System.out.println("List is already empty.");
            return;
        }
        if(head.movieTitle.equals(movieTitle)){
            System.out.println("Movie with title " + movieTitle + " is deleted.");
            head=head.next;
            if(head!=null) {
                head.prev = null;
            }
            return;
        }
        MovieNode temp=head;
        while(temp.next!=null){
            if(temp.next.movieTitle.equals(movieTitle)){
                MovieNode nodeToDelete = temp.next;
                if(nodeToDelete.next!=null){
                    //if the node we want to delete is not the last node.
                    nodeToDelete.next.prev=temp;
                }
                temp.next=nodeToDelete.next;
                System.out.println("Movie with tile " + movieTitle + " is deleted.");
                return;
            }
            temp=temp.next;
        }
        System.out.println("Movie with tile " + movieTitle + " is not found.");
    }

    //3. method to search Movie node by director.
    public void searchByDirector(String director){
        MovieNode temp=head;
        while(temp!=null){
            if(temp.director.equals(director)){
                System.out.println("Record Found: MovieTitle = " + temp.movieTitle + ", director = " + temp.director +
                        ", Year Of Release = " + temp.yearOfRelease + ", rating = " + temp.rating);
                return;
            }
            temp=temp.next;
        }
        System.out.println("Movie with director " + director + " not found.");
    }

    //3.method to search Movie node by rating
    public void searchByRating(double rating){
        MovieNode temp=head;
        while(temp!=null){
            if(temp.rating==rating){
                System.out.println("Record Found: MovieTitle = " + temp.movieTitle + ", director = " + temp.director +
                        ", Year Of Release = " + temp.yearOfRelease + ", rating = " + temp.rating);
                return;
            }
            temp=temp.next;
        }
        System.out.println("Movie with rating " + rating + " not found.");
    }

    //4.method to display movie records in forward order.
    public void displayForward(){
        MovieNode temp=head;
        System.out.println("Movie records in forward order.\n");
        while(temp!=null){
            System.out.println( "MovieTitle = " + temp.movieTitle + ", director = " + temp.director +
                    ", Year Of Release = " + temp.yearOfRelease + ", rating = " + temp.rating);
            temp=temp.next;
        }
        System.out.println();
    }

    //4.method to display movie records in backward order.
    public void displayBackward(){
        MovieNode temp=tail;
        System.out.println("Movie records in backward order.\n");
        while(temp!=null){
            System.out.println( "MovieTitle = " + temp.movieTitle + ", director = " + temp.director +
                    ", Year Of Release = " + temp.yearOfRelease + ", rating = " + temp.rating);
            temp=temp.prev;
        }
        System.out.println();

    }

    //5.method to update a movie rating based on movie title.
    public void updateRating(String movieTitle, double rating){
        MovieNode temp=head;
        while(temp!=null){
            if(temp.movieTitle.equals(movieTitle)){
                temp.rating=rating;
                System.out.println("Movie with title " + movieTitle + " updated.");
                return;
            }
            temp=temp.next;
        }
        System.out.println("Movie with title " + movieTitle + " not found.");
    }


}
