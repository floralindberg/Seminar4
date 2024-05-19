package se.kth.iv1350.seminar4.source.integration;


public class InventoryFailureException extends RuntimeException {

    public InventoryFailureException () {
        super("\n" + "External inventory system cannot be reached ");
    }
    
}

