package com.invoice;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class InvoiceGeneratorTest {
	
	InvoiceGenerator invoiceGenerator;
    @Before
    public void setUp() {
         invoiceGenerator = new InvoiceGenerator();
    }

	// --------test for return total fare-------------
	@Test
	public void givenDistanceAndTime_ShouldReturnTotalFare() {
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
		// variable declare and assign
		double distance = 0.1;
		int time = 1;
		// calculate total fare
		double fare = invoiceGenerator.calculateFare(distance, time);
		double expected = 5;
		Assert.assertEquals(expected, fare, 0.0);
	}

	// -------test for multiple ride, return total fare------------

//	@Test
//	public void givenMultipleRides_ShouldReturnTotalFare() {
//		Ride[] rides = { new Ride(2.0, 5),
//				         new Ride(0.1, 1) };
//		double fare = invoiceGenerator.calculateFare(rides);
//		Assert.assertEquals(30, fare, 0.0);
//	}
	
	@Test
	public void givenMultipleRides_ShouldReturnInvoiceSummery() {
		Ride[] rides = { new Ride(2.0, 5),
				         new Ride(0.1, 1)};
		InvoiceSummary summary = invoiceGenerator.calculateFare(rides);
		InvoiceSummary expectedInvoiceSummery=new InvoiceSummary(2,30);
		Assert.assertEquals(expectedInvoiceSummery,summary);
	}

}
