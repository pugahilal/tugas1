/**
 * Nama            : Moch Puga Hilal bayhaqie
 * Kelas           : PBO12
 * NIM             : 22205048
 * Deskripsi       : Program yang berisi tentang menampilkan hasil saldo tabungan
 */

public class TI_RegulerMalam_22205048_latihan19 {
public static void main(String[] args) {
        double saldoAwal = 2500000.0; // Saldo awal dalam Rupiah
        double bunga = 0.15; // Bunga 15% per bulan
        int lamaSimpan = 6; // Lama simpan dalam bulan

        // Menghitung tabungan setiap bulan
        for (int bulan = 1; bulan <= lamaSimpan; bulan++) {
            saldoAwal += saldoAwal * bunga; // Menghitung bunga per bulan

            // Menambahkan tanda titik (.) setiap 3 digit
            String saldoFormatted = String.format("Rp %,.0f", saldoAwal);
            System.out.printf("Bulan ke-%d: %s\n", bulan, saldoFormatted);
        }
    }
}