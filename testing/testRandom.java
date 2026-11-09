
import java.util.Scanner;

public class testRandom {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = 0;
        int toko = 1;

        for (int i = 1; i <= 3; i++) {
            int total = 0;

            if (total > max) {
                max = total;
                toko = i;
            }
        }

        System.out.println(toko);

    }
}
