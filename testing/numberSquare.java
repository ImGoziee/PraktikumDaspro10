import java.util.Scanner;

public class numberSquare {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();

        int digitN = String.valueOf(n).length();
        String space = " ".repeat(digitN + 1);

        if(n < 3) {
           System.out.print("Jumlah n minimal 3");
           return;
        }

        for (int y = 1; y <= n; y++) {
            for (int x = 1; x <= n; x++) {
                if (y == 1 || x == 1 || y == n || x == n) {
                    System.out.print(n + " ");
                } else {
                    System.out.print(space);
                }
            }
            System.out.println();
        }

    }
}
