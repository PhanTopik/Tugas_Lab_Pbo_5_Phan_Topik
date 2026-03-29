package edu.transport;

public class Motor extends Kendaraan{

    public Motor(String nama, double kecepatanMaks) {
        super(nama, kecepatanMaks);
    }

    @Override
    double hitungWaktuTempuh(double jarak) {
        return jarak/(0.9 *kecepatanMaks);
    }
}