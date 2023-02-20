package mygame;
import mygame.*;
public class Main {
	public static void main (String args[]){
		
		// Object Hero
		Hero Player1 = new Hero("Blodies", 12, 100);
		Hero Player2 = new Hero ("Martis", 14, 100);
		
		// Object Item
		Item Item1 = new Item ("Boots", 7);
		Item Item2 = new Item ("Light Blade", 20);
		
		// equip Item
		ling.equipItem(Item1);
		martis.equipItem(Item2);
		
		// Display
		ling.display();
		martis.display();
		
		// War
		System.out.println("+------- PERTEMPURAN ---------+");
		System.out.println("+-----------------------------+");
		System.out.println("-> Round One");
		Player1.attack(Player2);
		Player2.display();
		
		System.out.println("-> Round Two");
		Player2.attack(Player1);
		Player1.display();
	}

}