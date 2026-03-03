public class Cafe27 {
    String kodePelanggan;
    String pesanan = "";
    int jumlahPesanan = 0;
    double totalPembayaran = 0;

    public Cafe27() {

    }

    public Cafe27(String kodeP, String p, int JP, double TP) {
        this.kodePelanggan = kodeP;
        this.pesanan = p;
        this.jumlahPesanan = JP;
        this.totalPembayaran = TP;
    }

    void tampilkanMenu() {
        System.out.println("===== MENU CAFE 27 =====");
        System.out.println("1. Kopi Hitam     : 10000");
        System.out.println("2. Cappuccino     : 15000");
        System.out.println("3. Latte          : 18000");
        System.out.println("4. Teh Tarik      : 12000");
        System.out.println("=========================");
    }

    void tambahPesanan(String namaMenu, int jumlah, double harga) {
        if (!pesanan.equals("")) {
            pesanan += ", ";
        }
        pesanan += namaMenu + " x" + jumlah;

        jumlahPesanan += jumlah;
        totalPembayaran += harga * jumlah;
    }

    void tampilInformasi() {
        System.out.println("\n===== STRUK PEMBAYARAN =====");
        System.out.println("Kode Pelanggan   : " + kodePelanggan);
        System.out.println("Pesanan          : " + pesanan);
        System.out.println("Total Item       : " + jumlahPesanan);
        System.out.println("Total Bayar      : " + totalPembayaran);
        System.out.println("=============================");
    }
}