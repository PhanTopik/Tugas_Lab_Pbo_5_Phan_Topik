package edu.transport;

public class Main {
    public static void main(String[] args) {
        double jarakTempuh = 120.0;

        Kendaraan mobil = new Mobil("Mobil", 100);
        Kendaraan motor = new Motor("Motor", 80);

        System.out.println("Perhitungan Waktu Tempuh Jarak " + jarakTempuh + " km:");
        System.out.println("----------------------------------------------");

        mobil.tampilkanInfo(jarakTempuh);
        motor.tampilkanInfo(jarakTempuh);
    }
}