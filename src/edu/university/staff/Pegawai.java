package edu.university.staff;

public class Pegawai {
    private String nama;
    private double gajiPokok;

    public Pegawai(String nama, double gajiPokok) {
        this.nama = nama;
        this.gajiPokok = gajiPokok;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public double hitungGaji(){
        return gajiPokok;
    }
}

class Dosen extends Pegawai {
    int jumlahSks;

    public Dosen(String nama, double gajiPokok, int jumlahSks) {
        super(nama, gajiPokok);
        this.jumlahSks = jumlahSks;
    }

    @Override
    public double hitungGaji() {
        return getGajiPokok() + (jumlahSks * 150000);
    }
}

class Staf_Administrasi extends Pegawai {
    int jamLembur;

    public Staf_Administrasi(String nama, double gajiPokok, int jamLembur) {
        super(nama, gajiPokok);
        this.jamLembur = jamLembur;
    }

    @Override
    public double hitungGaji() {
        return getGajiPokok() + (jamLembur * 50000);
    }
}
