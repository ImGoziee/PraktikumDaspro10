import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();
        int i = 0;

        while (i <= n) {
            int j = 0;
            while (j < i) {
                System.out.print(j+1+(" "));
                j++;
            }
            System.out.println();
            i++;
        }
    }
}