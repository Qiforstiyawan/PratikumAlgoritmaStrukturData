package CaseMethode;

import java.util.Scanner;

public class peminjamanDemo27 {
    public static void main(String[] args) {
        sistemPeminjaman27 sistem = new sistemPeminjaman27(5, 4);
        Scanner sc = new Scanner(System.in);

        mahasiswa27 m1 = new mahasiswa27("22001", "Andi", "Teknik Informatika");
        mahasiswa27 m2 = new mahasiswa27("22002", "Budi", "Teknik Informatika");
        mahasiswa27 m3 = new mahasiswa27("22003", "Citra", "Sistem Informasi Bisnis");

        buku27 b1 = new buku27("B001", "Algoritma", 2020);
        buku27 b2 = new buku27("B002", "Basis Data", 2019);
        buku27 b3 = new buku27("B003", "Pemrograman", 2021);
        buku27 b4 = new buku27("B004", "Fisika", 2024);

        sistem.tambahBuku(new buku27("B001", "Algoritma", 2020));
        sistem.tambahBuku(new buku27("B002", "Basis Data", 2019));
        sistem.tambahBuku(new buku27("B003", "Pemrograman", 2021));
        sistem.tambahBuku(new buku27("B004", "Fisika", 2024));      

        sistem.tambah(new peminjaman27(m1, b1, 7));
        sistem.tambah(new peminjaman27(m2, b2, 3));
        sistem.tambah(new peminjaman27(m3, b3, 10));
        sistem.tambah(new peminjaman27(m3, b4, 6));
        sistem.tambah(new peminjaman27(m1, b2, 4));

        int pilih;

        do {

            System.out.println("=== SISTEM PEMINJAMAN RUANG BACA JTI ===");
            System.out.println("1. Tampilkan Mahasiswa");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Tampilkan Peminjaman");
            System.out.println("4. Urutkan Berdasarkan tahun");
            System.out.println("5. Cari Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");

            pilih = sc.nextInt();
            switch (pilih) {

                case 1:
                    System.out.println("Daftar Mahasiswa: ");
                    m1.tampil();
                    m2.tampil();
                    m3.tampil();
                    break;

                case 2:
                    System.out.println("Daftar Buku: ");
                    b1.tampil();
                    b2.tampil();
                    b3.tampil();
                    b4.tampil();
                    break;

                case 3:
                    System.out.println("Data Peminjaman");
                    sistem.tampil();
                    break;

                case 4:
                    System.out.println("Setelah diurutkan (Tahun terbesar):");
                    sistem.insertionSort();
                    sistem.tampilBuku();
                    break;

                case 5:
                    sc.nextLine();
                    System.out.print("Masukkan NIM: ");
                    String nim = sc.nextLine();
                    sistem.cariNIM(nim);
                    break;


            }

        } while (pilih != 0);
    }
}
