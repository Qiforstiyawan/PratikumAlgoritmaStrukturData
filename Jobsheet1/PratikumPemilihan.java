import java.util.Scanner;

public class PratikumPemilihan {

    public static void main(String[] args) {

        double nilaiTugas, nilaiKuis, nilaiUts, nilaiUas, nilaiAkhir;
        String grade = "", statusLulus = "";

        Scanner sc = new Scanner(System.in);

        System.out.println("Program Menghitung Nilai Akhir ");

        while (true) {
            System.out.println("==============================");

            System.out.print("Masukan Nilai Tugas\t: ");
            nilaiTugas = sc.nextDouble();

            System.out.print("Masukan Nilai Kuis\t: ");
            nilaiKuis = sc.nextDouble();

            System.out.print("Masukan Nilai UTS\t: ");
            nilaiUts = sc.nextDouble();

            System.out.print("Masukan Nilai UAS\t: ");
            nilaiUas = sc.nextDouble();

            System.out.println("==============================");

            if (nilaiTugas < 0 || nilaiTugas > 100 ||
                nilaiKuis < 0 || nilaiKuis > 100 ||
                nilaiUts < 0 || nilaiUts > 100 ||
                nilaiUas < 0 || nilaiUas > 100) {

                System.out.println("==============================");
                System.out.println("Nilai Tidak Valid");
                System.out.println("==============================");

            } else {
                break;
            }
        }

        nilaiAkhir = nilaiTugas * 0.2 + nilaiKuis * 0.2 + nilaiUts * 0.3 + nilaiUas * 0.3;

        if (nilaiAkhir <= 100 && nilaiAkhir > 80) {
            grade = "A";
            statusLulus = "Lulus";
        } else if (nilaiAkhir <= 80 && nilaiAkhir > 73) {
            grade = "B+";
            statusLulus = "Lulus";
        } else if (nilaiAkhir <= 73 && nilaiAkhir > 65) {
            grade = "B";
            statusLulus = "Lulus";
        } else if (nilaiAkhir <= 65 && nilaiAkhir > 60) {
            grade = "C+";
            statusLulus = "Lulus";
        } else if (nilaiAkhir <= 60 && nilaiAkhir > 50) {
            grade = "C";
            statusLulus = "Lulus";
        } else if (nilaiAkhir <= 50 && nilaiAkhir > 39) {
            grade = "D";
            statusLulus = "Tidak Lulus";
        } else if (nilaiAkhir <= 39 && nilaiAkhir > 0) {
            grade = "E";
            statusLulus = "Tidak Lulus";
        }

        System.out.println("Nilai Akhir\t: " + nilaiAkhir);
        System.out.println("Nilai Huruf\t: " + grade);
        System.out.println("==============================");
        System.out.println("==============================");

        if (nilaiAkhir <= 50) {
            System.out.println("ANDA " + statusLulus);
        } else {
            System.out.println("SELAMAT ANDA " + statusLulus);
        }

        sc.close();
    }
}