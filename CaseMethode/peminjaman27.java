package CaseMethode;

public class peminjaman27 {
    mahasiswa27 mhs;
    buku27 buku;
    int lamaPinjam;
    int terlambat;
    int denda;

    peminjaman27(mahasiswa27 mhs, buku27 buku, int lamaPinjam) {
        this.mhs = mhs;
        this.buku = buku;
        this.lamaPinjam = lamaPinjam;
        hitungDenda();
    }

    void hitungDenda() {
        if (lamaPinjam > 5) {
            terlambat = lamaPinjam - 5;
            denda = terlambat * 2000;
        } else {
            denda = 0;
        }
    }

    void tampil() {
        System.out.println(mhs.nama + " | " +
                buku.judul + " | Lama: " + lamaPinjam + " | Terlambat: " + terlambat + " | Denda: " + denda);
    }
}
