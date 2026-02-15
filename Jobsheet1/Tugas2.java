import java.util.Scanner;

public class Tugas2 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Masukkan jumlah jadwal kuliah: ");
        int n = Integer.parseInt(sc.nextLine());

        String[][] jadwal = new String[n][4];
        int pilihan;

        while (true) {

            System.out.println("\n===== MENU JADWAL KULIAH =====");
            System.out.println("1. Input Jadwal Kuliah");
            System.out.println("2. Tampilkan Semua Jadwal");
            System.out.println("3. Tampilkan Jadwal Berdasarkan Hari");
            System.out.println("4. Tampilkan Jadwal Berdasarkan Mata Kuliah");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");

            pilihan = Integer.parseInt(sc.nextLine());

            switch (pilihan) {
                case 1:
                    inputJadwal(jadwal, n);
                    break;
                case 2:
                    tampilSemua(jadwal, n);
                    break;
                case 3:
                    tampilHari(jadwal, n);
                    break;
                case 4:
                    tampilMatkul(jadwal, n);
                    break;
                case 0:
                    System.out.println("Program selesai.");
                    return;
                default:
                    System.out.println("Menu tidak valid!");
            }
        }
    }

    static void inputJadwal(String[][] jadwal, int n) {

        for (int i = 0; i < n; i++) {

            System.out.println("\nJadwal ke-" + (i + 1));

            System.out.print("Nama Mata Kuliah : ");
            jadwal[i][0] = sc.nextLine();

            System.out.print("Ruang            : ");
            jadwal[i][1] = sc.nextLine();

            System.out.print("Hari Kuliah      : ");
            jadwal[i][2] = sc.nextLine();

            System.out.print("Jam Kuliah       : ");
            jadwal[i][3] = sc.nextLine();
        }
    }

    public static void tampilSemua(String[][] jadwal, int n) {

        System.out.println("\n======================================================================");
        System.out.printf("%-25s %-20s %-15s %-15s%n",
                "Mata Kuliah", "Ruang", "Hari", "Jam");
        System.out.println("======================================================================");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-25s %-20s %-15s %-15s%n",
                    jadwal[i][0],
                    jadwal[i][1],
                    jadwal[i][2],
                    jadwal[i][3]);
        }
    }

    public static void tampilHari(String[][] jadwal, int n) {

        System.out.print("Masukkan hari: ");
        String hari = sc.nextLine();

        boolean ketemu = false;

        for (int i = 0; i < n; i++) {

            if (jadwal[i][2].equalsIgnoreCase(hari)) {

                System.out.println("\nDetail Jadwal");
                System.out.println("----------------------------------");
                System.out.printf("%-15s : %s%n", "Mata Kuliah", jadwal[i][0]);
                System.out.printf("%-15s : %s%n", "Ruang", jadwal[i][1]);
                System.out.printf("%-15s : %s%n", "Hari", jadwal[i][2]);
                System.out.printf("%-15s : %s%n", "Jam", jadwal[i][3]);

                ketemu = true;
            }
        }

        if (!ketemu) {
            System.out.println("Tidak ada jadwal pada hari tersebut.");
        }
    }

    public static void tampilMatkul(String[][] jadwal, int n) {

        System.out.print("Masukkan nama mata kuliah: ");
        String matkul = sc.nextLine();

        boolean ketemu = false;

        for (int i = 0; i < n; i++) {

            if (jadwal[i][0].equalsIgnoreCase(matkul)) {

                System.out.println("\nDetail Jadwal Mata Kuliah");
                System.out.println("----------------------------------");
                System.out.printf("%-15s : %s%n", "Mata Kuliah", jadwal[i][0]);
                System.out.printf("%-15s : %s%n", "Ruang", jadwal[i][1]);
                System.out.printf("%-15s : %s%n", "Hari", jadwal[i][2]);
                System.out.printf("%-15s : %s%n", "Jam", jadwal[i][3]);

                ketemu = true;
                break;
            }
        }

        if (!ketemu) {
            System.out.println("Mata kuliah tidak ditemukan.");
        }
    }
}