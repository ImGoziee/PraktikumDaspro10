import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();
        int i = 1;

        while (i <= n) {
            int j = 1;
            while (j <= n) {
                System.out.printf("%4d", j*i);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}