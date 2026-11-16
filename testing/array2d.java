
import java.util.Scanner;

public class array2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] nilai = new int[3][3];

        String[] mahasiswa = {
            "Mahasiswa 1",
            "Mahasiswa 2",
            "Mahasiswa 3"
        };

        String[] mataKuliah = {
            "Matematika",
            "Bahasa Inggris",
            "Pemrograman"
        };

        for (int i = 0; i < 3; i++) {
            System.out.println("\nsc nilai " + mahasiswa[i]);

            for (int j = 0; j < 3; j++) {
                System.out.print(mataKuliah[j] + ": ");
                nilai[i][j] = sc.nextInt();
            }
        }

        System.out.println("\n=== DATA NILAI MAHASISWA ===");

        for (int i = 0; i < 3; i++) {
            System.out.println("\n" + mahasiswa[i]);

            for (int j = 0; j < 3; j++) {
                System.out.println(
                    mataKuliah[j] + ": " + nilai[i][j]
                );
            }
        }

        sc.close();
    }
}
