package Pekan3;

import java.util.Scanner;

public class latIf1 {

	public static void main(String[] args) {
		double IPK;
		Scanner input = new Scanner(System.in);
		System.out.print("Input IPK Anda : ");
		IPK = input.nextInt();
		
		if (IPK>2.75) {
			System.out.println("Anda Lulus Sangat Memuaskan");
			
		input.close();
		}
	}

}
