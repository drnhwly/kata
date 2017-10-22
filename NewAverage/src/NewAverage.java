public class NewAverage {
	public static long newAvg(double[] arr, double navg) {
		double sumPrevious = 0;
		for (double donation : arr)
			sumPrevious += donation;
		long nextDonation = (long) Math.ceil(navg * (arr.length + 1) - sumPrevious);
		if (nextDonation <= 0)
			throw new IllegalArgumentException("ValueError: negative donation");
		else
			return nextDonation;
	}
}
