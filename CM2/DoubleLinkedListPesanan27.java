package CM2;

public class DoubleLinkedListPesanan27 {
    NodePesanan27 head, tail;

    public void tambahPesanan27(Pesanan27 pesanan) {
        NodePesanan27 baru = new NodePesanan27(pesanan);

        if (head == null) {
            head = tail = baru;
        } else {
            tail.next = baru;
            baru.prev = tail;
            tail = baru;
        }
    }

    public void sortingNamaPesanan27() {
        if (head == null || head.next == null) {
            return;
        }

        boolean tukar;

        do {
            tukar = false;
            NodePesanan27 current = head;

            while (current.next != null) {
                if (current.data.namaPesanan.compareToIgnoreCase(current.next.data.namaPesanan) > 0) {
                    Pesanan27 temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                    tukar = true;
                }

                current = current.next;
            }
        } while (tukar);
    }

    public void cetakLaporan27() {
        if (head == null) {
            System.out.println("\nBelum ada pesanan masuk.");
            return;
        }

        sortingNamaPesanan27();

        int total = 0;

        System.out.println("\n=================================");
        System.out.println("          LAPORAN PESANAN");
        System.out.println("     Urut Berdasarkan Nama");
        System.out.println("=================================");

        NodePesanan27 current = head;

        while (current != null) {
            System.out.println("Kode Pesanan : " + current.data.kodePesanan);
            System.out.println("Nama Pesanan : " + current.data.namaPesanan);
            System.out.println("Nama Pembeli : " + current.data.namaPembeli);
            System.out.println("Harga        : Rp " + current.data.harga);
            System.out.println("---------------------------------");

            total += current.data.harga;
            current = current.next;
        }

        System.out.println("Total Pendapatan : Rp " + total);
        System.out.println("=================================");
    }
}