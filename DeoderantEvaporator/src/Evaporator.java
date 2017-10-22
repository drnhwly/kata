
public class Evaporator {
	
	public static int evaporator(double content, double evap_per_day, double threshold) {

		double originalContent = content;
		int nthDay = 0;
		
		while (content/originalContent > (threshold/100)) {
			content = content - content * (evap_per_day/100);
			nthDay++;
		}
		return nthDay;
	}
}
