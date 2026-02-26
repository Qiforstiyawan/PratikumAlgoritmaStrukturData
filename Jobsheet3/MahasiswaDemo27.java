package Jobsheet3;

public class MahasiswaDemo27 {
    public static void main(String[] args) {
        Mahasiswa27 [] arrayOfMahasiswa27 = new Mahasiswa27[3];

        arrayOfMahasiswa27[0] = new Mahasiswa27();
        arrayOfMahasiswa27[0].nim = "244107060033";
        arrayOfMahasiswa27[0].nama ="AGNES TITANIA KINANTI";
        arrayOfMahasiswa27[0].kelas = "SIB -2E";
        arrayOfMahasiswa27[0].ipk = (float) 3.75;

        arrayOfMahasiswa27[1] = new Mahasiswa27();
        arrayOfMahasiswa27[1].nim = "2341720172";
        arrayOfMahasiswa27[1].nama ="ACHMAD MAULANA HAMZAH";
        arrayOfMahasiswa27[1].kelas = "TI-2A";
        arrayOfMahasiswa27[1].ipk = (float) 3.76;

        arrayOfMahasiswa27[2] = new Mahasiswa27();
        arrayOfMahasiswa27[2].nim = "24410723006";
        arrayOfMahasiswa27[2].nama ="DIRHAMAWANFUTRANTO";
        arrayOfMahasiswa27[2].kelas = "TI-2E";
        arrayOfMahasiswa27[2].ipk = (float) 3.80;

        System.out.println("NIM      : "+ arrayOfMahasiswa27[0].nim);
        System.out.println("Nama     : "+ arrayOfMahasiswa27[0].nama);
        System.out.println("Kelas    : "+ arrayOfMahasiswa27[0].kelas);
        System.out.println("IPK      : "+ arrayOfMahasiswa27[0].ipk);
        System.out.println("---------------------------------------");
        System.out.println("NIM      : "+ arrayOfMahasiswa27[1].nim);
        System.out.println("Nama     : "+ arrayOfMahasiswa27[1].nama);
        System.out.println("Kelas    : "+ arrayOfMahasiswa27[1].kelas);
        System.out.println("IPK      : "+ arrayOfMahasiswa27[1].ipk);
        System.out.println("---------------------------------------");
        System.out.println("NIM      : "+ arrayOfMahasiswa27[2].nim);
        System.out.println("Nama     : "+ arrayOfMahasiswa27[2].nama);
        System.out.println("Kelas    : "+ arrayOfMahasiswa27[2].kelas);
        System.out.println("IPK      : "+ arrayOfMahasiswa27[2].ipk);
        System.out.println("---------------------------------------");
    }
}
