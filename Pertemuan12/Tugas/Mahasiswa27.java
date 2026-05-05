package Pertemuan12.Tugas;

public class Mahasiswa27 {
    String nim, nama, keperluan;

    public Mahasiswa27(String nim, String nama, String keperluan) {
        this.nim = nim;
        this.nama = nama;
        this.keperluan = keperluan;
    }

    public void tampilInformasi() {
        System.out.println(nim + "\t" + nama + "\t" + keperluan);
    }
}   