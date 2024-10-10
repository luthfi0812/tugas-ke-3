package percabangan;

import java.util.Scanner;

public class pecahanuang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah uang: ");
        int amount = scanner.nextInt();

        int[] pecahan = {100000, 50000, 20000, 10000, 5000, 2000, 1000, 500, 100};
        for (int pecah : pecahan) {
            int jumlah = amount / pecah;
            if (jumlah > 0) {
                System.out.println(jumlah + " lembar " + pecah + " ribu");
                amount %= pecah;
            }
        }
    }
}
