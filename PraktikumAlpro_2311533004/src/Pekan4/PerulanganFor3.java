package Pekan4;

public class PerulanganFor3 {

	public static void main(String[] args) {
		int hasil = 0;
	
		
		for (int i = 1; i <= 10; i++) {
			if (i < 10) {
				System.out.print(i + " + ");
			} else {
				System.out.print(i);
			}
			hasil = hasil + i;
		}
		System.out.println();
		System.out.println("Jumlah = " + hasil);

	}

}
