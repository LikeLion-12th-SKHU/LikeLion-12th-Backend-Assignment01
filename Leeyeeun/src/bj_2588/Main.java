package bj_2588;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("");
        int a = scanner.nextInt(); // 입력받은 첫 번째 수를 a에 저장
        System.out.print("");
        int b = scanner.nextInt(); // 입력받은 두 번째 수를 b에 저장

        int num1 = b % 10; // 일의 자리 구하기
        int num2 = (b / 10) % 10; // 십의 자리 구하기
        int num3 = b / 100; // 백의 자리 구하기

        int step1 = a * num1;
        int step2 = a * num2;
        int step3 = a * num3;

        int result = a * b;

        System.out.println(step1);
        System.out.println(step2);
        System.out.println(step3);
        System.out.println(result);
    }
}
