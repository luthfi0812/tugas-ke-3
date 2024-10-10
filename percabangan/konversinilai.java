package percabangan;

import java.util.Scanner;

public class konversinilai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai: ");
        int nilai = scanner.nextInt();

        if (nilai > 85) {
            System.out.println("Nilai: A");
        } else if (nilai > 75) {
            System.out.println("Nilai: B");
        } else if (nilai > 65) {
            System.out.println("Nilai: C");
        } else if (nilai > 55) {
            System.out.println("Nilai: D");
        } else {
            System.out.println("Nilai: E");
        }
    }
}

