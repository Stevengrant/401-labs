package inheritance;

import org.junit.Test;
import static org.junit.Assert.*;

public class TheaterTest {
    Theater test = new Theater("Mobie", "A movie house", 1);

    @Test
    public void Test_Theater() {
        assertTrue("Props should be correct on instantiation", test.name.equals("Mobie"));
        assertTrue("Props should be correct on instantiation", test.description.equals("A movie house"));
        assertEquals("Props should be correct on instantiation", test.priceCategory, 1);
    }

    @Test
    public void test_addMovie() {
        test.addMovie("Babe: Pig in the city");
        test.addMovie("Kill Bill");
        test.addMovie("The Room");
        assertTrue("Should contain added movies", test.movies.get(0).equals("Babe: Pig in the city"));
        assertTrue("Should contain added movies", test.movies.get(2).equals("The Room"));
    }

    @Test
    public void test_removeMovie() {
        test.addMovie("Babe: Pig in the city");
        test.addMovie("Kill Bill");
        test.addMovie("The Room");
        assertTrue("Should remove movie", test.movies.get(1).equals("Kill Bill"));

        test.removeMovie("Kill Bill");
        assertTrue("Should remove movie", test.movies.get(1).equals("The Room"));

    }
    @Test public void test_Movies_with_normalReviews(){
        test.addReview("It was grosss", "mr clean",3.0);
        assertEquals("stars w/ 1 review", test.averageStars, 3.0,0.001);
        test.addReview("it wasn't gross", "mr dirty", 4.0);
        assertEquals("two review average correctly", test.averageStars, 3.5, 0.001);

    }
    @Test public void test_Movies_withMoviereviews(){
        test.addReview("It was grosss", "mr clean",3.0, "Home Alone 7: Death comes for Christmas.");
        assertEquals("stars w/ 1 review", test.averageStars, 3.0,0.001);
        test.addReview("it wasn't gross", "mr dirty", 4.0, "Erin Brockovich: Blood and Thunder");
        assertEquals("two review average correctly", test.averageStars, 3.5, 0.001);
    }
    @Test public void test_Movies_withMixedReviews(){
        test.addReview("It was grosss", "mr clean",3.0);
        assertEquals("stars w/ 1 review", test.averageStars, 3.0,0.001);
        test.addReview("it wasn't gross", "mr dirty", 4.0, "Erin Brockovich: Blood and Thunder");
        assertEquals("two review average correctly", test.averageStars, 3.5, 0.001);
    }
}
