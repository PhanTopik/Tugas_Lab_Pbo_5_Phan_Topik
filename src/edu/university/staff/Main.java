package edu.university.staff;

public class Main {
    public static void main(String[] args) {
        Pegawai[] daftarKaryawan = {
                new Dosen("Budi", 9000000, 20),
                new Staf_Administrasi("Siska", 6000000, 7),
                new Staf_Administrasi("Andi", 6000000, 8)
        };

        System.out.println("==================================================================");
        System.out.printf("| %-15s | %-15s | %-20s |\n", "NAMA", "GAJI POKOK", "TOTAL GAJI");
        System.out.println("------------------------------------------------------------------");

        for (Pegawai pgi : daftarKaryawan) {
            System.out.printf("| %-15s | Rp %-12.0f | Rp %-17.0f |\n",
                    pgi.getNama(),
                    pgi.getGajiPokok(),
                    pgi.hitungGaji());
        }
        System.out.println("==================================================================");
    }
}