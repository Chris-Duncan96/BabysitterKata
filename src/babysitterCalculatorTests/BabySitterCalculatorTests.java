package babysitterCalculatorTests;

import babysitterCalculator.babysitterCalculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BabySitterCalculatorTests {
	
	@Test
	void testCalculatePaymentWhenGiven5to12WithBedAt5Returns56() {
		int actualDollarsEarned = babysitterCalculator.CalculatePayment(5, 5, 12);
		int expectedDollarsEarned = 56;
		assertEquals(expectedDollarsEarned, actualDollarsEarned);
	}
	
	@Test
	void testCalculatePaymentWhenGiven6to11WithBedAt6Returns40() {
		int actualDollarsEarned = babysitterCalculator.CalculatePayment(6,6,11);
		int expectedDollarsEarned = 40;
		assertEquals(expectedDollarsEarned, actualDollarsEarned);
	}
	
	@Test
	void testCalculatePaymentWhenGiven12to1WithBedAt12Returns16() {
		int actualDollarsEarned = babysitterCalculator.CalculatePayment(12,12,1);
		int expectedDollarsEarned = 16;
		assertEquals(expectedDollarsEarned, actualDollarsEarned);
	}
	
	@Test
	void testCalculatePaymentWhenGiven11to1WithBedAt11Returns24() {
		int actualDollarsEarned = babysitterCalculator.CalculatePayment(11,11,1);
		int expectedDollarsEarned = 24;
		assertEquals(expectedDollarsEarned, actualDollarsEarned);
	}
	
	@Test
	void testCalculatePaymentReturnsWhenGiven10to12WithBedAt11Returns20() {
		int actualDollarsEarned = babysitterCalculator.CalculatePayment(10,11,12);
		int expectedDollarsEarned = 20;
		assertEquals(expectedDollarsEarned, actualDollarsEarned);
	}
	
	@Test
	void testCalculatePaymentReturnsWhenGiven12to4WithBedAt1Returns64() {
		int actualDollarsEarned = babysitterCalculator.CalculatePayment(12,1,4);
		int expectedDollarsEarned = 64;
		assertEquals(expectedDollarsEarned, actualDollarsEarned);
	}

}
