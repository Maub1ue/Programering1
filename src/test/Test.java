package test;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.util.Random;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		printBoard();

	}

	private static void printBoard() {

		int wins = 0;
		int loss = 0;
		int draw = 0;

		int nmbGames = 2;

		int Games = nmbGames; // Det bli

		for (int i = 0; i < Games; i++) {
			// JOptionPane.showMessageDialog(null, "Game nr" + (i + 1));

			String[] options = { "Sten", "Sax", "Påse" };
			ImageIcon SSP = new ImageIcon("C:/Users/mohamed.alhashemi/Desktop/SSSP.png");
			String Val = (String) JOptionPane.showInputDialog(null, "Sten, Sax eller Påse?", "Game nr" + (i + 1),
					JOptionPane.QUESTION_MESSAGE, SSP, options, options[2]);

			// Scanner usersChoise = new Scanner(System.in);
			// String Val = JOptionPane.showInputDialog("Sten, Sax, Påse?");
			// String usersPick = usersChoise.nextLine().toLowerCase();

			ImageIcon Sten = new ImageIcon("C:/Users/mohamed.alhashemi/Desktop/sten.png");
			ImageIcon Sax = new ImageIcon("C:/Users/mohamed.alhashemi/Desktop/sax.png");
			ImageIcon Påse = new ImageIcon("C:/Users/mohamed.alhashemi/Desktop/pase.png");
			
			Random RandomGenerator = new Random();
			int ThreeValue = RandomGenerator.nextInt(3);

			if (ThreeValue == 0) {
				JOptionPane.showMessageDialog(null, "PC Valde Sten " + "| Du valde " + Val); // Sten
			}

			else if (ThreeValue == 1) {
				JOptionPane.showMessageDialog(null, "PC Valde Sax " + "| Du valde " + Val); // sax
				// JOptionPane.showMessageDialog(parentComponent, message, title, messageType, icon);
			}

			else {
				JOptionPane.showMessageDialog(null, "PC Valde Påse " + "| Du valde " + Val); // Påse
			}

			if (ThreeValue == 0 && Val.equals("Påse") // PC:STEN, DU:PÅSE
					|| ThreeValue == 1 && Val.equals("Sten") // PC:SAX DU:STEN
					|| ThreeValue == 2 && Val.equals("Sax"))// PC:PÅSE DU:SAX
			{
				wins++;

				JOptionPane.showMessageDialog(null, "Win");

			} else if (ThreeValue == 0 && Val.equals("Sten") // PC:STEN DU:STEN
					|| ThreeValue == 1 && Val.equals("Sax") // PC:SAX DU:SAX
					|| ThreeValue == 2 && Val.equals("Påse")) {
				draw++;
				JOptionPane.showMessageDialog(null, "Draw");

			} else {
				loss++;
				JOptionPane.showMessageDialog(null, "Loss");
				;
			}

		}

		JOptionPane.showMessageDialog(null, " Wins " + wins +  "\n Loss " + loss + "\n Draw " + draw);


	}

}
