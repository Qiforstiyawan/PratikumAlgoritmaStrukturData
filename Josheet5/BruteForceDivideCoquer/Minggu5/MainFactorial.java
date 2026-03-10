package Josheet5.BruteForceDivideCoquer.Minggu5;

import java.util.Scanner;

public class MainFactorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai: ");
        int nilai = input.nextInt();

        Faktorial fk = new Faktorial();
        System.out.println("Nilai faktorial " + nilai + 
        " Menggunakan BF: " + fk.faktorialBF(nilai));
        System.out.println("Nilai faktorial " + nilai + 
        " Menggunakan BF: " + fk.faktorialDC(nilai));
    }
}
