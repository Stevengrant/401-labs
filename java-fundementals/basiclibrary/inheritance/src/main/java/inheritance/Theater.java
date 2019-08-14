package inheritance;

import java.util.ArrayList;

public class Theater implements Business{
    public  String description;
    public  int priceCategory;
    //Theater should have a name and all of the movies currently showing there.
    public String name;
    public ArrayList<String> movies = new ArrayList<>();
    ArrayList<Review> reviews = new ArrayList<>();
    public Double averageStars;

    public Theater(String name, String description, int priceCategory ) {
        this.name = name;
        this.description = description;
        this.priceCategory = priceCategory;
    }
    @Override
    public void addReview(String body, String author, Double stars) {
    Review review = new Review(body, author, stars);
        this.reviews.add(review);

        if (this.averageStars == null){
            this.averageStars = stars;
        } else {
            this.averageStars = (this.averageStars + stars)/2;
        }
    }
    public void addReview(String body, String author, Double stars, String movie) {
        Review review = new MovieReview(body, author, stars,movie);
        this.reviews.add(review);

        if (this.averageStars == null){
            this.averageStars = stars;
        } else {
            this.averageStars = (this.averageStars + stars)/2;
        }
    }
    public void addMovie(String movie){
        movies.add(movie);
    }
    public void removeMovie(String movie){
        movies.remove(movie);
    }
    public String toString(){

    return  this.name + " showing: " + this.movies.size() + " movies.";
    }
}
