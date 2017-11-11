package lesson.ifstatments;

import java.util.Random;
import java.util.Scanner;

public class KronaKlave {

	public static void main(String[] args) {

		int wins = 0;
		int loss = 0;

		int Nmbgames = 3;

		for (int i = 0; i < Nmbgames; i++) {
			System.out.println("Game: " + (i + 1));
		

		// Gör ett val
		Scanner usersChoose = new Scanner(System.in);
		// Skriver ut valen man har
		System.out.println("Choose Pickle Rick or Morten:");
		// Läser valet man gjorde
		String usersPick = usersChoose.nextLine().toLowerCase();

		// Randomiser
		Random RandomGenerator = new Random();
		int CoinFlippValue = RandomGenerator.nextInt(2);

		// om det du valde blir rätt så -
		if (CoinFlippValue == 0) {
			System.out.println("Pickle Rick");
		} else {
			System.out.println("Morten");
		}
		// - Vinner du
		if (CoinFlippValue == 0 && usersPick.equals("pickle rick")
				|| CoinFlippValue == 1 && usersPick.equals("morten")) {
			System.out.println("Wubba lubba WINWIN");
			wins++;

		} else {
			System.out.println("Get schwifty");
			loss++;
		}

		System.out.println("Wins: " + wins);
		System.out.println("loss: " + loss);
		
		
	}
	}
}
