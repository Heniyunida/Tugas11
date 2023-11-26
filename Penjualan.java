// Kelas Penjualan sebagai child class yang mengimplementasikan interface HitungTotal
class Penjualan extends Barang implements HitungTotal {
    private String noFaktur;
    private String namaPelanggan;
    private int jumlahBarang;

    public Penjualan(String noFaktur, String namaPelanggan, String namaBarang, double harga, int jumlahBarang) {
        super(namaBarang, harga);
        this.noFaktur = noFaktur;
        this.namaPelanggan = namaPelanggan;
        this.jumlahBarang = jumlahBarang;
    }

    public String getNoFaktur() {
        return noFaktur;
    }

    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    public int getJumlahBarang() {
        return jumlahBarang;
    }

    // Implementasi dari interface HitungTotal
    @Override
    public double hitungTotalBayar(double harga, int jumlah) {
        return harga * jumlah;
    }
}