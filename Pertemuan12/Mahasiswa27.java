package Pertemuan12;

public class Mahasiswa27 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    public Mahasiswa27(String nm, String name, String kls, double ipk) {
        this.nim = nm;
        this.nama = name;
        this.kelas = kls;
        this.ipk = ipk;
    }

    public void tampilInformasi() {
        System.out.println(nama + "\t\t" + nim + "\t\t" + kelas + "\t\t" + ipk);
    }
}
