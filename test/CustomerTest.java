import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {
    
    @Test
    public void statement() {
        Rental first = new Rental(new Movie("First Movie", PriceCode.NEW_RELEASE), 10);
        Rental second = new Rental(new Movie("Second Movie", PriceCode.CHILDREN), 5);
        Customer customer = new Customer("joe");
        customer.addRental(first);
        customer.addRental(second);
        
        String reference = "Rental Record for joe\n" +
                           "\tTitle\t\tDays\tAmount\n" +
                           "\tFirst Movie\t\t10\t30.0\n" +
                           "\tSecond Movie\t\t5\t4.5\n" +
                           "Amount owed is 34.5\n" +
                           "You earned 3 frequent renter points";
        assertEquals(customer.statement(), reference);
    }
    
}