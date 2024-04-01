package bj_10810;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int[] arr = new int[a]; //바구니 수

        int b = sc.nextInt(); // 던지는 횟수

        for(int i = 0; i < b; i++) {
            int I = sc.nextInt(); // 시작 바구니
            int J = sc.nextInt(); // 종료 바구니
            int K = sc.nextInt(); // 공 번호

            for(int j = I - 1; j < J; j++) {
                arr[j] = K;
            }
        }
        for(int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " "); //최종 바구니에 담긴 공 번호
        }
    }
}

// https://velog.io/@ljs0429777/%EB%B0%B1%EC%A4%80-10810%EB%B2%88-%EA%B3%B5%EB%84%A3%EA%B8%B0

