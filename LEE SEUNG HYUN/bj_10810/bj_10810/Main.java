package bj_10810.bj_10810;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int M = scanner.nextInt();
        int N = scanner.nextInt();

        int n1, n2, ball = 0;

        int array1[] = new int[M];

        for(int i=0;i<N;i = i + 1) {
            n1 = scanner.nextInt()-1;
            n2 = scanner.nextInt()-1;
            ball = scanner.nextInt();

            for(int j=n1;j<=n2;j = j + 1) {
                array1[j] = ball;
            }
        }

        for(int i=0;i<array1.length;i = i + 1) {
            System.out.print(array1[i]+" ");
        }
        scanner.close();
    }
}
