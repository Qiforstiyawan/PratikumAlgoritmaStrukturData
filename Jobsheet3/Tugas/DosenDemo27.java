import java.util.Scanner;

public class DosenDemo27 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah dosen: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        Dosen27[] arrayOfDosen27 = new Dosen27[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nMasukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode          : ");
            String kode = sc.nextLine();
            System.out.print("Nama          : ");
            String nama = sc.nextLine();
            System.out.print("Jenis Kelamin (Pria/Wanita): ");
            String jk = sc.nextLine();
            System.out.print("Usia          : ");
            int usia = sc.nextInt();
            sc.nextLine();
            System.out.print("--------------------------------------");

            arrayOfDosen27[i] = new Dosen27(kode, nama, jk, usia);
        }

        sc.close();

        DataDosen27 data = new DataDosen27();

        System.out.println("\n=== Semua Data Dosen ===");
        data.dataSemuaDosen(arrayOfDosen27);
        System.out.println("\n=== Jumlah Dosen per Jenis Kelamin ===");
        data.jumlahDosenPerJenisKelamin(arrayOfDosen27);
        System.out.println("\n=== Rata-rata Usia per Jenis Kelamin ===");
        data.rataUsiaDosenPerJenisKelamin(arrayOfDosen27);
        System.out.println("\n=== Dosen Paling Tua ===");
        data.infoDosenPalingTua(arrayOfDosen27);
        System.out.println("\n=== Dosen Paling Muda ===");
        data.infoDosenPalingMuda(arrayOfDosen27);
    }
}
