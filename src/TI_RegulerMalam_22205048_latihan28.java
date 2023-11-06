/**
 * Nama            : Moch Puga Hilal bayhaqie
 * Kelas           : PBO12
 * NIM             : 22205048
 * Deskripsi       : Program yang berisi tentang mengganti kata
 */

import java.util.Scanner;

public class TI_RegulerMalam_22205048_latihan28 {
      public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("===== Program Mengganti kata =====\n");
        
        System.out.print("Masukkan kalimat : ");
        String teks = input.nextLine();

        System.out.print("Kata ganti : ");
        String kataLama = input.next();

        System.out.print("Menjadi Kata : ");
        String kataBaru = input.next();

        String teksHasil = teks.replace(kataLama, kataBaru);

        System.out.println("\n===== Hasil Formatting =====");
        System.out.println("kalimat awal: " + teks);
        System.out.println("kalimat baru: " + teksHasil);
    }
}