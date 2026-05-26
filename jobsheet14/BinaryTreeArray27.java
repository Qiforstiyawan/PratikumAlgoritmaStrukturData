package jobsheet14;

public class BinaryTreeArray27 {
    Mahasiswa27[] dataMahasiswa;
    int idxLast;

    public BinaryTreeArray27() {
        this.dataMahasiswa = new Mahasiswa27[10];
        this.idxLast = -1;
    }

    public void populateData27(Mahasiswa27[] dataMhs, int idxLast) {
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    public void traverseInOrder27(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                traverseInOrder27(2 * idxStart + 1);
                dataMahasiswa[idxStart].tampilInformasi27();
                traverseInOrder27(2 * idxStart + 2);
            }
        }
    }

    // Tugas Praktikum nomor 4
    public void add27(Mahasiswa27 data) {
        if (idxLast == dataMahasiswa.length - 1) {
            System.out.println("Array tree sudah penuh");
            return;
        }

        idxLast++;
        dataMahasiswa[idxLast] = data;
    }

    // Tugas Praktikum nomor 4
    public void traversePreOrder27(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                dataMahasiswa[idxStart].tampilInformasi27();
                traversePreOrder27(2 * idxStart + 1);
                traversePreOrder27(2 * idxStart + 2);
            }
        }
    }
}
