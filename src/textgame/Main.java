package textgame;

import javax.swing.JOptionPane;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		int hp = 10;
		printBoard();

	}

	public static void printBoard() {
		int age;
		String firstname;
		String lastname;
		int WakeUp;
		int Val = 0;
		int food = 50;
		

		JOptionPane.showMessageDialog(null, "Welcome adventurer, would you like to tell me a little about yourself?",
				"Adventure time", 1);
		while (true) {
			age = Integer.parseInt(JOptionPane.showInputDialog(null, "How old are you?", "Age old question", 1));
			firstname = JOptionPane.showInputDialog(null, "What your name?", "My name is __ my name is __", 1);
			lastname = JOptionPane.showInputDialog(null, "Do you have a last name?", "After that name", 1);
			int input = JOptionPane.showConfirmDialog(null,
					"So you're: " + firstname + " " + lastname + " " + age + " Years of age", null, 0);
			if (input == 0) {
				break;
			} else if (input == 1) {

			}

		}

		while (true) {
			Object[] options = { "Go Back to sleep", // 1
					"I'd like to go on a adventure!", // 2
					"Maybe have something to eat", // 3
			};

			WakeUp = JOptionPane.showOptionDialog(null,
					"Goodmorning " + firstname + "\nYou've been sleeping all day, " + "what would you like to do?",
					"A Silly Question", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options,
					options[2]);

			if (WakeUp == 0) {
				JOptionPane.showMessageDialog(null, "Lets go sleep");

			} else if (WakeUp == 1) {
				JOptionPane.showMessageDialog(null, "Lets go out");
				break;
			} else if (WakeUp == 2) {
				JOptionPane.showMessageDialog(null, "Lets go to the kitchen");
				Val++;
				break;

			}
		}

		if (Val == 1) {
			Object[] Food = { "BIG BLT", // 0
					"Melted cheese", // 1
					"A banana", // 2
			};

			JOptionPane.showOptionDialog(null, "What would you " + "like to eat?", "Grab a snack",
					JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, Food, Food[2]);

			food = food - 20;

			Object[] val = { "Good", // 0
					"Bad", // 1
					"Meh", // 2
			};
			JOptionPane.showOptionDialog(null, "How was it?", "I dont care", JOptionPane.YES_NO_CANCEL_OPTION,
					JOptionPane.QUESTION_MESSAGE, null, val, val[2]);
			JOptionPane.showMessageDialog(null, " i dont care acctually :^    )");
		}

		Object[] val = { "Go to the market", // 0
				"Go out to the forest", // 1
				"Go to the abandond fields", // 2
		};

		int begining = JOptionPane.showOptionDialog(null, "The weather is beatiful today " + "\nWhere should we go?",
				"Come along with me", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, val,
				val[2]);

		if (begining == 0) {
			market();
			JOptionPane.showMessageDialog(null, "The market is filled with wonderfull fruits and vegetables");
		}if (begining == 1) {
			forest();
			JOptionPane.showMessageDialog(null, "It seems very quite here");
		}if (begining == 2) {
			field();
		}

	}

	public static void market() {
		JOptionPane.showMessageDialog(null, "hi");
	}

	public static void forest() {
	}

	public static void field() {

		if (gasmask == 0) {
			JOptionPane.showMessageDialog(null, "Theres some black mold here, you should get a mask or something");
		}
	}

	
}
