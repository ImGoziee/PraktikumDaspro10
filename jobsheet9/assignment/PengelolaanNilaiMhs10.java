
import java.util.Scanner;

public class PengelolaanNilaiMhs10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah nilai yang akan diinput: ");
        int jumlahNilai = sc.nextInt();

        if (jumlahNilai > 0) {
            int[] nilai = new int[jumlahNilai];
            int totalNilai = 0;

            for (int i = 0; i < nilai.length; i++) {
                System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
                nilai[i] = sc.nextInt();
                totalNilai += nilai[i];
            }

            int tertinggi = nilai[0];
            int terendah = nilai[0];
            for (int i = 0; i < nilai.length; i++) {
                if (nilai[i] > tertinggi) {
                    tertinggi = nilai[i];
                }
                if (nilai[i] < terendah) {
                    terendah = nilai[i];
                }
            }
            double rata2 = (double) totalNilai / nilai.length;

            System.out.println("====================================");
            System.out.println("Total nilai: " + totalNilai);
            System.out.println("Rata-rata: " + rata2);
            System.out.println("Nilai tertinggi: " + tertinggi);
            System.out.println("Nilai terendah: " + terendah);

            System.out.println("=====NILAI & PREDIKAT MAHASISWA=====");
            for (int i = 0; i < nilai.length; i++) {
                String status = (nilai[i] > 70) ? "LULUS" : "TIDAK LULUS";
                System.out.println("Nilai mhs ke-" + (i + 1) + ": " + nilai[i] + " (" + status + ")");
            }
        } else {
            System.out.println("Input minimal 1!");
        }
    }
}
