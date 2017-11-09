package lesson.ifstatments;

import java.util.Random;
import java.util.Scanner;

public class KronaKlave {

	public static void main(String[] args) {

		int wins = 0;
		int loss = 0;

		int Nmbgames = 20;

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
		boolean CoinFlippValue = RandomGenerator.nextBoolean();

		// om det du valde blir rätt så -
		if (CoinFlippValue == true) {
			System.out.println("Pickle Rick");
		} else {
			System.out.println("Morten");
		}
		// - Vinner du
		if (CoinFlippValue == true && usersPick.equals("pickle rick")
				|| CoinFlippValue == false && usersPick.equals("morten")) {
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
