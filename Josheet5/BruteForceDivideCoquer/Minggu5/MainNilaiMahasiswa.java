package Josheet5.BruteForceDivideCoquer.Minggu5;

public class MainNilaiMahasiswa {
    public static void main(String[] args) {
        Mahasiswa[] mahasiswa = {
            new Mahasiswa("Ahmad", "220101001", 2022, 78, 82),
            new Mahasiswa("Budi", "220101002", 2022, 85, 88),
            new Mahasiswa("Cindy", "220101003", 2021, 90, 87),
            new Mahasiswa("Dian", "220101004", 2021, 76, 79),
            new Mahasiswa("Eko", "220101005", 2023, 92, 95),
            new Mahasiswa("Fajar", "220101006", 2020, 88, 85),
            new Mahasiswa("Gina", "220101007", 2023, 80, 83),
            new Mahasiswa("Hadi", "220101008", 2020, 82, 84)
        };

        NilaiMahasiswa nm = new NilaiMahasiswa(mahasiswa);

        int utsTertinggi = nm.maxUTS(0, mahasiswa.length - 1);
        int utsTerendah = nm.minUTS(0, mahasiswa.length - 1);
        double rataUAS = nm.rataRataUAS();

        System.out.println("Nilai UTS Tertinggi (Divide and Conquer): " + utsTertinggi);
        System.out.println("Mahasiswa dengan nilai UTS tertinggi: " + nm.mahasiswaNilaiTertinggi(utsTertinggi));

        System.out.println("Nilai UTS Terendah (Divide and Conquer): " + utsTerendah);
        System.out.println("Mahasiswa dengan nilai UTS terendah: " + nm.mahasiswaNilaiTerendah(utsTerendah));

        System.out.println("Rata-rata nilai UAS (Brute Force): " + rataUAS);
    }
}