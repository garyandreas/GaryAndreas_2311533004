package preTest;

import java.util.Scanner;

public class PreTest2 {

	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			boolean keepRunning = true;

			while (keepRunning) {
				
				System.out.println("Masukkan panjang blok : ");
				double a = scanner.nextInt();
				System.out.println("Masukkan lebar blok : ");
				double b = scanner.nextInt();
				
				System.out.println("Jumlah blok : ");
				double num = a * b;
				System.out.println("" +num);
			            
				double hasil = num / 2;
			            
				if (num % 2 != 0) {
			        hasil -= 0.5;
				}  else {;
					
				}
				System.out.println("Blok yang muat : ");    
				System.out.println("" +hasil);
				System.out.println();
			    }
			    scanner.close();     
			    
			    }

			    }
	




