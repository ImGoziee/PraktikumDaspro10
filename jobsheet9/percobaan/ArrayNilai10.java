import java.util.Scanner;

public class ArrayNilai10 {

    public static void main(String[] args) {

        int[] nilaiAkhir = new int[10];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiAkhir[i] = input.nextInt();
        }

        int numb = 1, jmlLulus = 0, jmlTidakLulus = 0;
        for (int nilai : nilaiAkhir) {
            String status = (nilai > 70) ? "lulus" : "tidak lulus";
            System.out.println("Mahasiswa ke-" + numb + ": " + nilai + " (" + status + ")");
            numb++;

            if (nilai > 70) {
                jmlLulus++;
            } else {
                jmlTidakLulus++;
            }
        }
        System.out.println("Jumlah mahasiswa lulus: " + jmlLulus);
        System.out.println("Jumlah mahasiswa tidak lulus: " + jmlTidakLulus);
        input.close();
    }
}