package matrix;

public class Main {
	
	public static void main(String[] args) {
		int[] A = {1, 2, 3, 4};
		int[] B = {30, 55, 70, 100};
		int ArrayA = A.length;
		int ArrayB = B.length;
		System.out.println("jumlah elemen A = " + ArrayA);
		System.out.println("jumlah elemen A = " + ArrayB);
		//Menghitung Penjumlahan Matriks A dan B
		int[] ArrayC = new int[A.length];
		for (int i = 0; i < ArrayA; i++) {
			ArrayC[i] = A[i] + B[i];
		}
		System.out.print("A+B = [");
		for (int i = 0; i < ArrayC.length; i++) {
			System.out.print(ArrayC[i] + " ");
		}
		System.out.println("]");
		//Menghitung Perkalian Matriks A dan B
		int[] ArrayD = new int[A.length];
		for (int i = 0; i < A.length; i++) {
			ArrayD[i] = A[i] * 2;
		}
		System.out.print("2A = [");
		for (int i = 0; i < ArrayD.length; i++) {
			System.out.print(ArrayD[i] + " ");
		}
		System.out.print("]");
	}
}