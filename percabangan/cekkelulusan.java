package percabangan;

import java.util.Scanner;

public class cekkelulusan {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan nilai: ");
            int nilai = scanner.nextInt();
            
            if (nilai > 75) {
                System.out.println("Anda LULUS.");
            } else {
                System.out.println("Anda TIDAK LULUS.");
            }
        }
    } 
}
