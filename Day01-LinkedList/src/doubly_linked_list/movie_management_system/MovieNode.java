package doubly_linked_list.movie_management_system;

public class MovieNode {
    String movieTitle;
    String director;
    int yearOfRelease;
    double rating;
    MovieNode next;
    MovieNode prev;


    public MovieNode(String movieTitle, String director, int yearOfRelease, double rating) {
        this.movieTitle = movieTitle;
        this.director = director;
        this.yearOfRelease = yearOfRelease;
        this.rating = rating;
        this.next=null;
        this.prev=null;
    }
}
