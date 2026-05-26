package jobsheet14;

public class Mahasiswa27 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    public Mahasiswa27() {
    }

    public Mahasiswa27(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampilInformasi27() {
        System.out.println("NIM: " + nim + " Nama: " + nama + " Kelas: " + kelas + " IPK: " + ipk);
    }
}