package se.kth.iv1350.seminar4.source.model;

public class notEligibleForDiscountException extends Exception{

    public notEligibleForDiscountException(int personalID) {
        super("Person born: " + personalID + " is not eligible for discount.");
    }
}
