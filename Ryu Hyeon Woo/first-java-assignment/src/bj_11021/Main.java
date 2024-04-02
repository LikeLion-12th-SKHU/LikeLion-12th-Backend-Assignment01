package bj_11021;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int array[] = new int[num];
        int result;


        for (int i = 0; i < num; i++) {
            int fnum = scanner.nextInt();
            int snum = scanner.nextInt();

            result = (fnum + snum);
            array[i] = result;
        }

        for (int j = 0; j < num; j++) {
            System.out.println("Case #" + (j+1) + ": " + array[j]);
        }
    }
}
