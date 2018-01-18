package textgame;

import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class Inventory {
	 ArrayList<Item> inventoryList = new ArrayList<Item>();

	 public Inventory() {
		 inventoryList.add(new Food("Banan", true, 10));
		 inventoryList.add(new Item("Kniv", false));
		 inventoryList.add(new Item("Nyckel", false));
	 }
	 
	 public void show() {
		 String[] tempArray = new String[inventoryList.size()];
		 for (int i = 0; i < inventoryList.size(); i++) {
			 tempArray[i] = inventoryList.get(i).getName();
		 }
		 
		 JOptionPane.showInputDialog(null, null, "Inventory", -1, null, 
				 	tempArray, // Array of choices
				 	tempArray[0]); // Initial choice
	 }
	 
	 public void addItem(Item item) {
		 inventoryList.add(item);
	 }
	 public Item getItem() {
		 String[] tempArray = new String[inventoryList.size()];
		 for (int i = 0; i < inventoryList.size(); i++) {
			 tempArray[i] = inventoryList.get(i).getName();
		 }
		 
		 String item = (String) JOptionPane.showInputDialog(null, null, "Inventory", -1, null, 
				 	tempArray, // Array of choices
				 	tempArray[0]); // Initial choice
		
	 	Item tempItem = null;
	 	for (int i = 0; i < inventoryList.size(); i++) {
			if (inventoryList.get(i).getName().equals(item)) {
				tempItem = inventoryList.get(i);
				inventoryList.remove(i);
			}
		 }
	 	
	 	
		return tempItem;
	 }
}
