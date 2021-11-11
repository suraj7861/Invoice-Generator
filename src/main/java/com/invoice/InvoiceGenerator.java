package com.invoice;

public class InvoiceGenerator {
	// variable declare and assign
	private static final int COST_PER_TIME = 1;
	private static final double MINIMUM_COST_PER_KILOMETER = 10;
	private static final double MINIMUM_FARE = 5;

	// method: calculate fare
	public double calculateFare(double distance, int time) {
		double totalFare = distance * MINIMUM_COST_PER_KILOMETER + time * COST_PER_TIME;
		return Math.max(totalFare, MINIMUM_FARE);
	}

	// method: calculate fare for multiple ride 
	public InvoiceSummary  calculateFare(Ride[] rides) {
		double totalFare = 0;
		for (Ride ride : rides) {
			totalFare += this.calculateFare(ride.distance,ride.time);
		}
		return new InvoiceSummary(rides.length,totalFare);
	}
}
