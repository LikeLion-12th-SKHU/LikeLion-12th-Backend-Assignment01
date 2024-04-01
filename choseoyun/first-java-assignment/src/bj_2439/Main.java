package bj_2439;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //입력함수

        int N = sc.nextInt();

        for(int i = 1; i <= N; i++) { // 행 반복
            for(int j = 1; j <= N - i; j++){
                System.out.print(" "); // 공백 반복
            }
            for(int k = 1; k <= i; k++){
                System.out.print("*"); // 별 반복
            }
            System.out.println(); //줄 바꿈
        }
    }
}

//https://codingnight.tistory.com/35