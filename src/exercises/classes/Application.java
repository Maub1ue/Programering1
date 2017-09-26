package exercises.classes;

public class Application {


	public static void main(String[] args) {
		System.out.println("Hello");

		Person person = new Person("Moe");
		Person person1 = new Person("Jonas");
		Person person2 = new Person("Ivar");
		Person person3 = new Person("Moe");
		
		person.writeName();
		person1.writeName();
		person2.writeName();
		person3.writeName();
		
		person1.setName("Ragge");
		person1.writeName();
		
	}

}
