package bj_11021;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("출력할 값을 입력하시오: ");
        int t = sc.nextInt();

        for(int i = 1; i <= t; i++) {
                int a = 0;
                int b = 0;
                int c = 0;
                System.out.println(i+"번째 연산할 첫번째 값을 입력하시오:");
                a = sc.nextInt();
                System.out.println(i+"번째 연산할 두번째 값을 입력하시오:");
                b = sc.nextInt();

                c=a+b;
                System.out.println("Case #"+i+": "+c);
            }
        }
    }

