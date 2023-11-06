/**
 * Nama            : Moch Puga Hilal bayhaqie
 * Kelas           : PBO12
 * NIM             : 22205048
 * Deskripsi       : Program yang berisi tentang perhitungan lingkaran
 */
   import java.util.Scanner;
public class TI_RegulerMalam_22205048_latihan22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("===== Perhitungan Lingkaran =====");
        
        System.out.print("Masukkan nilai diameter lingkaran: ");
        if (input.hasNextDouble()) {
            double diameter = input.nextDouble();
            double jariJari = diameter / 2;
            double luas = Math.PI * Math.pow(jariJari, 2);
            double keliling = 2 * Math.PI * jariJari;

            System.out.println("Jari-jari Lingkaran: " + jariJari);
            System.out.printf("Luas Lingkaran: %.2f\n", luas);
            System.out.printf("Keliling Lingkaran: %.2f\n", keliling);
        } else {
            System.out.println("Nilai Diameter Tidak Sesuai.");
        }
    }
}
