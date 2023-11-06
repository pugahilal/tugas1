
public class TI_RegulerMalam_22205048_latihan30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     // Warna teks
        String merah = "\u001B[31m";
        String hijau = "\u001B[32m";
        String biru = "\u001B[34m";
        String reset = "\u001B[0m"; // Untuk mereset warna ke default
        String kuning = "\u001B[33m";
        String ungu = "\u001B[35m";
        // Menampilkan teks dengan warna 
        System.out.println(merah + "kamu " + hijau + "ngerjain sendiri " + kuning + "latihan 17 sampe " + ungu + "latihan 30 ini");
        System.out.print(ungu + "Jawab" + merah + " (Yhoi/Enggak) :"  );
        String jawab = scanner.next();
        
        if (jawab.equals("Yhoi")) {
            System.out.println(merah + "cakep bener" + ungu + " good job");
        } else {
            System.out.println(merah + "tetep cakep sih.\n" + biru + "sing penting paham konsep nya yee\n" + reset + "keep the code works dude");
        }
    }
}
