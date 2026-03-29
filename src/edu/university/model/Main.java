package edu.university.model;

import edu.university.model.Mahasiswa;

public class Main {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("241401099", "Akief", 3.75);
        Mahasiswa mhs2 = new Mahasiswa("241401001", "Tariq", 3.20);
        Mahasiswa mhs3 = new Mahasiswa("241401069", "Ferdinand", 2.40);

        Mahasiswa[] daftarMahasiswa = {mhs1, mhs2, mhs3};

        System.out.println("================================================================");
        System.out.printf("| %-10s | %-20s | %-5s | %-16s |\n", "NIM", "NAMA", "IPK", "KATEGORI");
        System.out.println("----------------------------------------------------------------");

        for (Mahasiswa mhs : daftarMahasiswa) {
            System.out.printf("| %-10s | %-20s | %-5.2f | %-16s |\n",
                    mhs.getNim(),
                    mhs.getNama(),
                    mhs.getIpk(),
                    mhs.getKategoriIPK());
        }
        System.out.println("================================================================");
    }
}