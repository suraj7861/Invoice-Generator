package com.invoice;

import org.junit.Assert;
import org.junit.Test;

public class InvoiceGeneratorTest {

	// --------test for return total fare-------------
	@Test
	public void givenDistanceAndTime_ShouldReturnTotalFare() {
		// object creation
		InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
		// variable declare and assign
		double distance = 2.0;
		int time = 5;
		// calculate total fare
		double fare = invoiceGenerator.calculateFare(distance, time);
		double expected = 25;
		Assert.assertEquals(expected, fare, 0.0);
	}

	// -------test for return minimum fare-------------
	@Test
	public void GivenLessDistanceAndTime_ShouldReturnMinFare() {
		// object creation
		InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
		// variable declare and assign
		double distance = 0.1;
		int time = 1;
		// calculate total fare
		double fare = invoiceGenerator.calculateFare(distance, time);
		double expected = 5;
		Assert.assertEquals(expected, fare, 0.0);
	}

}
