
import java.util.Scanner;

public class Tugas3_10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jmlToko,
                jmlBarang,
                jmlPelanggan,
                totalBarang,
                totalBarangSemuaToko = 0,
                barangTerbanyak = -1,
                tokoTerbanyak = 0;

        do {
            System.out.print("Input jumlah toko: ");
            jmlToko = sc.nextInt();

            if (jmlToko <= 0) {
                System.out.println("Jumlah toko minimal 1");
            }

        } while (jmlToko <= 0);
        for (int i = 1; i <= jmlToko; i++) {
            System.out.println("\n========== Toko ke-" + i + " ==========");

            totalBarang = 0;

            do {
                System.out.print("Jumlah pelanggan: ");
                jmlPelanggan = sc.nextInt();

                if (jmlPelanggan < 0) {
                    System.out.println("Inputan tidak valid");
                    continue;
                }
                for (int j = 1; j <= jmlPelanggan; j++) {
                    do {
                        System.out.print("Jumlah barang yang dibeli pelanggan ke-" + j + ": ");
                        jmlBarang = sc.nextInt();

                        if (jmlBarang < 0) {
                            System.out.println("Inputan tidak valid");
                            continue;
                        }

                        totalBarang += jmlBarang;
                    } while (jmlBarang < 0);
                }

            } while (jmlPelanggan < 0);

            totalBarangSemuaToko += totalBarang;

            if (totalBarang > barangTerbanyak) {
                barangTerbanyak = totalBarang;
                tokoTerbanyak = i;
            }
            System.out.println("_______________________________");
            System.out.println("Toko " + i + " - pelanggan: " + jmlPelanggan + ", total barang: " + totalBarang);
        }

        System.out.println("\nTotal barang seluruh toko: " + totalBarangSemuaToko);
        System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);
        sc.close();
    }
}
