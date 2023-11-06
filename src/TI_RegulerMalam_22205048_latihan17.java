/**
 * Nama            : Moch Puga Hilal bayhaqie
 * Kelas           : PBO12
 * NIM             : 22205048
 * Deskripsi       : Program yang berisi tentang menghitung tunjangan
 */

import java.util.Scanner;
public class TI_RegulerMalam_22205048_latihan17 {
     public static double hitungTunjangan(double gajiPokok, boolean isMarried) {
        return isMarried ? gajiPokok * 0.35 : 0; 
    } 

    public static double hitungTotalGaji(double gajiPokok, double tunjangan) {
        return gajiPokok + tunjangan;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===== Program Tunjangan =====");
        // input gajipokok
        System.out.print("Berapa gaji pokok anda perbulan? : ");
        double gajiPokok = scanner.nextDouble();

        // input is married or not
        System.out.print("Apakah anda sudah menikah? (Menikah/Belum) : ");
        String menikah = scanner.next();

        // Declare tunjangan
        double tunjangan = 0;

        if (menikah.equals("Menikah")) {
            tunjangan = hitungTunjangan(gajiPokok, true);
        } else if (menikah.equals("Belum")) {
            tunjangan = hitungTunjangan(gajiPokok, false);
        } else {
            System.out.println("Input tidak valid. Masukkan 'Menikah' atau 'Belum' saja.");
        }

        System.out.println("===== Hasil Perhitungan =====");
        System.out.println("Gaji Pokok : " + gajiPokok);
        System.out.println("Tunjangan : " + tunjangan);
        System.out.println("Gaji Total : " + hitungTotalGaji(gajiPokok, tunjangan));
         // Developed by Aenun Akhkam
        System.out.println("Devaloped By : Moch puga hilal bayhaqie");
        scanner.close();
    }
}