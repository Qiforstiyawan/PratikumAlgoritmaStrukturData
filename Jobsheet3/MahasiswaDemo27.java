package Jobsheet3;

import java.util.Scanner;

public class MahasiswaDemo27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa27 [] arrayOfMahasiswa27 = new Mahasiswa27[3];
        String dummy;

        for(int i=0; i < 3; i++) {
            arrayOfMahasiswa27[i] = new Mahasiswa27();

            System.out.println("Masukkan Data MAhasiswa ke-" + (i + 1));
            System.out.println("NIM     : ");
            arrayOfMahasiswa27[i].nim = sc.nextLine();
            System.out.println("Nama    : ");
            arrayOfMahasiswa27[i].nama = sc.nextLine();
            System.out.println("Kelas   : ");
            arrayOfMahasiswa27[i].kelas = sc.nextLine();
            System.out.println("IPK     : ");
            dummy = sc.nextLine();
            arrayOfMahasiswa27[i].ipk = Float.parseFloat(dummy);
            System.out.println("----------------------------------");
        }

        for(int i=0; i < 3; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            arrayOfMahasiswa27[i].cetakInfo();
        }

        sc.close();
    }
}
