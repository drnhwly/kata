import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JadenCase {

	public String toJadenCase(String phrase) {
		if (phrase == null || phrase.length() == 0) return null;
		StringBuffer sb = new StringBuffer(phrase);
		Pattern p = Pattern.compile("\\b[a-zA-Z]");
		Matcher m = p.matcher(phrase);
		while (m.find()) {
			int n = m.start();
			String s = Character.toUpperCase(sb.charAt(n)) + "";
			sb.replace(n, n+1, s);
		}		
		return sb.toString();
	}
}
