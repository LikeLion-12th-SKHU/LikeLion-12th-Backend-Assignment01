package bj_2884;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h = scanner.nextInt();
        int m = scanner.nextInt();

        if (m >= 45) {
            System.out.printf("%d", h);
            System.out.printf(" %d", (m-45));
        } else if (m < 45 && h != 0) {
            System.out.printf("%d",(h-1));
            System.out.printf(" %d", (m+15));
        } else if (m < 45 && h == 0) {
            System.out.printf("%d", (h+23));
            System.out.printf(" %d", (m+15));
        }

    }

}
