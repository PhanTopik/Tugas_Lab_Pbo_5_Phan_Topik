package edu.smartdevice;

public class Main {
    public static void main(String[] args) {
        SmartWatch myWatch = new SmartWatch();

        System.out.println("=== STATUS AWAL ===");
        tampilkanStatus(myWatch);

        System.out.println("\n=== PROSES CHARGING ===");
        myWatch.chargeBattery(45);
        System.out.println("Baterai saat ini: " + myWatch.getBatteryLevel() + "%");

        System.out.println("\n=== PROSES KONEKSI ===");
        myWatch.connectWifi("Eudoroam");

        System.out.println("\n=== STATUS AKHIR ===");
        tampilkanStatus(myWatch);
    }

    public static void tampilkanStatus(SmartWatch sw) {
        System.out.println("Baterai : " + sw.getBatteryLevel() + "%");
        System.out.println("Koneksi : " + (sw.isConnected() ? "Terhubung" : "Terputus"));
    }
}