package Operator;
import String.Main;

public class unary {
	
	public static void main(String[] args) {
		//Operator Unary plus (+)
		int nilaiawal = 5;
		int hasil = +nilaiawal;
		System.out.println("Hasil +5 = " + hasil + "\n");
		//Operator Unary minus (-)
		int awal = 10;
		int akhir = -awal;
		System.out.println("Hasil -10 = " + akhir + "\n");
		//Operator Unary Penambahan 1 poin (Increement)
		nilaiawal++;
		System.out.println("Hasil 5++ = " + nilaiawal + "\n");
		//Operator Unary Pengurangan 1 poin (Decreement)
		awal--;
		System.out.println("Hasil 10-- = " + awal + "\n");
		//Operator Unary Komplemen Logika
		boolean sukses = false;
		System.out.println("Hasil sukses = " + !sukses + "\n");
	}
}