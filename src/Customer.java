
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
        
        String result = String.format("Rental Record for %s\n", this.name);
        result += "\tTitle\t\tDays\tAmount\n";

        for (Rental rental : rentals) {
            double thisAmount = 0;
            //determine amounts for each line
            thisAmount = rental.getRentalPrice();
            // add frequent renter points
            renterPoints ++;
            // add bonus for a two day new release rental
            if ((rental.getMovie().getPriceCode() == PriceCode.NEW_RELEASE) && rental.getDaysRented() > 1)
                renterPoints++;
            //show figures for this rental
            result += String.format("\t%s\t\t%s\t%s\n", rental.getMovie().getTitle(), rental.getDaysRented(), String.valueOf(thisAmount));
            total += thisAmount;
        }
        //add footer lines
        result += String.format("Amount owed is %s\n", total);
        result += String.format("You earned %s frequent renter points", renterPoints);
        return result;
    }

}
    