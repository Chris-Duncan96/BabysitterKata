package babysitterCalculator;

public class babysitterCalculator {

	private static int baseRate = 8;
	private static int afterMidnightBonusRate = 8;

	private static int CalculatePaymentByHoursAndRate(int hours, int rate) {
		return rate*Math.max(hours, 0);
	}

	public static int CalculatePaymentByStartEndTimes(int startTime, int endTime) {
		startTime = addTimeIfPastMidnight(startTime);
		endTime = addTimeIfPastMidnight(endTime);
		return CalculatePaymentByHoursAndRate(endTime - startTime, baseRate) + CalculatePaymentByHoursAndRate(endTime - 12, afterMidnightBonusRate);
	}

	private static int addTimeIfPastMidnight(int time) {
		if(time < 5) time+=12;
		return time;
	}
	
}
