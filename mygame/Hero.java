package mygame;
import mygame.Item;
public class Hero {
	String nama;
	int level;
	double health;
	
	Item item;
	
	Hero(String nama, int level, double health){
		this.nama = nama;
		this.level = level;
		this.health = health;
	}
	
	void display(){
		System.out.println("\nNama : " + this.nama);
		System.out.println("Level : " + this.level);
		System.out.println("Health : " + this.health);
		item.display();
	}
	
	void equipItem(Item item){
		this.item = item;
	}
	
	void attack(Hero enemy){
		System.out.println(this.nama + " attacks " + enemy.nama);
		enemy.accept(this.item.attack);
	}
	
	void accept(double attack){
		double demage;
		System.out.println(this.nama + " gets demage " + attack);
		demage = this.health - attack;
		
		this.health = demage;
	}

}
