package P7;

import java.util.Scanner;

public class mahasiswaDemo27 {
    public static void main(String[] args) {
        MahasiswaBerprestasi27 list = new MahasiswaBerprestasi27();
        Scanner sc = new Scanner(System.in);
        int jumMhs = 5;

        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            String nim = sc.nextLine();
            System.out.print("Nama  : ");
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK   : ");
            String ip = sc.nextLine();
            double ipk = Double.parseDouble(ip);
            System.out.println("--------------------------------------------");

            mahasiswa27 m = new mahasiswa27(nim, nama, kelas, ipk);
            list.tambah(m);
        }

        list.tampil();

        // Sequential Search
        System.out.println("--------------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("--------------------------------------------");
        System.out.println("masukkan ipk mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        double cari = sc.nextDouble();

        System.out.println("--------------------------------------------");
        System.out.println("menggunakan sequential search");
        System.out.println("--------------------------------------------");
        int pss = list.sequentialSearching(cari);
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);

        // Binary Search
        System.out.println("--------------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("--------------------------------------------");

        System.out.println("--------------------------------------------");
        System.out.println("menggunakan binary search");
        System.out.println("--------------------------------------------");
        int pss2 = list.findBinarySearch(cari, 0, jumMhs - 1);
        list.bubbleSort();
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);
    }
}