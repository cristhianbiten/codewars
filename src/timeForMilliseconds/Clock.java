package timeForMilliseconds;

public class Clock {

	public static int Past(int h, int m, int s) {
		int hForMilli = h * 60;
		int mForMilli = (hForMilli + m) * 60;
		int sForMilli = (mForMilli + s) * 1000;

		return sForMilli;
	}

}
