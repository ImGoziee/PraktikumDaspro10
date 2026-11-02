import java.util.Scanner;

public class Tugas2_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();
        int i = 1;
        int total = 0;

        while (i <= n) {
            int j = 1;
            while (j <= n) {
                System.out.printf("%4d", j*i);
                total = total + (j*i);
                j++;
            }
            System.out.println();
            i++;
        }
        System.out.println("Jumlah seluruh angka: " + total);
        sc.close();
    }
}