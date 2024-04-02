package bj_2588;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int result = num1 * num2;

        int a = num1 * ((num2%100)%10);
        int b = num1 * ((num2%100)/10);
        int c = num1 * (num2/100);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(result);

    }

}
