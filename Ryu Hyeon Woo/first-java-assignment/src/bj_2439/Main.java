package bj_2439;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a-i; j++) {
                System.out.printf(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
