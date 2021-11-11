package com.invoice;

public class InvoiceSummary {
    private final double totalFare;
    private final int numOfRides;
    private final double average;

    // Parameterized constructor
    public InvoiceSummary(int numOFRides, double totalFare) {
        this.numOfRides = numOFRides;
        this.totalFare = totalFare;
        this.average = this.totalFare / this.numOfRides ;
    }

     //overridden equal method to check two objects are equal or not 
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InvoiceSummary that = (InvoiceSummary) o;
        return Double.compare(that.totalFare, totalFare) == 0 && numOfRides == that.numOfRides && Double.compare(that.average, average) == 0;
    }

}
