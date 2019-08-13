package inheritance;

public class Review {
    String body;
    String author;
    Double stars;
    public Review (String body, String author, Double stars){
        this.body = body;
        this.author = author;
        this.stars = stars;
    }
    public String toString(){
        String res = author + " : " + stars + " stars. " + body;
        System.out.println(res);
        return res;
    }
}
