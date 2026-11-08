
import java.util.Scanner;

public class SearchNilai10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input jumlah angka: ");
        int jmlAngka = sc.nextInt();
        int[] nilai = new int[jmlAngka];

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Input nilai indeks ke-" + i + ": ");
            nilai[i] = sc.nextInt();
        }

        System.out.print("Input nilai yang ingin dicari: ");
        int key = sc.nextInt();

        boolean ditemukan = false;

        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == key) {
                System.out.println("Nilai " + key + " ditemukan pada indeks ke-" + i);
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Nilai yang dicari (" + key + ") tidak ada di dalam array");
        }
    }
}
