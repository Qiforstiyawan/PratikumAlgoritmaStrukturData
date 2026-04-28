package TugasJobsheet10;

public class AntrianKRS {
    Mahasiswa[] data;
    int front;
    int rear;
    int size;
    int max;
    int jumlahProses;
    final int totalMahasiswa = 30;

    public AntrianKRS(int max) {
        this.max = max;
        data = new Mahasiswa[max];
        front = 0;
        rear = -1;
        size = 0;
        jumlahProses = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void clear() {
        front = 0;
        rear = -1;
        size = 0;
        System.out.println("Antrian berhasil dikosongkan.");
    }

    public void tambahAntrian(Mahasiswa mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh. Maksimal antrian adalah " + max + " mahasiswa.");
            return;
        }

        if (jumlahProses + size >= totalMahasiswa) {
            System.out.println("Kuota DPA sudah mencapai 30 mahasiswa.");
            return;
        }

        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil masuk ke antrian KRS.");
    }

    private Mahasiswa keluarkanSatu() {
        Mahasiswa mhs = data[front];
        data[front] = null;
        front = (front + 1) % max;
        size--;

        if (size == 0) {
            front = 0;
            rear = -1;
        }

        return mhs;
    }

    public void prosesKRS() {
        if (isEmpty()) {
            System.out.println("Antrian kosong. Tidak ada mahasiswa yang diproses.");
            return;
        }

        System.out.println("Mahasiswa yang dipanggil untuk proses KRS:");

        for (int i = 1; i <= 2; i++) {
            if (isEmpty()) {
                break;
            }

            Mahasiswa mhs = keluarkanSatu();
            jumlahProses++;

            System.out.print(i + ". ");
            mhs.tampilkanData();
        }
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }

        System.out.println("Daftar antrian KRS:");
        System.out.println("NIM - NAMA - PRODI - KELAS");

        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }

    public void tampilkanDuaTerdepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }

        int jumlahTampil = Math.min(2, size);

        System.out.println("Dua mahasiswa terdepan:");
        System.out.println("NIM - NAMA - PRODI - KELAS");

        for (int i = 0; i < jumlahTampil; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }

    public void lihatAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Mahasiswa paling akhir:");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[rear].tampilkanData();
        }
    }

    public int getJumlahAntrian() {
        return size;
    }

    public int getJumlahSudahProses() {
        return jumlahProses;
    }

    public int getJumlahBelumProses() {
        return totalMahasiswa - jumlahProses;
    }
}