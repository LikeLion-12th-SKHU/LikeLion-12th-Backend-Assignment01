package bj_2439.bj_2439;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();

    int i = 1;

        while (i <= N){
        int J = 1;

        while (J <= N - i) {
            System.out.print(" ");
            J = J + 1;
        }

        J = 1;
        while (J <= i) {
            System.out.print("*");
            J = J + 1;
        }

        System.out.println();

        i = i + 1;
    }
    }
}






