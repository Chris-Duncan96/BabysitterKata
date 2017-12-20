package babysitterCalculatorTests;

import babysitterCalculator.babysitterCalculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BabySitterCalculatorTests {

	@Test
	void testCalculatePaymentByHoursReturns12WhenGiven1Hour() {
		int actualDollarsEarned = babysitterCalculator.CalculatePaymentByHours(1);
		int expectedDollarsEarned = 12;
		assertEquals(expectedDollarsEarned, actualDollarsEarned);
	}
	
	@Test
	void testCalculatePaymentByHoursReturns24WhenGiven2Hours() {
		int actualDollarsEarned = babysitterCalculator.CalculatePaymentByHours(2);
		int expectedDollarsEarned = 24;
		assertEquals(expectedDollarsEarned, actualDollarsEarned);
	}
	
	@Test
	void testCalculatePaymentByStartEndTimesReturns84WhenGiven5to12() {
		int actualDollarsEarned = babysitterCalculator.CalculatePaymentByStartEndTimes(5,12);
		int expectedDollarsEarned = 84;
		assertEquals(expectedDollarsEarned, actualDollarsEarned);
	}
	
	@Test
	void testCalculatePaymentByStartEndTimesReturns60WhenGiven6to11() {
		int actualDollarsEarned = babysitterCalculator.CalculatePaymentByStartEndTimes(6,11);
		int expectedDollarsEarned = 60;
		assertEquals(expectedDollarsEarned, actualDollarsEarned);
	}
	
	@Test
	void testCalculatePaymentByStartEndTimesReturns132WhenGiven5to4() {
		int actualDollarsEarned = babysitterCalculator.CalculatePaymentByStartEndTimes(5,4);
		int expectedDollarsEarned = 132;
		assertEquals(expectedDollarsEarned, actualDollarsEarned);
	}

}
