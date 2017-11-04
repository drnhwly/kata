public class ASum {
	
	public static long findNb(long m) {
		long volume = 0;
		int n = 1; 
		while (m > volume) {
			long nVolume = (long) Math.pow(n, 3);
			volume += nVolume; 
			if (volume == m) return n;
			else n++;
		}
		return -1;
	}	
}