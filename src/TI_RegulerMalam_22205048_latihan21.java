/**
 * Nama            : Moch Puga Hilal bayhaqie
 * Kelas           : PBO12
 * NIM             : 22205048
 * Deskripsi       : Program yang berisi tentang program rata-rata nilai
 */
import java.util.Scanner;
public class TI_RegulerMalam_22205048_latihan21 {
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Banyaknya Mahasiswa: ");
        int jumlahMahasiswa = input.nextInt();

        int jumlahIterasi = 4;

        double totalNilai = 0;

        for (int i = 1; i <= jumlahIterasi; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            double nilai = input.nextDouble();
            totalNilai += nilai;
        }

        double ratarata = totalNilai / jumlahIterasi;
        System.out.println("Maka, Rata-rata Nilainya adalah  " + ratarata);

        System.out.println("Developed By : Moch puga hilal bayhaqie");

        input.close();
    }
}

