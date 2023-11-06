/**
 * Nama            : Moch Puga Hilal bayhaqie
 * Kelas           : PBO12
 * NIM             : 22205048
 * Deskripsi       : Program yang berisi tentang melihat kepribadian sesorang berdasarkan warna
 */

import java.util.Scanner;
public class TI_RegulerMalam_22205048_latihan29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("YUK CEK KEPRIBADIANMU DARI WARNA FAVORITMU");
        System.out.println("Merah");
        System.out.println("Hijau");
        System.out.println("Kuning");
        System.out.println("Biru");
        System.out.println("Ungu");

        System.out.print("PILIH WARNA FAVORITMU : ");
        String color = input.nextLine();

        System.out.print("NAMA KAMU : ");
        String name = input.nextLine();

        System.out.println("HASIL TES KEPRIBADIAN " + name.toUpperCase());
        System.out.println("Warna favoritmu adalah " + color.toUpperCase());

        switch (color.toLowerCase()) {
            case "merah" -> {
                System.out.println("1. Periang,");
                System.out.println("2. Pemberani,");
                System.out.println("3. Berani mengambil risiko dalam setiap langkah,");
                System.out.println("4. Menyukai tantangan,");
                System.out.println("5. Kurang sabar,");
                System.out.println("6. Dapat menahan marah namun jika sudah tahap puncak toleransi, kemarahannya akan sulit dikontrol,");
                System.out.println("7. Memiliki energi kehangatan dan cinta.");
            }
            case "hijau" -> {
                System.out.println("1. Romantis,");
                System.out.println("2. Menyukai hal yang berbau alami dan keindahan,");
                System.out.println("3. Teguh pada prinsip,");
                System.out.println("4. Menginginkan kesempurnaan,");
                System.out.println("5. Mudah cemburu,");
                System.out.println("6. Mudah merasa iri,");
                System.out.println("7. Menjunjung tinggi suatu nilai toleransi dan kepercayaan.");
            }
            case "kuning" -> {
                System.out.println("1. Optimis,");
                System.out.println("2. Suka bergaul,");
                System.out.println("3. Periang,");
                System.out.println("4. Senang menolong,");
                System.out.println("5. Lincah dan aktif,");
                System.out.println("6. Tidak suka meremehkan kekurangan orang lain,");
                System.out.println("7. Loyal,");
                System.out.println("8. Hangat.");
            }
            case "biru" -> {
                System.out.println("1. Menyenangkan,");
                System.out.println("2. Bijaksana,");
                System.out.println("3. Pembawa diri tenang saat menghadapi masalah,");
                System.out.println("4. Dinamis,");
                System.out.println("5. Senang berbagi,");
                System.out.println("6. Bersahabat,");
                System.out.println("7. Tidak terlalu suka menjadi sorotan banyak orang,");
                System.out.println("8. Menyembunyikan perasaan karena karakternya yang cenderung mencari jalan damai.");
            }
            case "ungu" -> {
                System.out.println("1. Optimis,");
                System.out.println("2. Tidak pernah ragu,");
                System.out.println("3. Menurutnya pasangan yang ideal adalah yang memiliki mental yang kuat,");
                System.out.println("4. Memiliki ambisi yang besar,");
                System.out.println("5. Memiliki empati yang besar,");
                System.out.println("6. Memiliki sisi misterius sebab seringkali menutupi perasaannya,");
                System.out.println("7. Terkadang bersikap keras kepala dan angkuh.");
            }
            default -> System.out.println("oops...Belum teridentifikasi.");
        }
    }
}
