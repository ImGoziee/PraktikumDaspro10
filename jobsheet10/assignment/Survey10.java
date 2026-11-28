import java.util.Scanner;

public class Survey10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jmlResponden = 10, jmlPertanyaan = 6;

        int[][] survey = new int[jmlResponden][jmlPertanyaan];
        int nilai, total;
        double rataTiapResponden, rataTiapPertanyaan;

        for (int i = 0; i < survey.length; i++) {
            total = 0;
            System.out.println("Survey dari responden ke-" + (i + 1));
            for (int j = 0; j < survey[i].length; j++) {
                while (true) {
                    System.out.print("Input nilai pertanyaan ke-" + (j + 1) + "(1-5): ");
                    nilai = sc.nextInt();
                    if (nilai >= 1 && nilai <= 5) {
                        survey[i][j] = nilai;
                        total += survey[i][j];
                        break;
                    } else {
                        System.out.println("Nilai tidak valid, ulangi!");
                    }
                }
            }
            rataTiapResponden = (double) total / jmlPertanyaan;
            System.out.println("Rata-rata responden ke-" + (i + 1) + ": " + rataTiapResponden + "\n");
        }
        for (int j = 0; j < jmlPertanyaan; j++) {
            total = 0;
            for (int i = 0; i < jmlResponden; i++) {
                total += survey[i][j];
            }
            rataTiapPertanyaan = (double) total / jmlResponden;
            System.out.println("Rata-rata pertanyaan ke-" + (j + 1) + ": " + rataTiapPertanyaan);
        }
    }
}