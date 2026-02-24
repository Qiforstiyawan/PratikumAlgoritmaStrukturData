package Jobsheet2;

public class MahasiswaMain27 {

    public static void main(String[] args) {
        Mahasiswa27 mhs1 = new Mahasiswa27();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2k");
        mhs1.updateIpk(3.60);
        mhs1.tampilkanInformasi();

        Mahasiswa27 mhs2 = new Mahasiswa27("Annisa Nabila", "2131720160", 3.25, "TI 2L");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();

        Mahasiswa27 mhsRofiq = new Mahasiswa27("Rofiq Aristiyawan", "254107020060", 3.5,"TI 1G");
        mhsRofiq.updateIpk(3.6);
        mhsRofiq.tampilkanInformasi();
    }
}