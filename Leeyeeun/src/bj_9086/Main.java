package bj_9086;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();
        scanner.nextLine();

        String[] arr = new String[T];

        for(int i = 0; i < T; i++) {
            String a = scanner.nextLine();

            if(a.length() == 1) {
                arr[i] = a + a;
            }
            else  {
                arr[i] = a.charAt(0) + "" + a.charAt(a.length() - 1);
            }
        }
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
