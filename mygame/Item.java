package mygame;
public class Item {
	String nama;
	double attack;
	
	Item (String nama, double attack){
		this.nama = nama;
		this.attack = attack;
	}
	
	void display(){
		System.out.println("Item : " + this.nama);
		System.out.println("Physical Attack : " + attack);
	}
	
	
}