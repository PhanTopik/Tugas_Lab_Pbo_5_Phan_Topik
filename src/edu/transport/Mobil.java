package edu.transport;

public class Mobil extends Kendaraan{

    public Mobil(String nama, double kecepatanMaks) {
        super(nama, kecepatanMaks);
    }

    @Override
    double hitungWaktuTempuh(double jarak) {
        return jarak/(0.8 *kecepatanMaks);
    }
}