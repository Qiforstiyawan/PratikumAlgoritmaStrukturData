package Jobsheet9;

import java.util.Scanner;

public class SuratMain27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackSurat27 st = new StackSurat27(10);
        int pilih;

        do {
            System.out.println("\nMenu Admin Prodi:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin (Validasi)");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String id = sc.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kls = sc.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jns = sc.next().charAt(0);
                    System.out.print("Durasi (hari): ");
                    int dur = sc.nextInt();
                    st.push(new Surat27(id, nama, kls, jns, dur));
                    break;
                case 2:
                    Surat27 diproses = st.pop();
                    if (diproses != null) {
                        System.out.println("Surat milik " + diproses.namaMahasiswa + " telah divalidasi.");
                    }
                    break;
                case 3:
                    Surat27 teratas = st.peek();
                    if (teratas != null) {
                        System.out.println("Surat teratas: " + teratas.idSurat + " atas nama " + teratas.namaMahasiswa);
                    }
                    break;
                case 4:
                    System.out.print("Masukkan nama mahasiswa yang dicari: ");
                    String cariNama = sc.nextLine();
                    st.cariSurat(cariNama);
                    break;
            }
        } while (pilih != 5);
    }
}
