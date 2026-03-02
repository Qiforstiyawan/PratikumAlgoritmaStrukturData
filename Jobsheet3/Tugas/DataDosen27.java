public class DataDosen27 {
    void dataSemuaDosen(Dosen27[] arrayOfDosen27) {
        for (Dosen27 d : arrayOfDosen27) {
            d.tampilInfo();
        }
    }

    void jumlahDosenPerJenisKelamin(Dosen27[] arrayOfDosen27) {
        int pria = 0, wanita = 0;

        for (Dosen27 d : arrayOfDosen27) {
            if (d.jenisKelamin.equalsIgnoreCase("Pria")) pria++;
            else if (d.jenisKelamin.equalsIgnoreCase("Wanita")) wanita++;
        }

        System.out.println("Jumlah Dosen Pria   : " + pria);
        System.out.println("Jumlah Dosen Wanita : " + wanita);
    }

    void rataUsiaDosenPerJenisKelamin(Dosen27[] arrayOfDosen27) {
        int totalPria = 0, totalWanita = 0;
        int pria = 0, wanita = 0;

        for (Dosen27 d : arrayOfDosen27) {
            if (d.jenisKelamin.equalsIgnoreCase("Pria")) {
                totalPria += d.usia;
                pria++;
            } else if (d.jenisKelamin.equalsIgnoreCase("Wanita")) {
                totalWanita += d.usia;
                wanita++;
            }
        }

        if (pria > 0)
            System.out.println("Rata-rata usia Dosen Pria   : " + (totalPria / pria));
        if (wanita > 0)
            System.out.println("Rata-rata usia Dosen Wanita : " + (totalWanita / wanita));
    }

    void infoDosenPalingTua(Dosen27[] arrayOfDosen27) {
        Dosen27 tertua = arrayOfDosen27[0];

        for (Dosen27 d : arrayOfDosen27) {
            if (d.usia > tertua.usia) {
                tertua = d;
            }
        }

        tertua.tampilInfo();
    }

    void infoDosenPalingMuda(Dosen27[] arrayOfDosen27) {
        Dosen27 termuda = arrayOfDosen27[0];

        for (Dosen27 d : arrayOfDosen27) {
            if (d.usia < termuda.usia) {
                termuda = d;
            }
        }

        termuda.tampilInfo();
    }
    
}