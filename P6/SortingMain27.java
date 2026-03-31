package P6;

public class SortingMain27 {
    public class SortingMain {
        public static void main(String[] args) {

            int a[] = { 34, 7, 23, 32, 5, 62 };
            int b[] = { 30, 20, 2, 8, 14 };
            int c[] = { 40, 10, 4, 9, 3 };


            Sorting dataurut1 = new Sorting(a, a.length);
            Sorting dataurut2 = new Sorting(b, b.length);
            Sorting dataurut3 = new Sorting(c, c.length);

            System.out.println("Data awal 1");
            dataurut1.tampil();

            System.out.println("Data sudah diurutkan dengan BUBBLE SORT (ASC)");
            dataurut2.bubbleSort();
            dataurut2.tampil();

            System.out.println("Data awal 2");
            dataurut1.tampil();

            System.out.println("Data sudah diurutkan dengan SELECTION SORT (ASC)");
            dataurut2.selectionSort();
            dataurut2.tampil();

            System.out.println("Data awal 3");
            dataurut1.tampil();

            System.out.println("Data sudah diurutkan dengan INSERTION SORT (ASC)");
            dataurut3.insertionSort();
            dataurut3.tampil();
        }
    }
}
