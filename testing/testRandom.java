
import java.util.Scanner;

public class testRandom {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = 1;
        for(int i = 1; i <= 3; i++){
            do {
                int total = 0;
                System.out.print("input berat: ");
                int berat = sc.nextInt();
                if(berat < 0 || berat > 50){
                    System.out.println("berat tidak valid");
                } else {
                    total += berat;
                    System.out.println("total berat: " + total);
                }
                p++;
            } while (p <= 4);
        }
    }
}
