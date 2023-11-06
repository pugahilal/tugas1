/**
 * Nama            : Moch Puga Hilal bayhaqie
 * Kelas           : PBO12
 * NIM             : 22205048
 * Deskripsi       : Program yang berisi tentang ejaan nama
 */


import java.util.Scanner;
public class TI_RegulerMalam_22205048_latihan25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama depan anda untuk di eja : ");
        String nama = input.nextLine();

        System.out.println("Ejaan untuk '"+ nama + "' adalah :");

        for (int i = 0; i < nama.length(); i++) {
            char huruf = nama.charAt(i);
            System.out.println("Huruf ke-" + (i + 1) + ": " + huruf);
        }
    }
}
