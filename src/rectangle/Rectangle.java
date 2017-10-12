package rectangle;

public class Rectangle {
	private float length = 1.0f;
	private float width = 1.0f;
	
	public Rectangle() {
	}
	
	public Rectangle(float length, float width) {
		this.length = length;
		this.setWidth(width);
	}
	
	public float getLength() {
		return length;
	}
	
	public void setLength() {
		this.length = length;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}
	
	

}
