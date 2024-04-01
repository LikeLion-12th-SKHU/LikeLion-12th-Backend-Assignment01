package bj_2588.bj_2588;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 두 개의 정수 입력
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // 각 자릿수에 대한 곱 계산
        int result1 = a * (b % 10);
        int result2 = a * ((b % 100) / 10);
        int result3 = a * (b / 100);

        // 전체 곱 계산
        int totalResult = a * b;

        // 결과 출력
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(totalResult);
    }
}
