
import java.util.Scanner;

public class Latihan111026 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== PEMERIKSAAN KONTAINER ===\n");
        System.out.print("Masukkan jumlah kontainer: ");
        int jmlKontainer = sc.nextInt();
        int jmlSegel = 0, totalSegel = 0;
        int statusSegel;
        int totalSegelAman = 0, totalSegelRusak = 0;
        int jmlLayakKirim = 0, jmlDitahan = 0;

        if (jmlKontainer < 1) {
            System.out.println("Jumlah kontainer minimal 1");
        } else {
            for (int i = 1; i <= jmlKontainer; i++) {
                int countRusak = 0, countAman = 0;
                System.out.println("\nKontainer " + i);

                do {
                    System.out.print("Jumlah segel: ");
                    jmlSegel = sc.nextInt();
                    if (jmlSegel < 1) {
                        System.out.println("Jumlah segel minimal 1");
                    }
                } while (jmlSegel < 1);
                
                totalSegel += jmlSegel;

                for (int j = 1; j <= jmlSegel; j++) {
                    do {
                        System.out.print("Segel ke-" + j + " (1=aman, 0=rusak): ");
                        statusSegel = sc.nextInt();

                        if (statusSegel != 1 && statusSegel != 0) {
                            System.out.println("Inputan tidak valid");
                        } else if (statusSegel == 1) {
                            countAman++;
                            totalSegelAman++;
                        } else {
                            countRusak++;
                            totalSegelRusak++;
                        }
                    } while (statusSegel != 1 && statusSegel != 0);
                }

                String statusKirim;
                if(countRusak > 0) {
                    statusKirim = "DITAHAN";
                    jmlDitahan++;
                } else {
                    statusKirim = "LAYAK KIRIM";
                    jmlLayakKirim++;
                }

                System.out.println("\nSegel aman : " + countAman);
                System.out.println("Segel rusak : " + countRusak);
                System.out.println("Status : " + statusKirim);
            }

            System.out.println("\n========== HASIL PEMERIKSAAN ==========\n");
            System.out.printf("%-25s : %5d \n", "Total kontainer diperiksa", jmlKontainer);
            System.out.printf("%-25s : %5d \n", "Total segel diperiksa", totalSegel);
            System.out.printf("%-25s : %5d \n", "Total segel aman", totalSegelAman);
            System.out.printf("%-25s : %5d \n", "Total segel rusak", totalSegelRusak);
            System.out.printf("%-25s : %5d \n", "Kontainer layak kirim", jmlLayakKirim);
            System.out.printf("%-25s : %5d \n", "Kontainer ditahan", jmlDitahan);
        }
    }
}
