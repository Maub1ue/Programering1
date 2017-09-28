package exercises.classes;

public class Application {


	public static void main(String[] args) {
		System.out.println("Hello");

		Person dude = new Person("Jo");
		Person kille = new Person("Ji");
		
		kille.writeName();		
		dude.writeName();

		dude.setName("Miller");
		dude.writeName();
		
	}
	
	
	

}
