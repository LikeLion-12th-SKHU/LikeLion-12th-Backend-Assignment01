package bj_10810;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int basket[] = new int[N+1];

        for (int x = 0; x < M; x++) {
            int i = scanner.nextInt();
            int j = scanner.nextInt();
            int k = scanner.nextInt();

            for (int y = i; y <= j; y++) {
                basket[y] = k;
            }
        }

        for (int z = 1; z <= N; z++) {
            System.out.print(basket[z] + " ");
        }
    }
}
