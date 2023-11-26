import java.util.Scanner;
public class MinimarketProgram {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
    
    //  Exception Handling   
    try {
        // Input data
        System.out.print("No. Faktur: ");
        String noFaktur = scanner.nextLine();

        System.out.print("Nama Pelanggan: ");
        String namaPelanggan = scanner.nextLine();

        System.out.print("Nama Barang: ");
        String namaBarang = scanner.nextLine();

        System.out.print("Harga Barang: ");
        double hargaBarang = scanner.nextDouble();

        System.out.print("Jumlah Barang: ");
        int jumlahBarang = scanner.nextInt();

        // Membuat objek Penjualan
        Penjualan penjualan = new Penjualan(noFaktur, namaPelanggan, namaBarang, hargaBarang, jumlahBarang);  

// Menampilkan hasil penjualan
System.out.println("\nDetail Penjualan:");
System.out.println("No. Faktur: " + penjualan.getNoFaktur());
System.out.println("Nama Pelanggan: " + penjualan.getNamaPelanggan());
System.out.println("Nama Barang: " + penjualan.getNamaBarang());
System.out.println("Harga Barang: " + String.format("%.2f", penjualan.getHarga()));
System.out.println("Jumlah Barang: " + penjualan.getJumlahBarang());
System.out.println("Total Bayar: " + String.format("%.2f", penjualan.hitungTotalBayar(penjualan.getHarga(), penjualan.getJumlahBarang())));

        // Menutup scanner
        scanner.close();
    
    } catch (java.util.InputMismatchException e) {
        System.out.println("Input tidak valid. Pastikan memasukkan jenis data yang benar.");
        return;
    }
    }
}