public class Solution {

	public static int solveSuperMarketQueue(int[] customers, int n) {

		int totalWait = 0;
		int[] lanes = new int[n];

		for (int nextCustomer : customers) {
			totalWait += advanceLanes(lanes, nextCustomer);
		}

		int waitTime = advanceLanes(lanes, 0);
		while (waitTime != 0) {
			totalWait += waitTime;
			waitTime = advanceLanes(lanes, 0);
		}

		return totalWait;
	}

	public static int advanceLanes(int[] lanes, int customer) {
		int indexOfMinWait = indexOfMinValue(lanes);
		int minWait = lanes[indexOfMinWait];
		if (minWait != 0) {
			for (int i = 0; i < lanes.length; i++) {
				lanes[i] = lanes[i] - minWait;
			}
		}
		lanes[indexOfMinWait] = customer;
		return minWait;
	}

	public static int indexOfMinValue(int[] values) {
		int minIndex = 0;
		int minValue = values[0];
		for (int i = 0; i < values.length; i++) {
			if (values[i] < minValue) {
				minValue = values[i];
				minIndex = i;
			}
		}
		return minIndex;
	}
}