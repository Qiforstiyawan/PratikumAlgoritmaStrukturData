package Jobsheet3;

import java.util.Scanner;

public class Matakuliahdemo27 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah Matakuliah: ");
        int jumlah = Integer.parseInt(sc.nextLine());

        Matakuliah27[] arrayOfMatakuliah27 = new Matakuliah27[jumlah];

        String kode, nama, dummy;
        int sks, jumlahJam;

        for(int i = 0; i < jumlah; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah27[i] = new Matakuliah27();
            
            System.out.print("Kode        : ");
            kode = sc.nextLine();
            System.out.print("Nama        : ");
            nama = sc.nextLine();
            System.out.print("Sks         : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam  : ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("-------------------------------");

            arrayOfMatakuliah27[i].tambahData(kode, nama, sks, jumlahJam);
        }

        System.out.println("\n===== DATA MATAKULIAH =====");
        for(int i = 0; i < jumlah; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah27[i].cetakInfo();
            System.out.println("-----------------------------------");
        }

        sc.close();
    }
}