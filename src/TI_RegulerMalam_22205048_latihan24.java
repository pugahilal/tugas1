/**
 * Nama            : Moch Puga Hilal bayhaqie
 * Kelas           : PBO12
 * NIM             : 22205048
 * Deskripsi       : Program yang berisi tentang perbandingan 2 buah nilai
 */

import java.util.Scanner;

public class TI_RegulerMalam_22205048_latihan24 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("===Program Perbandingan Dua Nilai===");

        boolean ulangi = true;

        while (ulangi) {
            System.out.print("Masukkan nilai pertama: ");
            int nilai1 = input.nextInt();

            System.out.print("Masukkan nilai kedua: ");
            int nilai2 = input.nextInt();

            if (nilai1 > nilai2) {
            System.out.println("Hasil: " + nilai1 + " lebih besar dari nilai " + nilai2);
        } else if (nilai1 < nilai2) {
            System.out.println("Hasil: " + nilai1 + " lebih kecil dari nilai " + nilai2);
        } else {
            System.out.println("Hasil: " + nilai1 + " sama dengan nilai " + nilai2);
        }

            System.out.print("Ulangi aktivitas? (ya/Tidak): ");
            String jawaban = input.next();

            if (!jawaban.equalsIgnoreCase("ya")) {
                ulangi = false;
            }
        }

        input.close();
    }
}
