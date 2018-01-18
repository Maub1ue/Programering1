package test2;

import javax.swing.JOptionPane;
import java.util.Random;

public class Test {
	public static void main(String[] args) {

		printBoard();
	}

	private static void printBoard() {
		int WakeUp;
		String firstname;
		firstname = "babe";
		int Val = 0;
		int age = 10;
		int difficulty = age + 20;
		String inv;
		
		
		if (Val == 1) {
			Object[] Food = { "BIG BLT", // 0
					"Melted cheese", // 1
					"A banana", // 2
			};

			JOptionPane.showOptionDialog(null,
					"What would you " + "like to eat?",
					"Grab a snack", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, Food,
					Food[2]);

		
			

		}
	}
}
