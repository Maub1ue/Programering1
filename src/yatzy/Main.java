package yatzy;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		printBoard();

	}
	/**
	 * Will print the board
	 */
	private static void printBoard() {

	//	JOptionPane.showMessageDialog(null, "Heyoo", ".-*Board*-.", -1);
		//String name = JOptionPane.showInputDialog("Vat is dain name?");
		//JOptionPane.showMessageDialog(null, "Aiight you good, " + name);
		
		
		String[] options = {"Sten", "Sax", "Påse"};
		String Val = (String)JOptionPane.showInputDialog(null, "Sten, Sax eller Påse?",
                "Game nr", JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
		
		
		
	}

}
