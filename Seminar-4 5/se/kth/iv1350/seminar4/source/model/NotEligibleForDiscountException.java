package se.kth.iv1350.seminar4.source.model;

public class NotEligibleForDiscountException extends Exception{

    public NotEligibleForDiscountException(int personalID) {
        super("Person born: " + personalID + " is not eligible for discount.");
    }
}
