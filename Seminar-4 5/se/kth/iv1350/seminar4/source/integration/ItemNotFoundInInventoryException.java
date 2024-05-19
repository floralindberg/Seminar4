package se.kth.iv1350.seminar4.source.integration;

public class ItemNotFoundInInventoryException extends Exception {

    public ItemNotFoundInInventoryException(int codeOfItem) {
        super("\n" + "Unable to add item " + codeOfItem + " since it does not exist in inventory");
    } 
}
