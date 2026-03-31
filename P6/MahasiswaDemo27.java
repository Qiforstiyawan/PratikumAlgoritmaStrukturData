package P6;

import java.util.Scanner;

public class MahasiswaDemo27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MahasiswaBerprestasi27 list = new MahasiswaBerprestasi27();

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jmlMhs = sc.nextInt();
        sc.nextLine();
        list.listMhs = new Mahasiswa27[jmlMhs];

        for (int i = 0; i < jmlMhs; i++) {
            System.out.println("--- Input Data Mahasiswa ke-" + (i + 1) + " ---");
            System.out.print("NIM   : ");
            String nim = sc.nextLine();
            System.out.print("Nama  : ");
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK   : ");
            double ipk = sc.nextDouble();
            sc.nextLine();

            Mahasiswa27 m = new Mahasiswa27(nim, nama, kelas, ipk);
            list.tambah(m);
            System.out.println();
        }

        System.out.println("Data Mahasiswa sebelum sorting:");
        list.tampil();

        System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC):");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC):");
        list.selectionSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC):");
        list.insertionSort();
        list.tampil();
    }
}