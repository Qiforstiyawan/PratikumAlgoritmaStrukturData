package P6;

import java.util.Scanner;

public class DosenMain27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen27 data = new DataDosen27();
        int pilihan;

        do {
            System.out.println("====================================");
            System.out.println("Menu Data Dosen");
            System.out.println("1. Tambah data dosen");
            System.out.println("2. Tampil data dosen");
            System.out.println("3. Sorting ASC (usia)");
            System.out.println("4. Sorting DSC (usia)");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    if (data.idx >= data.dataDosen.length) {
                        System.out.println("Data dosen sudah penuh");
                        break;
                    }
                    System.out.print("Kode         : ");
                    String kode = sc.nextLine();
                    System.out.print("Nama         : ");
                    String nama = sc.nextLine();
                    System.out.print("Jenis Kelamin (L/P): ");
                    String jkInput = sc.nextLine().trim();
                    boolean jk = jkInput.equalsIgnoreCase("L");
                    System.out.print("Usia         : ");
                    int usia = sc.nextInt();
                    sc.nextLine();

                    Dosen27 dsn = new Dosen27(kode, nama, jk, usia);
                    data.tambah(dsn);
                    System.out.println("Data dosen berhasil ditambahkan");
                    break;
                case 2:
                    data.tampil();
                    break;
                case 3:
                    data.SortingASC();
                    System.out.println("Data dosen berhasil diurutkan ASC");
                    data.tampil();
                    break;
                case 4:
                    data.sortingDSC();
                    System.out.println("Data dosen berhasil diurutkan DSC");
                    data.tampil();
                    break;
                case 5:
                    System.out.println("Keluar...");
                    break;
                default:
                    System.out.println("Menu tidak valid");
                    break;
            }
        } while (pilihan != 5);
    }
}
