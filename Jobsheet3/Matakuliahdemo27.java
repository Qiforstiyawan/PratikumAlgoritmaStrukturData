package Jobsheet3;

import java.util.Scanner;

public class Matakuliahdemo27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Matakuliah27[] arrayOfMatakuliah27 = new Matakuliah27[3];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for(int i=0; i <3; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            System.out.println("Kode        : ");
            kode = sc.nextLine();
            System.out.println("Nama        : ");
            nama = sc.nextLine();
            System.out.println("Sks         : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.println("Jumlah jam  : ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("-------------------------------");

            arrayOfMatakuliah27[i] = new Matakuliah27(kode, nama, sks, jumlahJam);
        }

        for(int i=0; i <3; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            System.out.println("Kode            : "+ arrayOfMatakuliah27[i].kode);
            System.out.println("Nama            : "+ arrayOfMatakuliah27[i].nama);
            System.out.println("Nama            : "+ arrayOfMatakuliah27[i].sks);
            System.out.println("Nama            : "+ arrayOfMatakuliah27[i].jumlahJam);
            System.out.println("--------------------------------------------");
        }
        
        sc.close();
    }
}
