package textgame;

public class Food extends Item {
	
	private int hp;
	
	public Food(String itemName, boolean eateable, int hp) {
		super(itemName, eateable);
		this.hp = hp;
	}
	public int eat() {
		return hp;
	}

}
