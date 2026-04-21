package Jobsheet9;

public class StackSurat27 {
    Surat27[] stack;
    int size;
    int top;

    public StackSurat27(int size) {
        this.size = size;
        stack = new Surat27[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(Surat27 srt) {
        if (!isFull()) {
            top++;
            stack[top] = srt;
        } else {
            System.out.println("Stack penuh!");
        }
    }

    public Surat27 pop() {
        if (!isEmpty()) {
            Surat27 srt = stack[top];
            top--;
            return srt;
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }

    public Surat27 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Belum ada surat yang masuk.");
            return null;
        }
    }

    public void cariSurat(String nama) {
        boolean ditemukan = false;
        for (int i = top; i >= 0; i--) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                System.out.println("Surat ditemukan pada tumpukan ke-" + (i + 1));
                System.out.println("ID: " + stack[i].idSurat + " | Jenis: " + stack[i].jenisIzin + " | Durasi: " + stack[i].durasi + " hari");
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Surat atas nama " + nama + " tidak ditemukan.");
        }
    }
}
