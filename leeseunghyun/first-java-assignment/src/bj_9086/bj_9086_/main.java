package bj_9086.bj_9086_;

import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < T; i = i + 1) {
            String str = scanner.nextLine(); // 문자열로 입력받기

            char[] charArray = str.toCharArray(); //입력받은 문자열을 문자형으로 변환
            char first = charArray[0];
            char last = charArray[str.length() - 1]; //인덱스는 0 부터 시작

            System.out.println(first + "" + last);

        }
    }
}