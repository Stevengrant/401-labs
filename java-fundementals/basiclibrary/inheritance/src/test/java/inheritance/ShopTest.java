package inheritance;


import org.junit.Test;
import static org.junit.Assert.*;

public class ShopTest {
    // Add tests for the basics of your Shop class.
    @Test public void test_shop_constructor(){
        Shop testThis = new Shop("Macys", "Department Store", 2);
        assertTrue("should work like every other constructor",testThis.name.equals("Macys"));
        assertTrue("should work like every other constructor",testThis.description.equals("Department Store"));
        assertEquals("should work like every other constructor",testThis.priceCategory, 2);
    }

    // Add tests for the basics of your Shop class.
    @Test public  void test_shop_toString(){
        Shop testThis = new Shop("Macys", "Department Store", 2);
        assertTrue("should return a string when to string is called", testThis.toString().equals("Macys Department Store 2"));
    }

    @Test public void test_shop_canAddReviews(){
        Shop testThis = new Shop("Macys", "Department Store", 2);
        testThis.addReview("bad","Bobby twostrings", 4.0);
        assertEquals("averageStars are correctly set",testThis.averageStars, 4,0.0001);
        testThis.addReview("the best i've ever seen!!!!1!", "doug doesNotUnderstanHowReviewsWork",1.0);
        assertEquals("averageStars are correctly set",testThis.averageStars, 2.5,0.0001);

    }
}

