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


}
