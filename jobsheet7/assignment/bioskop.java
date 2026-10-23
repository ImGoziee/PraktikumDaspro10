
import java.util.Scanner;

public class bioskop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int harga = 50000, qty, sold = 0, total = 0;

        do {
            System.out.print("Input jumlah tiket: ");
            qty = sc.nextInt();

            if (qty < 0) {
                System.out.println("Jumlah tidak valid, input ulang!");
                continue;
            }

            double diskon = 0;
            int subtotal, totalPerTransaksi;
            sold += qty;
            subtotal = harga * qty;

            if (qty > 10) {
                diskon = 0.15;
            } else if (qty > 4) {
                diskon = 0.1;
            }

            totalPerTransaksi = subtotal - (int)(subtotal * diskon);
            total += totalPerTransaksi;

        } while (qty != 0);

        System.out.println("Total tiket terjual: " + sold);
        System.out.println("Total penjualan: Rp " + total);
    }
}
