package test;

import java.util.Random;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {

		int wins = 0;
		int loss = 0;
		int draw = 0;

		System.out.println("Hur många spel?");

		Scanner gamesC = new Scanner(System.in); // Läser hur många games du vill ha
		int nmbGames = gamesC.nextInt();
		

		int Games = nmbGames; // Det bli

		for (int i = 0; i < Games; i++) {
			System.out.println("Omgång " + (i + 1));

			Scanner usersChoise = new Scanner(System.in);
			System.out.println("Sten, Sax eller Påse?");
			String usersPick = usersChoise.nextLine().toLowerCase();
			
			
			Random RandomGenerator = new Random();
			int ThreeValue = RandomGenerator.nextInt(3);

			if (ThreeValue == 0) {
				System.out.println("PC Valde Sten"); // Sten
			} else if (ThreeValue == 1) {
				System.out.println("PC Valde Sax"); // sax
			} else {
				System.out.println("PC Valde Påse"); // Påse
			}

			if (ThreeValue == 0 && usersPick.equals("påse") // PC:STEN, DU:PÅSE
					|| ThreeValue == 1 && usersPick.equals("sten") // PC:SAX DU:STEN
					|| ThreeValue == 2 && usersPick.equals("sax"))// PC:PÅSE DU:SAX
			{
				wins++;
				System.out.println("Du Vann");

			} else if (ThreeValue == 0 && usersPick.equals("sten") // PC:STEN DU:STEN
					|| ThreeValue == 1 && usersPick.equals("sax") // PC:SAX DU:SAX
					|| ThreeValue == 2 && usersPick.equals("påse")) {
				draw++;
				System.out.println("Lika");

			} else if (ThreeValue == 0 && usersPick.equals("sax")
					|| ThreeValue == 1 && usersPick.equals("påse")
					|| ThreeValue == 2 && usersPick.equals("sten")) {
				loss++;
				System.out.println("PC Vann");
			} else {
				System.out.println("nej nej");
			}

		}

		System.out.println("Loss: " + loss);
		System.out.println("Wins: " + wins);
		System.out.println("Draw: " + draw);

	}

}
