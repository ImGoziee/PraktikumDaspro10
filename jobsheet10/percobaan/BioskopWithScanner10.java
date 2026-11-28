import java.util.Scanner;

public class BioskopWithScanner10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] penonton = new String[4][2];

        int baris, kolom, menu;
        String nama, next;

        do {
            System.out.println("\nDaftar menu: ");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. exit");

            System.out.print("Pilih menu: ");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    while (true) {
                        System.out.print("\nMasukkan baris: ");
                        baris = sc.nextInt();

                        System.out.print("Masukkan kolom: ");
                        kolom = sc.nextInt();
                        sc.nextLine();

                        if (baris < 1 || baris > penonton.length || kolom < 1 || kolom > penonton[0].length) {
                            System.out.println("\nBaris/kolom tidak tersedia.");
                        } else if (penonton[baris - 1][kolom - 1] != null) {
                            System.out.println("\nKursi sudah terisi, Pilih kursi lain!");
                        } else {
                            System.out.print("Masukkan nama: ");
                            nama = sc.nextLine();

                            penonton[baris - 1][kolom - 1] = nama;

                            System.out.print("Input penonton lainnya? (y/n): ");
                            next = sc.nextLine();

                            if (next.equalsIgnoreCase("n")) {
                                break;
                            }
                        }
                    }
                    break;
                case 2:
                    System.out.println();
                    for (int i = 0; i < penonton.length; i++) {
                        String[] listName = new String[penonton[i].length];
                        for (int j = 0; j<penonton[i].length; j++){
                            listName[j] = (penonton[i][j] != null) ? penonton[i][j] : "***";
                        }
                        System.out.println(String.join("\t", listName));
                    }
                    break;
                case 3:
                    System.out.println("\nSekian terimakasih");
                    break;
                default:
                    System.out.println("\nMenu tidak ada");
            }
        } while (menu != 3);
    }
}