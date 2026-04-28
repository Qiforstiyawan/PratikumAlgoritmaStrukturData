package TugasJobsheet10;

import java.util.Scanner;

public class LayananKRS {
    public static void menu() {
        System.out.println("\n=== Menu Antrian Persetujuan KRS ===");
        System.out.println("1. Tambah Mahasiswa ke Antrian");
        System.out.println("2. Panggil Antrian untuk Proses KRS");
        System.out.println("3. Cek Antrian Kosong");
        System.out.println("4. Cek Antrian Penuh");
        System.out.println("5. Tampilkan Semua Antrian");
        System.out.println("6. Tampilkan 2 Antrian Terdepan");
        System.out.println("7. Tampilkan Antrian Paling Akhir");
        System.out.println("8. Cetak Jumlah Antrian");
        System.out.println("9. Cetak Jumlah Sudah Proses KRS");
        System.out.println("10. Cetak Jumlah Belum Proses KRS");
        System.out.println("11. Kosongkan Antrian");
        System.out.println("0. Keluar");
        System.out.print("Pilih menu: ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS antrian = new AntrianKRS(10);
        int pilih;

        do {
            menu();
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("NIM   : ");
                    String nim = sc.nextLine();

                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();

                    System.out.print("Prodi : ");
                    String prodi = sc.nextLine();

                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();

                    Mahasiswa mhs = new Mahasiswa(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;

                case 2:
                    antrian.prosesKRS();
                    break;

                case 3:
                    if (antrian.isEmpty()) {
                        System.out.println("Antrian masih kosong.");
                    } else {
                        System.out.println("Antrian tidak kosong.");
                    }
                    break;

                case 4:
                    if (antrian.isFull()) {
                        System.out.println("Antrian sudah penuh.");
                    } else {
                        System.out.println("Antrian belum penuh.");
                    }
                    break;

                case 5:
                    antrian.tampilkanSemua();
                    break;

                case 6:
                    antrian.tampilkanDuaTerdepan();
                    break;

                case 7:
                    antrian.lihatAkhir();
                    break;

                case 8:
                    System.out.println("Jumlah mahasiswa dalam antrian: " + antrian.getJumlahAntrian());
                    break;

                case 9:
                    System.out.println("Jumlah mahasiswa yang sudah proses KRS: " + antrian.getJumlahSudahProses());
                    break;

                case 10:
                    System.out.println("Jumlah mahasiswa yang belum proses KRS: " + antrian.getJumlahBelumProses());
                    break;

                case 11:
                    antrian.clear();
                    break;

                case 0:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih != 0);

        sc.close();
    }
}