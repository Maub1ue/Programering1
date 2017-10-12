package rectangle;

public class Main {

	public Main() {

	}

	public static void main(String[] args) {
		Rectangle rectanglel = new Rectangle(3.0f, 4.0f);
		
		System.out.println( rectanglel.getLength() );
		
		rectanglel.setLength(75.45f);
		
		System.out.println( rectanglel.getLength() );
		
		System.out.println( rectanglel.getArea() );
		
		System.out.println( rectanglel.toString() );
	}

}
