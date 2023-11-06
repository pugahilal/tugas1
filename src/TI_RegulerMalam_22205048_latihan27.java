/**
 * Nama            : Moch Puga Hilal bayhaqie
 * Kelas           : PBO12
 * NIM             : 22205048
 * Deskripsi       : Program yang berisi tentang menampilkan formating huruf besar dan kecil
 */

import java.util.Scanner;
public class TI_RegulerMalam_22205048_latihan27 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Kalimat : ");
        String teks = input.nextLine();

        System.out.println("===== hasil Formatting =====");
        
        String hurufKecil = teks.toLowerCase();
        String hurufBesar = teks.toUpperCase();

        System.out.println("Kalimat dengan huruf kecil: " + hurufKecil);
        System.out.println("Kalimat dengan huruf besar: " + hurufBesar);
    }
}
