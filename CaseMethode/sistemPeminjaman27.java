package CaseMethode;

public class sistemPeminjaman27 {
    peminjaman27[] listPinjam;
    int idx;

    buku27[] listPinjamBuku;
    int idxBuku;

    sistemPeminjaman27(int size, int sizeBuku) {
        listPinjam = new peminjaman27[size];
        listPinjamBuku = new buku27[sizeBuku];
    }

    void tambah(peminjaman27 p) {
        listPinjam[idx] = p;
        idx++;
    }

    void tambahBuku(buku27 r) {
        listPinjamBuku[idxBuku] = r;
        idxBuku++;
    }

    void tampil() {
        for (int i = 0; i < idx; i++) {
            listPinjam[i].tampil();
        }
    }

    void tampilBuku() {
        for (int i = 0; i < idxBuku; i++) {
            listPinjamBuku[i].tampil();
        }
    }

    void insertionSort() {
        for (int i = 1; i < idxBuku; i++) {
            buku27 temp = listPinjamBuku[i];
            int j = i - 1;

            while (j >= 0 && listPinjamBuku[j].tahunTerbit < temp.tahunTerbit) {
                listPinjamBuku[j + 1] = listPinjamBuku[j];
                j--;
            }

            listPinjamBuku[j + 1] = temp;
        }
    }

    void cariNIM(String nim) {
        int left = 0;
        int right = idx - 1;
        boolean found = false;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (listPinjam[mid].mhs.nim.equals(nim)) {
                listPinjam[mid].tampil();
                found = true;
            }

            if (listPinjam[mid].mhs.nim.compareTo(nim) < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;    
            }
        }

        if (found) {
            int i = left - 1;
            while (i >= 0 && listPinjam[i].mhs.nim.equals(nim)) {
                listPinjam[i].tampil();
                i--;
            }

            i = left + 1;
            while (i < idx && listPinjam[i].mhs.nim.equals(nim)) {
                listPinjam[i].tampil();
                i++;
            }
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }
}
