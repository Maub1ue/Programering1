package exercise.ifstatment;

import java.util.Random;
import java.util.Scanner;

public class IfStatments {

	public static void main(String[] args) {

		int wins = 0;
		int loss = 0;
		int draw = 0;

		int Nmbgames = 20;

		for (int i = 0; i < Nmbgames; i++) {
			System.out.println("Game: " + (i + 1));

			Scanner usersChoose = new Scanner(System.in);
			System.out.println("Rock, Papper, Scissors:");
			String usersPick = usersChoose.nextLine().toLowerCase();

			Random RandomGenerator = new Random();
			int CoinFlippValue = RandomGenerator.nextInt(3);

			if (CoinFlippValue == 0) {
				System.out.println("Rock");
			} else if (CoinFlippValue == 1) {
				System.out.println("Papper");
			} else if (CoinFlippValue == 2) {
				System.out.println("Scissors");

				if (CoinFlippValue == 0 && usersPick.equals("Rock")

						|| CoinFlippValue == 1 && usersPick.equals("Papper")

						|| CoinFlippValue == 2 && usersPick.equals("Scissors"))

				{
					System.out.println("Draw");
					draw++;

				} else if (CoinFlippValue == 0 && usersPick.equals("Papper")

						|| CoinFlippValue == 1 && usersPick.equals("Scissors")

						|| CoinFlippValue == 2 && usersPick.equals("Rock"))

				{
					System.out.println("win");
					wins++;
				}

				else if (CoinFlippValue == 0 && usersPick.equals("Scissors")

						|| CoinFlippValue == 1 && usersPick.equals("Rock")

						|| CoinFlippValue == 2 && usersPick.equals("Papper"))

				{
					System.out.println("loss");
					loss++;
				}

				System.out.println("Wins: " + wins);
				System.out.println("loss: " + loss);
				System.out.println("Draw: " + draw);
			}
		}
	}
}
