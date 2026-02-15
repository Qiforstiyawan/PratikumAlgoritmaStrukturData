import java.util.Scanner;

public class PraktikumPerulangan {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("NIM\t: ");
        long nim = sc.nextLong();

        int n = (int) (nim % 100);
        if (n < 10) {
            n += 10;
        }
        System.out.println("Nilai n = " + n);

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                System.out.print("# ");
            } else if (i % 2 == 1) {
                System.out.print("* ");
            } else if (i == 10 || i == 15) {
                continue;
            } else {
                System.out.print(i + " ");
            }

        }

        sc.close();
    }
}