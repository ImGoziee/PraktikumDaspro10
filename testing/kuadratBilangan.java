import java.util.Scanner;

public class kuadratBilangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();

        int i = 1, kuadrat, total;
        String hasil;

        while(i <= n){
            total = 0;
            System.out.print("Jumlah Kuadrat = ");

            for(int j = 1; j <= i; j++){
                kuadrat = j * j;
                total += kuadrat;
                if (i == 1) {
                    hasil = String.valueOf(kuadrat);
                } else if (j == i) {
                    hasil = kuadrat+ " = " +total;
                } else {
                    hasil = kuadrat+ " + ";
                }
                System.out.print(hasil);
            }
            System.out.println();
            i++;
        }
    }
}