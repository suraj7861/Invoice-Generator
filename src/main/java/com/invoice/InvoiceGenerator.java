package com.invoice;

public class InvoiceGenerator {
	// variable declare and assign
	private int costPerTime = 1;
	private double minimumCostPerKilometer = 10;
	private double minimumFare = 5;

	// method: calculate fare
	public double calculateFare(double distance, int time) {
		double totalFare = distance * minimumCostPerKilometer + time * costPerTime;
		if (totalFare < minimumFare) {
			return minimumFare;
		}
		return totalFare;
	}
}
