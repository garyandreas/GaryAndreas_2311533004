package Pekan3;

import java.util.Scanner;

public class BilanganGenapGanjil {

	public static void main(String[] args) {
		long NIM;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan NIM Anda : ");
		NIM = input.nextLong();
			
		if (NIM%2>0) {
			System.out.println(NIM + " merupakan bilangan ganjil");
				
		} else {
			System.out.println(NIM + " merupakan bilangan genap");

		input.close();
		
		}
				
	}

}