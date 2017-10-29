public class ASum {
	
	public static long findNb(long m) {
		long volume = 0;
		int n = 1; 
		while (m > volume) {
			long nVolume = n*n*n;
			volume += nVolume; 
			if (volume == m) return n;
			else n++;
		}
		return -1;
	}	
}