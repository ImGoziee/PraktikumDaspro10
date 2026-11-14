
// import java.util.Scanner;

// public class testRandom {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int p = 1;
//         for(int i = 1; i <= 3; i++){
//             do {
//                 int total = 0;
//                 System.out.print("input berat: ");
//                 int berat = sc.nextInt();
//                 if(berat < 0 || berat > 50){
//                     System.out.println("berat tidak valid");
//                 } else {
//                     total += berat;
//                     System.out.println("total berat: " + total);
//                 }
//                 p++;
//             } while (p <= 4);
//         }
//     }
// }

import java.util.Scanner;
import java.security.SecureRandom;

public class testRandom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SecureRandom random = new SecureRandom();

        System.out.print("Masukkan nama lengkap: ");
        String plaintext = input.nextLine();

        // Konversi teks menjadi byte ASCII
        byte[] data = plaintext.getBytes(
            java.nio.charset.StandardCharsets.US_ASCII
        );

        // Membuat kunci rahasia acak
        byte[] key = new byte[data.length];

        random.nextBytes(key);

        // Proses enkripsi
        byte[] ciphertext = new byte[data.length];

        for (int i = 0; i < data.length; i++) {
            ciphertext[i] = (byte) (data[i] ^ key[i]);
        }

        // Menampilkan hasil enkripsi
        System.out.println("\n=== HASIL ENKRIPSI ===");
        System.out.print("Ciphertext: ");

        for (byte b : ciphertext) {
            System.out.printf("%02X ", b & 0xFF);
        }

        // Menampilkan kunci
        System.out.print("\nKunci     : ");
        for (byte b : key) {
            System.out.printf("%02X ", b & 0xFF);
        }

        // Proses dekripsi
        byte[] decrypted = new byte[ciphertext.length];

        for (int i = 0; i < ciphertext.length; i++) {
            decrypted[i] = (byte) (ciphertext[i] ^ key[i]);
        }

        // Menampilkan hasil dekripsi
        String hasil = new String(
            decrypted,
            java.nio.charset.StandardCharsets.US_ASCII
        );

        System.out.println("\n\n=== HASIL DEKRIPSI ===");
        System.out.println("Teks asli: " + hasil);

        input.close();
    }
}
