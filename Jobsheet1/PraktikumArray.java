import java.util.Scanner;

public class PraktikumArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah Mata Kuliah : ");
        int totalMK = input.nextInt();
        input.nextLine();

        double[][] dataNilai = new double[3][totalMK]; // 0 = nilai angka, 1 = bobot nilai, 2 = sks
        String[] namaMatkul = new String[totalMK];
        String[] nilaiHuruf = new String[totalMK];

        isiNamaMatkul(namaMatkul, input);
        isiNilai(dataNilai, nilaiHuruf, namaMatkul, input);
        tampilkanHasil(dataNilai, nilaiHuruf, namaMatkul);
    }

    static void isiNamaMatkul(String[] namaMatkul, Scanner input) {
        for (int i = 0; i < namaMatkul.length; i++) {
            System.out.print("Masukkan nama MK ke-" + (i + 1) + " : ");
            namaMatkul[i] = input.nextLine();
        }
    }

    static void isiNilai(double[][] dataNilai, String[] nilaiHuruf,
            String[] namaMatkul, Scanner input) {

        System.out.println("\n=== Input Nilai ===");

        for (int i = 0; i < namaMatkul.length; i++) {

            while (true) {
                System.out.print("Masukkan nilai angka untuk " + namaMatkul[i] + " : ");
                dataNilai[0][i] = input.nextDouble();

                if (dataNilai[0][i] >= 0 && dataNilai[0][i] <= 100) {
                    break;
                } else {
                    System.out.println("Input tidak valid, ulangi!");
                }
            }

            nilaiHuruf[i] = konversiHuruf(dataNilai[0][i]);
            dataNilai[1][i] = konversiBobot(nilaiHuruf[i]);

            System.out.print("Masukkan jumlah SKS " + namaMatkul[i] + " : ");
            dataNilai[2][i] = input.nextDouble();
        }
    }

    static void tampilkanHasil(double[][] dataNilai,
            String[] nilaiHuruf,
            String[] namaMatkul) {

        double totalBobotNilai = 0;
        double totalSKS = 0;

        System.out.println("\n=== Hasil Konversi Nilai ===");
        System.out.printf("%-30s %-15s %-15s %-15s%n",
                "Mata Kuliah", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");

        for (int i = 0; i < namaMatkul.length; i++) {

            double bobotNilai = dataNilai[1][i] * dataNilai[2][i];

            totalBobotNilai += bobotNilai;
            totalSKS += dataNilai[2][i];

            System.out.printf("%-30s %-15.2f %-15s %-15.2f%n",
                    namaMatkul[i],
                    dataNilai[0][i],
                    nilaiHuruf[i],
                    bobotNilai);
        }

        double Ipk = totalBobotNilai / totalSKS;

        System.out.println("-----------------------------------------------");
        System.out.println("IP Semester : " + Ipk);
    }

    static String konversiHuruf(double nilai) {

        if (nilai < 0 || nilai > 100) {
            return "Tidak Valid";
        }

        if (nilai >= 81 && nilai <= 100)
            return "A";
        else if (nilai >= 74)
            return "B+";
        else if (nilai >= 66)
            return "B";
        else if (nilai >= 61)
            return "C+";
        else if (nilai >= 51)
            return "C";
        else if (nilai >= 40)
            return "D";
        else
            return "E"; // 0 - 39
    }

    static double konversiBobot(String huruf) {

        if (huruf.equals("A"))
            return 4;
        else if (huruf.equals("B+"))
            return 3.5;
        else if (huruf.equals("B"))
            return 3;
        else if (huruf.equals("C+"))
            return 2.5;
        else if (huruf.equals("C"))
            return 2;
        else if (huruf.equals("D"))
            return 1;
        else if (huruf.equals("E"))
            return 0;
        else
            return 0; // untuk "Tidak Valid"
    }
}