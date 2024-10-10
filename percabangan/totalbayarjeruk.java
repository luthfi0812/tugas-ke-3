
package percabangan;

import java.util.Scanner;

public class totalbayarjeruk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah jeruk yang dibeli: ");
        int jumlah = scanner.nextInt();
        int total;

        if (jumlah == 1) {
            total = 3000;
        } else if (jumlah == 2) {
            total = 5000;
        } else if (jumlah == 5) {
            total = 10000;
        } else if (jumlah >= 7) {
            total = 15000 + (jumlah - 7) * 3000;
        } else {
            total = 0; // Tidak ada harga untuk jumlah di luar yang ditentukan
        }

        System.out.println("Total pembayaran untuk " + jumlah + " jeruk = " + total);
    }
}

