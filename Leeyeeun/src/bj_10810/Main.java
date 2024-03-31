package bj_10810;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // 바구니 수
        int M = scanner.nextInt(); // 작업 수

        int[] arr = new int[N]; // 바구니 배열

        for(int m = 0; m < M; m++) {
            int first = scanner.nextInt(); // 시작 바구니
            int end = scanner.nextInt(); // 끝 바구니
            int num = scanner.nextInt(); // 넣을 공의 번호

            for(int i = first; i <= end; i++) {
                arr[i - 1] = num;
            }
        }

        for(int j = 0; j < N;  j++) {
            System.out.print(arr[j] + " ");
        }
    }
}
