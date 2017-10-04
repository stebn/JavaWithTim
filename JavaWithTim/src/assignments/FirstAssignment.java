package assignments;

public class FirstAssignment {

	public static void main(String[] args) {
		
		int scorePosition = calculateHighScorePosition(1000);
		displayHighscorePosition("Tim", scorePosition );
		
		scorePosition = calculateHighScorePosition(500);
		displayHighscorePosition("Sam", scorePosition );
		
		scorePosition = calculateHighScorePosition(100);
		displayHighscorePosition("Pete", scorePosition );
		
		scorePosition = calculateHighScorePosition(70);
		displayHighscorePosition("Tom", scorePosition );
		
		System.out.println("THAT'S IT!");

	}

	public static void displayHighscorePosition(String PlayerName, int position) {
		
		System.out.println(PlayerName + " managed to get on the " + position + " position.");

	}

	public static int calculateHighScorePosition(int score) {
		if (score >= 1000) return 1;
		else if (score <1000 && score >=500) return 2;
		else if (score <500 && score >=100) return 3;
		return 4;
	}

}
