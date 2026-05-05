package Pertemuan12.Tugas;

import java.util.Scanner;

public class LayananMain27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan batas maksimal antrian: ");
        int max = sc.nextInt();
        sc.nextLine();
        QueueLinkedList27 Queue = new QueueLinkedList27(max);
        
        int pilih;

        do {
            System.out.println("===== ANTRIAN LAYANAN UNIT KEMAHASISWAAN =====");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cek Antrian Kosong");
            System.out.println("3. Cek Antrian Penuh");
            System.out.println("4. Panggil Antrian");
            System.out.println("5. Tampilkan Antrian Terdepan");
            System.out.println("6. Tampilkan Antrian Paling Akhir");
            System.out.println("7. Tampilkan Semua Antrian");
            System.out.println("8. Tampilkan Jumlah Mahasiswa Mengantre");
            System.out.println("9. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("NIM       : ");
                    String nim = sc.nextLine();

                    System.out.print("Nama      : ");
                    String nama = sc.nextLine();

                    System.out.print("Keperluan : ");
                    String keperluan = sc.nextLine();

                    Mahasiswa27 mhs = new Mahasiswa27(nim, nama, keperluan);
                    Queue.enqueue(mhs);
                    System.out.println("Mahasiswa berhasil masuk Queue");
                    break;

                case 2:
                    if (Queue.isEmpty()) {
                        System.out.println("Antrian kosong");
                    } else {
                        System.out.println("Antrian tidak kosong");
                    }
                    break;

                case 3:
                    if (Queue.isFull()) {
                        System.out.println("Antrian penuh");
                    } else {
                        System.out.println("Antrian tidak penuh");
                    }
                    break;

                case 4:
                    Queue.dequeue();
                    break;

                case 5:
                    Queue.peek();
                    break;

                case 6:
                    Queue.peekRear();
                    break;

                case 7:
                    Queue.print();
                    break;

                case 8:
                    System.out.println("Jumlah mahasiswa yang masih mengantre: " + Queue.getSize());
                    break;

                case 9:
                    Queue.clear();
                    System.out.println("Antrian berhasil dikosongkan");
                    break;

                case 0:
                    System.out.println("Program selesai");
                    break;

                default:
                    System.out.println("Menu tidak valid");
            }

            System.out.println();
        } while (pilih != 0);

        sc.close();
    }
}