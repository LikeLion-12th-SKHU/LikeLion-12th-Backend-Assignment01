package bj_2884;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int H = scanner.nextInt();
        int M = scanner.nextInt();

        if(M<45) {
            if(H==0) {
                H += 23;
                M += 60;
                M -= 45;
                System.out.println(H + " " + M);
            }
            else {
                H -= 1;
                M += 60;
                M -= 45;
                System.out.println(H + " " + M);
            }
        }
        else{
            M -= 45;
            System.out.println(H + " " + M);
        }
        scanner.close();
    }
}
