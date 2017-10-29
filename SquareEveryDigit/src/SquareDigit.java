public class SquareDigit {

	public int squareDigits(int n) {
		n = Math.abs(n);
		String nString = Integer.toString(n);
		StringBuffer squareDigits = new StringBuffer();
		for (int i = 0; i < nString.length(); i++) {
			String digitString = nString.substring(i, i + 1);
			int digit = Integer.parseInt(digitString);
			int square = digit * digit;
			squareDigits.append(Integer.toString(square));
		}
		return Integer.parseInt(squareDigits.toString());
	}

}