/**
 * Nama            : Moch Puga Hilal bayhaqie
 * Kelas           : PBO12
 * NIM             : 22205048
 * Deskripsi       : Program yang berisi tentang target saldo tabungan
 */
public class TI_RegulerMalam_22205048_latihan20 {
public static void main(String[] args) {
        double saldoAwal = 3500000; // Saldo awal dalam Rupiah
        double bunga = 0.08; // Bunga 8% per bulan
        double targetSaldo = 6000000; // Target saldo dalam Rupiah
        int bulan = 0; // Inisialisasi jumlah bulan

        while (saldoAwal < targetSaldo) {
            bulan++;
            double bungaBulanan = saldoAwal * bunga;
            saldoAwal += bungaBulanan;
            
           String saldoFormatted = String.format("Rp %,.0f", saldoAwal);
            System.out.printf("saldo di bulan ke-%d: %s\n", bulan, saldoFormatted);
        }
    }
}