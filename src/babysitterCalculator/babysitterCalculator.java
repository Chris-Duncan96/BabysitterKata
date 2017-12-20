package babysitterCalculator;

public class babysitterCalculator {

	public static int CalculatePaymentByHours(int hours) {
		return 12*hours;
	}

	public static int CalculatePaymentByStartEndTimes(int startTime, int endTime) {
		startTime = addTimeIfPastMidnight(startTime);
		endTime = addTimeIfPastMidnight(endTime);
		return CalculatePaymentByHours(endTime-startTime);
	}

	private static int addTimeIfPastMidnight(int time) {
		if(time < 5) time+=12;
		return time;
	}
	
}
