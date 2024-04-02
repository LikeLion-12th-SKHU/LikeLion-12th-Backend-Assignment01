package bj_9086;

import com.sun.jdi.Value;

import java.util.Scanner;

import static java.lang.String.valueOf;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        scanner.nextLine();
        String str[] = new String[num];
        char a1[] = new char[num];
        char a2[] = new char[num];
        String a3[] = new String[num];

        for (int i = 0; i < num; i++) {
            str[i] = scanner.nextLine();
            a1[i] = str[i].charAt(0);
            a2[i] = str[i].charAt(str[i].length()-1);
            a3[i] = valueOf(a1[i]) + valueOf(a2[i]);
        }

        for (int j = 0; j < num; j++) {
            System.out.println(a3[j]);
        }
    }
}
