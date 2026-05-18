package CM2;

import java.util.Scanner;

public class MainRoyalDelish27 {
    static Scanner input = new Scanner(System.in);
    static DoubleLinkedListAntrian27 antrian = new DoubleLinkedListAntrian27();
    static DoubleLinkedListPesanan27 pesanan = new DoubleLinkedListPesanan27();

    public static void main(String[] args) {
        DataAwal27();

        int pilih;

        do {
            menu27();
            System.out.print("Pilih menu: ");
            pilih = input.nextInt();
            input.nextLine();

            switch (pilih) {
                case 1:
                    tambahAntrian27();
                    break;
                case 2:
                    antrian.cetakAntrian27();
                    break;
                case 3:
                    hapusAntrianDanPesan27();
                    break;
                case 4:
                    pesanan.cetakLaporan27();
                    break;
                case 0:
                    System.out.println("\nTerima kasih. Program selesai.");
                    break;
                default:
                    System.out.println("\nMenu tidak tersedia.");
            }

            System.out.println();

        } while (pilih != 0);
    }

    static void menu27() {
        System.out.println("=================================");
        System.out.println("    SISTEM ANTRIAN ROYAL DELISH");
        System.out.println("=================================");
        System.out.println("1. Tambah Antrian");
        System.out.println("2. Cetak Antrian");
        System.out.println("3. Hapus Antrian dan Pesan");
        System.out.println("4. Laporan Pesanan");
        System.out.println("0. Keluar");
        System.out.println("=================================");
    }

    static void DataAwal27() {
        antrian.tambahAntrian27("Ainra", "08224500000");
        antrian.tambahAntrian27("Damra", "08224511111");
        antrian.tambahAntrian27("Sanri", "08224522222");
    }

    static void tambahAntrian27() {
        System.out.println("\n=================================");
        System.out.println("          TAMBAH ANTRIAN");
        System.out.println("=================================");

        System.out.print("Nama Pembeli : ");
        String nama = input.nextLine();

        System.out.print("No HP        : ");
        String noHp = input.nextLine();

        antrian.tambahAntrian27(nama, noHp);
    }

    static void hapusAntrianDanPesan27() {
        System.out.println("\n=================================");
        System.out.println("    HAPUS ANTRIAN DAN PESAN");
        System.out.println("=================================");

        System.out.print("Masukkan No Antrian: ");
        int noAntrian = input.nextInt();
        input.nextLine();

        Pembeli27 pembeli = antrian.hapusAntrian27(noAntrian);

        if (pembeli == null) {
            System.out.println("No antrian tidak ditemukan.");
            return;
        }

        System.out.println("\nPembeli Dipanggil");
        System.out.println("Nama  : " + pembeli.namaPembeli);
        System.out.println("No HP : " + pembeli.noHp);

        System.out.println("\nInput Pesanan");
        System.out.print("Kode Pesanan : ");
        int kode = input.nextInt();
        input.nextLine();

        System.out.print("Nama Pesanan : ");
        String namaPesanan = input.nextLine();

        System.out.print("Harga        : ");
        int harga = input.nextInt();
        input.nextLine();

        Pesanan27 dataPesanan = new Pesanan27(
                kode,
                namaPesanan,
                harga,
                pembeli.namaPembeli
        );

        pesanan.tambahPesanan27(dataPesanan);

        System.out.println("\n" + pembeli.namaPembeli + " telah memesan " + namaPesanan + ".");
    }
}