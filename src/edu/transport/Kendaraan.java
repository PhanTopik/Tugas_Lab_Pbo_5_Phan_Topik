package edu.transport;

abstract class Kendaraan {
    protected String nama;
    protected double kecepatanMaks;

    public Kendaraan(String nama, double kecepatanMaks) {
        this.nama = nama;
        this.kecepatanMaks = kecepatanMaks;
    }

    abstract double hitungWaktuTempuh(double jarak);

    public void tampilkanInfo(double jarak){
        System.out.println("Nama Kendaraan: " + this.nama);
        System.out.printf("Waktu Tempuh: %.2f jam\n\n", hitungWaktuTempuh(jarak));
    }
}