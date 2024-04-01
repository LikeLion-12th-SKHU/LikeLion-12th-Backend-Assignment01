package bj_9086;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        scanner.nextLine();

        for(int i=0;i<T;i++) {
            String str = scanner.nextLine();
            System.out.println(str.charAt(0) + "" + str.charAt(str.length()-1));
        }

        scanner.close();
    }
}
