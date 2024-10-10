package percabangan;

import java.util.Scanner;

public class ganjilgenap {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan bilangan: ");
            int number = input.nextInt();

            if (number % 2 == 0) {
                System.out.println(number + " adalah bilangan genap.");
            } else {
                System.out.println(number + " adalah bilangan ganjil.");
            }
        }
    }
}

