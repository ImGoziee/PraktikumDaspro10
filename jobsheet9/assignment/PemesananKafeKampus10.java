
import java.util.Scanner;

public class PemesananKafeKampus10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};
        String[] pesanan;

        System.out.println("========== DAFTAR MENU ==========");
        for (int i = 0; i < menu.length; i++) {
            System.out.printf((i + 1) + ". %-17s Rp%6d\n", menu[i], harga[i]);
        }
        int fitur;
        do {
            System.out.println();
            System.out.println("=================================");
            System.out.println("1. Cari menu");
            System.out.println("2. Pesan");
            System.out.println("3. Keluar");

            System.out.print("Pilih (1/2/3): ");
            fitur = sc.nextInt();
            System.out.println();
            sc.nextLine();

            if (fitur == 1) {
                System.out.print("Input nama menu: ");
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
                    System.out.println("Menu tidak tersedia.");
                }

            } else if (fitur == 2) {
                System.out.print("Input jumlah pesanan: ");
                pesanan = new String[sc.nextInt()];

                for (int i = 0; i < pesanan.length; i++) {
                    System.out.println("Pesanan ke-"+(i+1)+": ");

                    // String key = sc.nextLine();
                    // if(key.equalsIgnoreCase(menu[i])){
                    //     pesanan[i] = sc.nextLine();
                    // }

                }

            } else if (fitur != 3) {
                System.out.println("Pilihan tidak valid!");
            }

        } while (fitur != 3);

    }
}