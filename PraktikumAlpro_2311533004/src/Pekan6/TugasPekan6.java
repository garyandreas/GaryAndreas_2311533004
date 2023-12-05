package Pekan6;

import java.util.Scanner;

public class TugasPekan6 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean keepRunning = true;

		while (keepRunning) {
			System.out.println("Input : ");
			int num = scanner.nextInt();
		            
			int baris1 = num / 2;
			int baris2 = num / 2;
		            
			if (num % 2 != 0) {
		        baris1 += 1;
		    }
		            
		    for (int i = 0; i < num; i++) {
		        for (int j = 0; j < (i % 2 == 0 ? baris1 : baris2); j++) {
		            System.out.print("-");
		        }
		        System.out.println();
		    }

		    System.out.println("Lanjut ga bang? (y / n) : ");
		    String response = scanner.next();
		    if (response.equalsIgnoreCase("n")) {
		        keepRunning = false;
		    }
		}
		        
		scanner.close();
	}
}
