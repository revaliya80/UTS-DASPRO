import java.util.Scanner;

public class BilanganKecil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double angka1, angka2, angka3;

        System.out.println("=== Menentukan Bilangan Terkecil dari 3 Angka ===");
        System.out.println("Masukkan angka pertama:");
        angka1 = sc.nextDouble();

        System.out.println("Masukkan angka kedua:");
        angka2 = sc.nextDouble();

        System.out.println("Masukkan angaka ketiga:");
        angka3 = sc.nextDouble();

        double terkecil = angka1;
        if (angka2 < terkecil)
            terkecil = angka2;
        if (angka3 < terkecil)
            terkecil = angka3;

        System.out.println("Hasil");
        if (angka1 == terkecil && angka2 == terkecil && angka3 == terkecil) {
            System.out.println("Ketiga angka sama kecil, yaitu: " + terkecil);
        } else if ((angka1 == terkecil && angka2 == terkecil) || (angka1 == terkecil && angka3 == terkecil)
                || (angka2 == terkecil && angka3 == terkecil)) {
            System.out.println("Beberapa angka terkecil: ");
            if (angka1 == terkecil)
                System.out.println(angka1 + "");
            if (angka2 == terkecil)
                System.out.println(angka2 + "");
            if (angka3 == terkecil)
                System.out.println(angka3 + "");
            System.out.println();
        } else {
            System.out.println("Bilangan paling kecil yaitu: " + terkecil);
        }
    }
}