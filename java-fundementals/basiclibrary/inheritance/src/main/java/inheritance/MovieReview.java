package inheritance;

public class MovieReview extends Review  {
    String movie;
    public MovieReview(String body, String author, Double stars, String movie) {
        super(body, author, stars);
        this.movie = movie;

    }
}
