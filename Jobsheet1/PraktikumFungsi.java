import java.util.Scanner;

public class PraktikumFungsi {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        double[][] stokTanaman = {
                { 10, 5, 15, 7 },
                { 6, 11, 9, 12 },
                { 2, 10, 10, 5 },
                { 5, 7, 12, 9 }
        };

        String[] namaTanaman = { "Aglonema", "Keladi", "Alocasia", "Mawar" };
        double[] hargaTanaman = { 75000, 50000, 60000, 10000 };

        double[] totalPendapatan = hitungPendapatan(stokTanaman, hargaTanaman);

        while (true) {
            System.out.println("\n=================");
            System.out.println("Menu Program");
            System.out.println("1. Detail Pendapatan Cabang");
            System.out.println("2. Status Cabang");
            System.out.println("3. Keluar");
            System.out.print("Pilih : ");

            int pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    tampilkanDetailCabang(stokTanaman, namaTanaman, hargaTanaman);
                    break;
                case 2:
                    tampilkanStatus(totalPendapatan);
                    break;
                case 3:
                    System.out.println("Program selesai.");
                    return;
                default:
                    System.out.println("Menu tidak tersedia.");
            }
        }
    }

    public static double[] hitungPendapatan(double[][] stok, double[] harga) {
        double[] total = new double[stok.length];

        for (int i = 0; i < stok.length; i++) {
            for (int j = 0; j < stok[i].length; j++) {
                total[i] += stok[i][j] * harga[j];
            }
        }
        return total;
    }

    public static void tampilkanDetailCabang(double[][] stok,
            String[] namaTanaman,
            double[] harga) {

        System.out.print("Pilih Cabang (1-4) : ");
        int cabang = input.nextInt();

        if (cabang < 1 || cabang > stok.length) {
            System.out.println("Cabang tidak valid.");
            return;
        }

        double total = 0;

        System.out.println("\nDetail Pendapatan Cabang " + cabang);

        for (int j = 0; j < stok[cabang - 1].length; j++) {
            double pendapatan = stok[cabang - 1][j] * harga[j];
            total += pendapatan;

            System.out.println(namaTanaman[j] +
                    " -> Stok: " + stok[cabang - 1][j] +
                    " | Pendapatan: Rp " + pendapatan);
        }

        System.out.println("Total Pendapatan: Rp " + total);
    }

    public static void tampilkanStatus(double[] total) {

        System.out.print("Pilih Cabang (1-4) : ");
        int cabang = input.nextInt();

        if (cabang >= 1 && cabang <= total.length) {

            String status = (total[cabang - 1] > 1500000)
                    ? "Sangat Baik"
                    : "Perlu Evaluasi";

            System.out.println("Status Royal Garden " +
                    cabang + " : " + status);

        } else {
            System.out.println("Cabang tidak valid.");
        }
    }
}