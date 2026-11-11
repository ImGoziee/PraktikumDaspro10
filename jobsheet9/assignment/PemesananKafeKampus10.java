
import java.util.Scanner;

public class PemesananKafeKampus10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};
        String[] pesanan;
        int total = 0;

        System.out.println("======== DAFTAR MENU ========");
        for (int i = 0; i < menu.length; i++) {
            System.out.printf((i + 1) + ". %-17s Rp%6d\n", menu[i], harga[i]);
        }
        int fitur;
        do {
            System.out.println("=============================");
            System.out.println("1. Cari menu");
            System.out.println("2. Pesan");
            System.out.println("3. Keluar");

            System.out.print("Pilih (1/2/3): ");
            fitur = sc.nextInt();
            sc.nextLine();

            if (fitur == 1) {
                System.out.print("\nInput nama menu: ");
                String key = sc.nextLine();

                boolean ditemukan = false;

                for (int i = 0; i < menu.length; i++) {
                    if (menu[i].equalsIgnoreCase(key)) {
                        System.out.println("Menu " + menu[i] + " ditemukan, harga: " + harga[i]);
                        ditemukan = true;
                        break;
                    }
                }
                if (!ditemukan) {
                    System.out.println("\nMenu tidak tersedia.");
                }
            } else if (fitur == 2) {
                System.out.print("\nInput jumlah pesanan: ");
                int jumlahPesanan = sc.nextInt();
                sc.nextLine();

                if (jumlahPesanan <= 0) {
                    System.out.println("\nJumlah pesanan tidak valid.");
                    continue;
                }
                pesanan = new String[jumlahPesanan];

                for (int i = 0; i < pesanan.length; i++) {
                    boolean ditemukan = false;
                    do {
                        System.out.print("Pesanan ke-" + (i + 1) + ": ");
                        pesanan[i] = sc.nextLine();
                        for (String item : menu) {
                            if (pesanan[i].equalsIgnoreCase(item)) {
                                ditemukan = true;
                            }
                        }
                        if (!ditemukan) {
                            System.out.println("Menu tidak tersedia.");
                        }
                    } while (!ditemukan);
                }

                System.out.println("\n\n---------Pesanan Anda--------\n");
                for (int i = 0; i < pesanan.length; i++) {
                    for (int j = 0; j < menu.length; j++) {
                        if (pesanan[i].equalsIgnoreCase(menu[j])) {
                            System.out.printf((i + 1) + ". %-17s Rp%6d\n", menu[j], harga[j]);
                            total += harga[j];
                        }
                    }
                }
                System.out.println("\nTotal: Rp " + total + " --------------\n\n");
                break;
            } else if (fitur != 3) {
                System.out.println("\nPilihan tidak valid!");
            }
        } while (fitur != 3);

    }
}
