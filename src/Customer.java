
import java.lang.*;
import java.util.*;

class Customer {
    private String name;
    private List<Rental> rentals;
    
    public Customer (String name){
        this.name = name;
        this.rentals = new ArrayList<>();
    }
    
    public void addRental(Rental rental) {
        rentals.add(rental);
    }
    
    public String getStatement() {
        double total = 0;
        int renterPoints = 0;
        
        //Add Header
        String result = String.format("Rental Record for %s\n", this.name);
        result += "\tTitle\t\tDays\tAmount\n";

        //Add content
        for (Rental rental : rentals) {
            double price = rental.getRentalPrice();
            total += price;
            
            //Add rental description
            String title = rental.getMovie().getTitle();
            int rented = rental.getDaysRented();
            result += String.format("\t%s\t\t%s\t%s\n", title, rented, price);
            
            //Handle renter points
            renterPoints++;
            if (rented > 1 && rental.getMovie().getPriceCode() == PriceCode.NEW_RELEASE) {
                renterPoints++;
            }
        }
        
        //Add footer
        result += String.format("Amount owed is %s\n", total);
        result += String.format("You earned %s frequent renter points", renterPoints);
        return result;
    }

}
    