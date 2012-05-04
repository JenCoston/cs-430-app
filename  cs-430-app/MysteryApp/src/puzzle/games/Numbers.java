package puzzle.games;

import java.util.Random;
import java.util.Scanner;

import android.widget.TextView;

public class Numbers {

	private static int solution;
	private static int max;
	private static int min;
	private static int input;
	private static boolean play;

	//Activity
	public  void runNumbers(GameActivity gameActivity) {
		play = true;
		createNumber();
		while(play){
			gameView(gameActivity,displayNumber());
			int temp = getInput();
			if(isSolution(gameActivity)){
				//Activity
				gameView(gameActivity,"That is the correct number");
				play = false;
			} else {
				if(temp > max || temp < min){
					//Activity
					gameView(gameActivity, "Number is out of range!");
				}else{
					//Activity
					gameView(gameActivity,"That is not the correct number!");
					reduce(temp);
				}
			}
		}
	}
	public static void gameView(GameActivity gameActivity, String text) {
		TextView temp = new TextView(gameActivity);
		temp.setText(text);
	}
	private static void reduce(int temp) {
		if(temp < solution){
			isLess(temp);
		}else if(temp > solution){
			isMore(temp);
		}
	}
	private static void isLess(int number) {
		if(number != solution)	{
			updateMin(number);
		}
	}

	private static void isMore(int number) {
		if(number != solution)	{
			updateMax(number);
		}
	}

	private static void updateMax(int number) {
		max = number - 1;
	}
	private static void updateMin(int number) {
		min = number + 1;
	}

	private static boolean isSolution(GameActivity activity) {
		//Activity
		gameView(activity,"You guessed "+ input+ ".");
		if(input == solution){
			return true;
		}
		return false;
	}

	private static int getInput() {
		//Activity
		System.out.println("Guess a Number:");
		Scanner prompt = new Scanner(System.in);
		input = prompt.nextInt();
		return input;
	}

	private static String displayNumber() {
		String display = "The number is between " + min + " and " + max +".";
		return display;
	}

	private static int createNumber() {
		Random goal = new Random();
		solution = goal.nextInt(100);
		//solution = 24;
		min = 0;
		max = 100;
		return solution;
	}

}
