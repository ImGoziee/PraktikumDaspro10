import java.util.Scanner;

public class parkir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int jenis, durasi, total = 0;

        do { 
            System.out.print("input jenis (1: mobil | 2: motor | 0: keluar): ");
            jenis = sc.nextInt();

            if(jenis == 1 || jenis == 2){
                System.out.print("Input durasi (jam): ");
                durasi = sc.nextInt();

                if(jenis == 1){
                    total += durasi * 3000;
                } else {
                    total += durasi * 2000;
                }
            } else {
                System.out.println("Jenis tidak valid");
            }
        } while (jenis != 0);

        System.out.print("Total: Rp." + total);
    }
}