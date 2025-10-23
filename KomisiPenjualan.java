import java.util.Scanner;

public class KomisiPenjualan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Perhitungan Komisi Penjualan ===");

        System.out.print("Masukkan omset (Rp) \t\t: ");
        double omset = sc.nextDouble();

        System.out.print("Masukkan rating kinerja (1-100)\t: ");
        int rating = sc.nextInt();

        System.out.print("Apakah memiliki sertifikasi profesional? (ya/tidak)\t: ");
        String sertifikasi = sc.next();

        if (omset < 0 || rating < 1 || rating > 100) {
            System.out.println("Input tidak valid! Periksa kembali data yang dimasukkan.");
            return;
        }

        double persenKomisi = 0;
        double bonusSertifikasi = 0;

        if (rating < 70) {
            persenKomisi = 0;
            System.out.println("\nTidak memenuhi syarat komisi (rating < 70).");
        } else {
            if (omset < 50000000) {
                persenKomisi = 1;
            } else if (omset < 100000000) {
                persenKomisi = 2;
            } else {
                persenKomisi = 3;
            }

            if (rating >= 90) {
                persenKomisi += 1;
            }

            if (sertifikasi.equalsIgnoreCase("ya")) {
                bonusSertifikasi = 500000;
            }
        }

        double jumlahKomisi = (persenKomisi / 100) * omset;
        double total = jumlahKomisi + bonusSertifikasi;

        System.out.println("\n=== Rincian Komisi ===");
        System.out.println("Persentase Komisi \t : " + persenKomisi + "%");
        System.out.println("Jumlah Komisi \t\t : Rp" + jumlahKomisi);
        System.out.println("Bonuss Sertifikasi \t : Rp" + bonusSertifikasi);
        System.out.println("Total Komisi \t\t : Rp" + total);

    }

}