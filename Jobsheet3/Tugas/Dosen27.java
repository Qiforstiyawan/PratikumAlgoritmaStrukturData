public class Dosen27 {
    String kode;
    String nama;
    String jenisKelamin;
    int usia;

    public Dosen27(String kode, String nama, String jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }

    void tampilInfo() {
        System.out.println("Kode          : " + kode);
        System.out.println("Nama          : " + nama);
        System.out.println("Jenis Kelamin : " + jenisKelamin);
        System.out.println("Usia          : " + usia);
        System.out.println("------------------------------");
    }
}
