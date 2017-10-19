package lesson.ifstatments;

import java.util.Random;
import java.util.Scanner;

public class KronaKlave {

	public static void main(String[] args) {
		
		
		Scanner usersChoose = new Scanner(System.in); 
		System.out.println("Choose Pickle Rick or Morten:" );
		String usersPick = usersChoose.nextLine().toLowerCase();
		
		// System.out.println(usersPick);

		//Randomiser
		Random RandomGenerator = new Random ();
		boolean CoinFlippValue = RandomGenerator.nextBoolean();
		
		
		if (CoinFlippValue == true) {
			System.out.println("Pickle Rick");
} else {
			System.out.println("Morten");
}
		
		if ( CoinFlippValue == true && usersPick.equals("pickle rick") || CoinFlippValue == false && usersPick.equals("morten") ) {
			System.out.println("Wubba lubba WINWIN");	
			
} else {
			System.out.println("Get schwifty");
}
		
	}

}
