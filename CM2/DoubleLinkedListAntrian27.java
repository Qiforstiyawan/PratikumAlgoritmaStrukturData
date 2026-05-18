package CM2;

public class DoubleLinkedListAntrian27 {
    NodePembeli27 head, tail;
    int nomorOtomatis = 1;

    public void tambahAntrian27(String nama, String noHp) {
        Pembeli27 pembeli = new Pembeli27(nomorOtomatis, nama, noHp);
        NodePembeli27 baru = new NodePembeli27(pembeli);

        if (head == null) {
            head = tail = baru;
        } else {
            tail.next = baru;
            baru.prev = tail;
            tail = baru;
        }

        System.out.println("Antrian berhasil ditambahkan dengan nomor: " + nomorOtomatis);
        nomorOtomatis++;
    }

    public void cetakAntrian27() {
        if (head == null) {
            System.out.println("\nDaftar antrian masih kosong.");
            return;
        }

        System.out.println("\n=================================");
        System.out.println("       DAFTAR ANTRIAN PEMBELI");
        System.out.println("=================================");

        NodePembeli27 current = head;

        while (current != null) {
            System.out.println("No Antrian : " + current.data.noAntrian);
            System.out.println("Nama       : " + current.data.namaPembeli);
            System.out.println("No HP      : " + current.data.noHp);
            System.out.println("---------------------------------");

            current = current.next;
        }
    }

    public Pembeli27 hapusAntrian27(int noAntrian) {
        NodePembeli27 current = head;

        while (current != null) {
            if (current.data.noAntrian == noAntrian) {
                if (current == head && current == tail) {
                    head = tail = null;
                } else if (current == head) {
                    head = head.next;
                    head.prev = null;
                } else if (current == tail) {
                    tail = tail.prev;
                    tail.next = null;
                } else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }

                return current.data;
            }

            current = current.next;
        }

        return null;
    }
}