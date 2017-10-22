public class EasyWallpaper {

	public static final double ROLL_WIDTH_METERS = 0.52;
	public static final double ROLL_LENGTH_METERS = 10;
	public static final double FUDGE_FACTOR = 1.15;
	
	public static final String[] INT_WORDS = { "zero", "one", "two", "three", 
			"four", "five", "six", "seven", "eight", "nine", "ten", "eleven", 
			"twelve", "thirteen", "fourteen", "fifteen", "sixteen", 
			"seventeen", "eighteen", "ninteen", "twenty"
	};
	
	public String wallpaper(double l, double w, double h) {
		return getWordForInt_ZeroToTwenty(getNumRolls(l,w,h));
	}
	
	private int getNumRolls(double l, double w, double h) {
		if (l*w*h == 0) return 0;
		double roomCircumference = (l+w)*2;
		double numSectionsDouble = roomCircumference / ROLL_WIDTH_METERS;
		double totalRollLength = numSectionsDouble * h * FUDGE_FACTOR;
		int numRolls = (int)Math.ceil(totalRollLength/ROLL_LENGTH_METERS);
		return numRolls;
	}

	public String getWordForInt_ZeroToTwenty(int num) {
		if (num < 0 || num > 20) return null;
		return INT_WORDS[num];
	}
}