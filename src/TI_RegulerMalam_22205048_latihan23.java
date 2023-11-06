/**
 * Nama            : Moch Puga Hilal bayhaqie
 * Kelas           : PBO12
 * NIM             : 22205048
 * Deskripsi       : Program yang berisi tentang mencari nilai terbesar dan terkecil
 */


import java.util.Scanner;
public class TI_RegulerMalam_22205048_latihan23 {
     public static void main(String[] args) {
        System.out.println("=== Program nilai terbesar dan terkecil mahasiswa ===");

        Scanner input = new Scanner(System.in);

        // Input nama petugas
        System.out.print("Masukkan Nama Petugas: ");
        String namaPetugas = input.nextLine();

        // Input jumlah nilai mahasiswa
        System.out.print("Masukkan Banyaknya Nilai Mahasiswa: ");
        int banyaknilaimahasiswa = input.nextInt();

        double[] nilaiMahasiswa = new double[banyaknilaimahasiswa];

        for (int i = 0; i < banyaknilaimahasiswa; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMahasiswa[i] = input.nextDouble();
        }

        System.out.println("=== Hasil Nilai Mahasiswa ===");
        for (int i = 0; i < banyaknilaimahasiswa; i++) {
            System.out.println("Nilai Mahasiswa ke-" + (i + 1) + ": " + nilaiMahasiswa[i]);
        }
        
        double nilaiTerbesar = Double.NEGATIVE_INFINITY;
        double nilaiTerkecil = Double.POSITIVE_INFINITY;
        for (int i = 0; i < banyaknilaimahasiswa; i++) {
            double nilai = nilaiMahasiswa[i];

            if (nilai > nilaiTerbesar) {
                nilaiTerbesar = nilai;
            }

            if (nilai < nilaiTerkecil) {
                nilaiTerkecil = nilai;
            }
        }
        
        System.out.println("\nNilai terbesar: " + nilaiTerbesar);
        System.out.println("Nilai terkecil: " + nilaiTerkecil);
        System.out.println("\nNama Petugas: " + namaPetugas);
        input.close();
    }
}
