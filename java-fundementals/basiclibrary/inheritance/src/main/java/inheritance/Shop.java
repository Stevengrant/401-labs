package inheritance;

import java.util.ArrayList;

public class Shop implements Business{
    //a Shop should have a name, description, and number of dollar signs.
    String name;
    String description;
    int priceCategory;
    ArrayList<Review> reviews = new ArrayList<>();

    public Double averageStars = 0.0;

    //Implement a constructor for a Shop.
    public Shop(String name, String description, int priceCategory){

        this.name = name;
        this.description = description;
        this.priceCategory = priceCategory;
    }
    public void addReview(String body, String author, Double stars){
        Review review = new Review(body,author,stars);
        this.reviews.add(review);

        if (this.averageStars == 0.0){
            this.averageStars = stars;
        } else {
            this.averageStars = (this.averageStars + stars)/2;
        }


    }

        //Implement a reasonable toString method for Shops.
    public String toString(){
        return this.name + " " + this.description + " " + this.priceCategory;
    }

}
