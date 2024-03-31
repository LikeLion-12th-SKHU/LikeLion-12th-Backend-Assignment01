package bj_9086;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("출력횟수를 입력하시오: ");
        int p = sc.nextInt();

        for (int i = 1; i <= p; i++) {
            System.out.println(i + "번째 출력할 문자열을 입력하시오:");
            String a = "";
            String fir = "";
            String las = "";
            a = sc.next();
            //String.valueOf() input.charAt(0)인 char타입을 String 데이터로 형변환
            // input이 가리키고 있는 문자열에서 0번째에 있는 문자를 char타입으로 변환
            fir = String.valueOf(a.charAt(0));
            las = String.valueOf(a.charAt(a.length() - 1));
            System.out.println(fir + las);
        }

    }

}


//https://songsunkite.tistory.com/5