package edu.smartdevice;

public class SmartWatch implements Rechargeable, Connectable {
    private int batteryLevel;
    private boolean connected;
    private String ssid;

    public SmartWatch() {
        this.batteryLevel = 0;
        this.connected = false;
        this.ssid = "";
    }

    @Override
    public void chargeBattery(int menit) {
        this.batteryLevel += menit;

        if (this.batteryLevel > 100) {
            this.batteryLevel = 100;
        }
        System.out.println("Mengisi daya selama " + menit + " menit...");
    }

    @Override
    public int getBatteryLevel() {
        return this.batteryLevel;
    }

    @Override
    public void connectWifi(String ssid) {
        if (ssid != null && !ssid.isEmpty()) {
            this.ssid = ssid;
            this.connected = true;
            System.out.println("Mencoba menghubungkan ke WiFi: " + ssid);
        } else {
            this.connected = false;
            System.out.println("Gagal terhubung: SSID kosong!");
        }
    }

    @Override
    public boolean isConnected() {
        return this.connected;
    }
}