package preTest;

import java.util.Scanner;

public class PreTest {
	
	    public static void main(String[] args) {
	    	
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("input : ");
	        int angka = scanner.nextInt();
	        System.out.println("output : ");
	        printFactors(angka);
	        scanner.close();
	    }

	    public static void printFactors(int angka) {
	        for (int i = angka; i >= 1; i--) {
	            if (angka % i == 0) {
	                System.out.println(i);
	        
	            }
	        }
	    }
}