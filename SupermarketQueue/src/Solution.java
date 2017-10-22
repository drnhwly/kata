/**
 * There is a queue for the self-checkout tills at the supermarket. Your task 
 * is write a function to calculate the total time required for all the 
 * customers to check out!
 * 
 * The function has two input variables:
 * 
 * customers: an array (list in python) of positive integers representing 
 * the queue. Each integer represents a customer, and its value is the amount 
 * of time they require to check out.
 * 
 * n: a positive integer, the number of checkout tills.
 * The function should return an integer, the total time required.
 * 
 * EDIT: A lot of people have been confused in the comments. To try to prevent any more confusion:
 * 
 * There is only ONE queue, and
 * The order of the queue NEVER changes, and
 * Assume that the front person in the queue (i.e. the first element in the 
 * array/list) proceeds to a till as soon as it becomes free.
 * The diagram on the wiki page I linked to at the bottom of the description 
 * may be useful.
 * 
 * https://www.codewars.com/kata/the-supermarket-queue
 * 
 * @author dhaw02b
 */
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