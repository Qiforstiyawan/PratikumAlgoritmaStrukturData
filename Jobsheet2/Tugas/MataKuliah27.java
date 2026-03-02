public class MataKuliah27 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    public MataKuliah27() {

    }

    public MataKuliah27(String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    void tampilInformasi() {
        System.out.println("Kode MK      : " + kodeMK);
        System.out.println("Nama MK      : " + nama);
        System.out.println("SKS          : " + sks);
        System.out.println("Jumlah Jam   : " + jumlahJam);
        System.out.println("----------------------------");
    }

    void ubahSKS(int sksBaru) {
        sks = sksBaru;
        System.out.println("SKS berhasil diubah menjadi " + sks);
    }

    void tambahJam(int jam) {
        jumlahJam += jam;
        System.out.println("Jumlah jam sekarang: " + jumlahJam);
    }

    void kurangiJam(int jam) {
        if (jumlahJam >= jam) {
            jumlahJam -= jam;
            System.out.println("Jumlah jam sekarang: " + jumlahJam);
        } else {
            System.out.println("Jam tidak cukup untuk dikurangi!");
        }
    }
}

