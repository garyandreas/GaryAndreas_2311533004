package Pekan2;

public class Transaksi {

	public static void main(String[] args) {
		
		double harga_barang, jumlah_barang, diskon, total;
		harga_barang = 220500;
		jumlah_barang = 7;
		diskon = 0.3;
		
		total = (harga_barang * jumlah_barang)-(harga_barang * jumlah_barang * diskon);
		
		System.out.println("Total harga yang dibayarkan = Rp " +total);
		
	}

}
