package se.kth.iv1350.seminar4.source.view;

import se.kth.iv1350.seminar4.source.integration.TotalRevenueObserver;

/**
 * A simple view that displays the total income.
 */

public class TotalRevenueView implements TotalRevenueObserver {

    private double totalRevenue;

    /**
     * Creates an instance of the TotalRevenueView.
     */

    public TotalRevenueView() {
        totalRevenue = 0;
    }

    /**
     * Updates the total income.
     * @param totalRevenue The total income.
     */

    @Override
    public void updateTotalRevenue(double totalRevenue) {
        this.totalRevenue = totalRevenue;
        printCurrentState();
    }

    /**
     * Prints the current state of the total income.
     */

    private void printCurrentState() {
        System.out.println("Total Revenue: " + String.format("%.2f", totalRevenue));
    }
}
