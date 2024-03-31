package bj_2588;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.println("세자리 자연수를 입력하시오: ");
        int a = sc.nextInt();
        //System.out.println("세자리 자연수를 입력하시오: ");
        //String b = sc.next();
        int b = sc.nextInt();


        System.out.println(a * (b %10)); //일의 자리 구하기
        System.out.println(a * (b %100 /10)); // 십의 자리 구하기
        System.out.println(a * (b / 100)); //백의 자리 구하기
        System.out.println(a * b);
    }
}

