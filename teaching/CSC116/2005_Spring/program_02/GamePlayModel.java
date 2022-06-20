/**
 * Model for Program 2
 * @author Alex Balik
 * @version 1.1
 */

public class GamePlayModel {
	
	private int currentLevel;
	private int currentScore;
	private int num1;
	private int num2;
	private int answer;
	private int tryNumber;
	
	public GamePlayModel() {
		currentLevel = 1;
		currentScore = 0;
		num1 = 0;
		num2 = 0;
		answer = 0;
		tryNumber = 1;
	}
	
	//resets everything to start a new game
	public void newGame() {
		currentLevel = 1;
		currentScore = 0;
	}
	
	//sets up a new problem and returns a String representation
	public String newProblem() {
		java.util.Random r = new java.util.Random();
		tryNumber = 1;
		
		switch (currentLevel) {
			case 1: num1 = r.nextInt(10);
					num2 = r.nextInt(10);
					answer = num1 + num2;
					return num1 + " + " + num2;
			case 2:	num1 = r.nextInt(100);
					num2 = r.nextInt(100);
					answer = num1 + num2;
					return num1 + " + " + num2;
			case 3:	num1 = r.nextInt(10);
					num2 = r.nextInt(10);
					answer = num1 - num2;
					return num1 + " - " + num2;
			case 4:	num1 = r.nextInt(100);
					num2 = r.nextInt(100);
					answer = num1 - num2;
					return num1 + " - " + num2;
		}
		
		return "";
	}
	
	public int guessAnswer(int guess) {
		//correct answer, add 1 to score
		//increase level if score is a multiple of 5
		if (answer == guess) {
			currentScore++;
			if (currentLevel < 4 && currentScore % 5 == 0) 
				currentLevel++;
			return 1;
		}
		
		//incorrect answer on the first try
		if (1 == tryNumber) {
			tryNumber++;
			return 2;
		}
		
		//incorrect answer on the second try
		return 3;
	}		
	
	public int getScore() {
		return currentScore;
	}
		
}