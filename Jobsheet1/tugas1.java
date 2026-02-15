import java.util.Scanner;

public class tugas1 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        char[][] kota = {
                {'B','A','N','T','E','N'},
                {'J','A','K','A','R','T','A'},
                {'B','A','N','D','U','N','G'},
                {'C','I','R','E','B','O','N'},
                {'B','O','G','O','R'},
                {'P','E','K','A','L','O','N','G','A','N'},
                {'S','E','M','A','R','A','N','G'},
                {'S','U','R','A','B','A','Y','A'},
                {'M','A','L','A','N','G'},
                {'T','E','G','A','L'}
        };

        char[] kode = {'A','B','D','E','F','G','H','L','N','T'};

        System.out.print("Masukkan kode: ");
        char key = sc.next().toUpperCase().charAt(0);

        int index = searchKode(key, kode);

        if (index == -1) {
            System.out.println("Kode tidak ditemukan.");
        } else {
            for (int i = 0; i < kota[index].length; i++) {
                System.out.print(kota[index][i]);
            }
        }
    }

    public static int searchKode(char key, char[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i]) {
                return i;
            }
        }

        return -1;
    }
}