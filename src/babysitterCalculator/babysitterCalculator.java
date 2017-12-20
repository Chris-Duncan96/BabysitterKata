package babysitterCalculator;

public class babysitterCalculator {

	private static int baseRate = 8;
	private static int afterMidnightBonusRate = 8;
	private static int beforeBedBonusRate = 4;

	private static int CalculatePaymentByHoursAndRate(int hours, int rate) {
		return rate*Math.max(hours, 0);
	}

	public static int CalculatePayment(int startTime, int bedTime, int endTime) {
		startTime = addTimeIfPastMidnight(startTime);
		bedTime = addTimeIfPastMidnight(bedTime);
		endTime = addTimeIfPastMidnight(endTime);
		bedTime = Math.min(endTime, bedTime);
		bedTime = Math.min(12, bedTime);
		return CalculatePaymentByHoursAndRate(endTime - startTime, baseRate) + CalculatePaymentByHoursAndRate(endTime - 12, afterMidnightBonusRate)
																			 + CalculatePaymentByHoursAndRate(bedTime - startTime, beforeBedBonusRate);
	}

	private static int addTimeIfPastMidnight(int time) {
		if(time < 5) time+=12;
		return time;
	}
}