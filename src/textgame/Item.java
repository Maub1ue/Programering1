package textgame;

public class Item {
	private String name;
	private boolean eateable = false;
	public Item(String itemName, boolean eateable) {
		name = itemName;
		this.eateable = eateable;
	}
	public String getName() {
		return name;
	}
	public boolean getEateable() {
		return eateable;
	}
}
