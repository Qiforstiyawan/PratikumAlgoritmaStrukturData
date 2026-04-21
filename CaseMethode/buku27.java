package CaseMethode;

public class buku27 {
    mahasiswa27 mhs;
    String kodeBuku;
    String judul;
    int tahunTerbit;

    buku27(String kodeBuku, String judul, int tahunTerbit) {
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
    }

    void tampil() {
        System.out.println(kodeBuku + " | " + judul + " | " + tahunTerbit);
    }
}
