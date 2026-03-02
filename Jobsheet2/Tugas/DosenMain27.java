public class DosenMain27 {
    public static void main(String[] args) {

        Dosen27 d1 = new Dosen27();
        d1.idDosen = "D001";
        d1.nama = "Budi Santoso";
        d1.statusAktif = true;
        d1.tahunBergabung = 2015;
        d1.bidangKeahlian = "Pemrograman";

        d1.tampilInformasi();
        d1.setStatusAktif(false);
        System.out.println("Masa kerja: " + d1.hitungMasaKerja(2025) + " tahun");
        d1.ubahKeahlian("Data Science");
        d1.tampilInformasi();

        Dosen27 d2 = new Dosen27("D002", "Siti Rahma", true, 2018, "Jaringan");

        d2.tampilInformasi();
        d2.setStatusAktif(true);
        System.out.println("Masa kerja: " + d2.hitungMasaKerja(2025) + " tahun");
        d2.ubahKeahlian("Keamanan Siber");
        d2.tampilInformasi();
    }
}
