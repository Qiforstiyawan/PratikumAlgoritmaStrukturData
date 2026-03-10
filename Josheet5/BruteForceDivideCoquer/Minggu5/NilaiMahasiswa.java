package Josheet5.BruteForceDivideCoquer.Minggu5;

public class NilaiMahasiswa {
    Mahasiswa[] dataMahasiswa;

    public NilaiMahasiswa(Mahasiswa[] dataMahasiswa) {
        this.dataMahasiswa = dataMahasiswa;
    }

    public int maxUTS(int left, int right) {
        if (left == right) {
            return dataMahasiswa[left].nilaiUTS;
        }

        int mid = (left + right) / 2;
        int maxKiri = maxUTS(left, mid);
        int maxKanan = maxUTS(mid + 1, right);

        return Math.max(maxKiri, maxKanan);
    }

    public int minUTS(int left, int right) {
        if (left == right) {
            return dataMahasiswa[left].nilaiUTS;
        }

        int mid = (left + right) / 2;
        int minKiri = minUTS(left, mid);
        int minKanan = minUTS(mid + 1, right);

        return Math.min(minKiri, minKanan);
    }

    public double rataRataUAS() {
        int total = 0;
        for (int i = 0; i < dataMahasiswa.length; i++) {
            total += dataMahasiswa[i].nilaiUAS;
        }
        return (double) total / dataMahasiswa.length;
    }

    public String mahasiswaNilaiTertinggi(int nilaiTertinggi) {
        for (int i = 0; i < dataMahasiswa.length; i++) {
            if (dataMahasiswa[i].nilaiUTS == nilaiTertinggi) {
                return dataMahasiswa[i].nama;
            }
        }
        return "-";
    }


    public String mahasiswaNilaiTerendah(int nilaiTerendah) {
        for (int i = 0; i < dataMahasiswa.length; i++) {
            if (dataMahasiswa[i].nilaiUTS == nilaiTerendah) {
                return dataMahasiswa[i].nama;
            }
        }
        return "-";
    }
}