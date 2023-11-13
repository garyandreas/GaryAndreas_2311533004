package Pekan4;

public class Tes {

	public static void main(String[] args) {
		
		        int n = 5;
		        int width = 80;
		        for (int i = 0; i < n; i++) {
		            int dots = 4 * i;
		            int totalLength = 4 + dots; // 4 for the "<>" symbols
		            int padding = (width - totalLength) / 2;
		            for (int j = 0; j < padding; j++) {
		                System.out.print(" ");
		            }
		            System.out.print("<>");
		            for (int j = 0; j < dots; j++) {
		                System.out.print(".");
		            }
		            System.out.println("<>");
		        }
		        for (int i = n; i > 0; i--) {
		            int dots = 4 * (i - 1);
		            int totalLength = 4 + dots; // 4 for the "<>" symbols
		            int padding = (width - totalLength) / 2;
		            for (int j = 0; j < padding; j++) {
		                System.out.print(" ");
		            }
		            System.out.print("<>");
		            for (int j = 0; j < dots; j++) {
		                System.out.print(".");
		            }
		            System.out.println("<>");
		        }
		    }
		}
