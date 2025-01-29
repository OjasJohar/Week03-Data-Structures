package doubly_linked_list.movie_management_system;

public class MovieManagementSystem_02{

    public static void main(String[] args) {
        MovieLinkedList list = new MovieLinkedList();
        //Calling method:
        list.addAtBeginning("BatMan","Ojas johar",2018,7.9);
        list.addAtEnd("KGF","Anush Tenguriya",2017,9.1);
        list.addAtPosition(1,"KGF2","Anush Tenguriya1",2024,9.2);
        list.addAtBeginning("Aadipurush","Om Tamrakar",2024,4.1);
        list.displayForward();
        list.displayBackward();

        list.searchByDirector("Anush Tenguriya");
        list.searchByRating(4.1);
        list.deleteByMovieTitle("KGF");
        list.updateRating("BatMan",8.7);
        list.displayForward();
        list.displayBackward();

    }
}
