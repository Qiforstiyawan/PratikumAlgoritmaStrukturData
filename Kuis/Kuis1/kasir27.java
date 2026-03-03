import java.util.Scanner;

public class kasir27 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah pelanggan: ");
        int jumlahPelanggan = sc.nextInt();
        sc.nextLine();

        Cafe27[] daftarTransaksi = new Cafe27[jumlahPelanggan];

        for (int i = 0; i < jumlahPelanggan; i++) {

            System.out.println("\n=== Pelanggan ke-" + (i + 1) + " ===");

            daftarTransaksi[i] = new Cafe27();

            System.out.print("Masukkan Kode Pelanggan: ");
            daftarTransaksi[i].kodePelanggan = sc.nextLine();

            char tambahPesanan = 0;

            do {
                daftarTransaksi[i].tampilkanMenu();

                System.out.print("Pilih menu (1-4): ");
                int pilihan = sc.nextInt();

                System.out.print("Masukkan jumlah pesanan: ");
                int jumlah = sc.nextInt();

                String namaMenu = "";
                double harga = 0;

                switch (pilihan) {
                    case 1:
                        namaMenu = "Kopi Hitam";
                        harga = 10000;
                        break;
                    case 2:
                        namaMenu = "Cappuccino";
                        harga = 15000;
                        break;
                    case 3:
                        namaMenu = "Latte";
                        harga = 18000;
                        break;
                    case 4:
                        namaMenu = "Teh Tarik";
                        harga = 12000;
                        break;
                    default:
                        System.out.println("Menu tidak tersedia.");
                        continue;
                }

                daftarTransaksi[i].tambahPesanan(namaMenu, jumlah, harga);

                System.out.print("Tambah pesanan lagi? (y/n): ");
                tambahPesanan = sc.next().charAt(0);

            } while (tambahPesanan == 'y' || tambahPesanan == 'Y');

            sc.nextLine(); 
        }

        System.out.println("\n===== SEMUA TRANSAKSI =====");
        for (int i = 0; i < jumlahPelanggan; i++) {
            daftarTransaksi[i].tampilInformasi();
        }

        sc.close();
    }
}