public class Kata {
  public static String rps(String p1, String p2) {
    if (p1.equals(p2)) { 
    	return "Draw!";
    } else {
    	switch (p1) {
		case "rock":
			switch (p2) {
			case "paper": return "Player 2 won!"; 
			case "scissors": return "Player 1 won!"; 
			default: throw new IllegalArgumentException();
			}
		case "paper":
			switch (p2) {
			case "rock": return "Player 1 won!"; 
			case "scissors": return "Player 2 won!"; 
			default: throw new IllegalArgumentException();
			}
		case "scissors":
			switch (p2) {
			case "rock": return "Player 2 won!"; 
			case "paper": return "Player 1 won!"; 
			default: throw new IllegalArgumentException();
			}
    	}
    	return null;
    }
  }
}
