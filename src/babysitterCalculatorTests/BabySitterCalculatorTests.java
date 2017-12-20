package babysitterCalculatorTests;

import babysitterCalculator.babysitterCalculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BabySitterCalculatorTests {
	
	@Test
	void testCalculatePaymentByStartEndTimesReturns56WhenGiven5to12() {
		int actualDollarsEarned = babysitterCalculator.CalculatePaymentByStartEndTimes(5,12);
		int expectedDollarsEarned = 56;
		assertEquals(expectedDollarsEarned, actualDollarsEarned);
	}
	
	@Test
	void testCalculatePaymentByStartEndTimesReturns40WhenGiven6to11() {
		int actualDollarsEarned = babysitterCalculator.CalculatePaymentByStartEndTimes(6,11);
		int expectedDollarsEarned = 40;
		assertEquals(expectedDollarsEarned, actualDollarsEarned);
	}
	
	@Test
	void testCalculatePaymentByStartEndTimesReturns16WhenGiven12to1() {
		int actualDollarsEarned = babysitterCalculator.CalculatePaymentByStartEndTimes(12,1);
		int expectedDollarsEarned = 16;
		assertEquals(expectedDollarsEarned, actualDollarsEarned);
	}
	
	@Test
	void testCalculatePaymentByStartEndTimesReturns24WhenGiven11to1() {
		int actualDollarsEarned = babysitterCalculator.CalculatePaymentByStartEndTimes(11,1);
		int expectedDollarsEarned = 24;
		assertEquals(expectedDollarsEarned, actualDollarsEarned);
	}

}
