package Pertemuan12.Tugas;

public class QueueLinkedList27 {
    Node27 head, tail;
    int size;
    int max;

    public QueueLinkedList27(int max) {
        this.max = max;
        this.size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public boolean isFull() {
        return size == max;
    }

    public void enqueue(Mahasiswa27 input) {
        if (isFull()) {
            System.out.println("Antrian penuh, mahasiswa tidak dapat ditambahkan.");
            return;
        }

        Node27 ndInput = new Node27(input, null);

        if (isEmpty()) {
            head = tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }

        size++;
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Mahasiswa dipanggil:");
            head.data.tampilInformasi();
            head = head.next;
            size--;

            if (head == null) {
                tail = null;
            }
        }
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("Antrian terdepan:");
            head.data.tampilInformasi();
        } else {
            System.out.println("Antrian kosong");
        }
    }

    public void peekRear() {
        if (!isEmpty()) {
            System.out.println("Antrian paling akhir:");
            tail.data.tampilInformasi();
        } else {
            System.out.println("Antrian kosong");
        }
    }

    public void print() {
        if (!isEmpty()) {
            Node27 temp = head;
            System.out.println("Isi Antrian:");
            while (temp != null) {
                temp.data.tampilInformasi();
                temp = temp.next;
            }
        } else {
            System.out.println("Antrian kosong");
        }
    }

    public int getSize() {
        return size;
    }

    public void clear() {
        head = tail = null;
        size = 0;
    }
}