package rectangle;

public class Main {

	public Main() {

	}

	public static void main(String[] args) {
		Rectangle rectanglel = new Rectangle() ;
		
		rectanglel.setlength(80f);
		
		rectanglel.setWidth(9f);
		
		System.out.println( rectanglel.getlength() );
		
		System.out.println( rectanglel.getWidth()  );
		
		System.out.println( rectanglel.getPerimeter() );
		
		System.out.println( rectanglel.toString() );
	}

}
