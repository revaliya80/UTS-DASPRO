import java.util.Scanner;

public class DenyutJantungSederhan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan usia anda:");
        int usia = sc.nextInt();

        System.out.print("Masukkan detak jantung (denyut/menit):");
        int HR = sc.nextInt();

        int MHR = 220 - usia;
        double persenMHR = (double) HR / MHR * 100;

        String kategori = "";
        String saran = "";

        if (persenMHR < 50) {
            kategori = "Sangat ringan";
            saran = "Pemanasan, manfaat minimal.";
        } else if (persenMHR < 60) {
            kategori = "Ringan";
            saran = "Peningkatan dasar kebugaran.";
        } else if (persenMHR < 70) {
            kategori = "Sedang";
            saran = "Zona aerobik nyaman.";
        } else if (persenMHR <= 85) {
            kategori = "Kuat";
            saran = "Meningkatkan kapasitas kardiorespirasi.";
        } else {
            kategori = "Sangat berat";
            saran = "Berisiko bagi pemula, batasi durasi.";
        }

        System.out.println("\n=== Hasil ===");
        System.out.println("MHR \t\t: " + MHR);
        System.out.println("% MHR \t\t: " + persenMHR + "%");
        System.out.println("Kategori \t: " + kategori);
        System.out.println("Saran \t\t: " + saran);
    }

}
