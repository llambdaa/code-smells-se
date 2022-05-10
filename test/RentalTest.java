import org.junit.Test;

import static org.junit.Assert.*;

public class RentalTest {
    
    @Test
    public void getRentalPrice() {
        Movie movie = new Movie("Nightmare Before Christmas", PriceCode.NEW_RELEASE);
        Rental rental = new Rental(movie, 10);
        assertEquals(rental.getRentalPrice(), 30, 0.0);
        
        movie = new Movie("Caroline", PriceCode.REGULAR);
        rental = new Rental(movie, 10);
        assertEquals(rental.getRentalPrice(), 14, 0.0);
        
        movie = new Movie("Paw Patrole", PriceCode.CHILDREN);
        rental = new Rental(movie, 10);
        assertEquals(rental.getRentalPrice(), 12, 0.0);
    }
    
}