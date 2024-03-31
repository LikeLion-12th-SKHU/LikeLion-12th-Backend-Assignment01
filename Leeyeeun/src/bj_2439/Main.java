package bj_2439;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); // N번째 줄까지 별을 출력할 것인지 입력받기

        for(int i = 1; i <= N; i++) {
            for(int k = 1; k <= N-i; k++) {
                System.out.print(" "); // 왼쪽에 공백 넣기
            }
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
