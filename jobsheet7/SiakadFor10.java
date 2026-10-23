import java.util.Scanner;

public class SiakadFor10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nilai, tertinggi = 0, terendah = 100;
        int tidakLulus = 0, lulus = 0;
        for(int i = 1; i <= 10; i++){
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();
            if (nilai > tertinggi) tertinggi = nilai;
            if (nilai < terendah) terendah = nilai;
            if (nilai < 60) {
                tidakLulus++;
            } else {
                lulus++;
            }
        }
        System.out.println("Nilai tertinggi: " +tertinggi);
        System.out.println("Nilai terendah: " +terendah);

        System.out.println("total tidak lulus: " + tidakLulus);
        System.out.println("total lulus: " + lulus);
    }
}