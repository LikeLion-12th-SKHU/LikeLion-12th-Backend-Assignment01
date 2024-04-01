package bj_11021.bj_11021;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();
        int i = 1;

        while (i <= T) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();


            System.out.println("Case #" + i + ": " + (A + B));
            i = i + 1;

        }

    }

}
