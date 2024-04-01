package bj_2884;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int min = sc.nextInt();

        if (min < 45) {
            hour--;
            min += 15;
            if (hour < 0)
                hour = 23;
        }
        else
            min -= 45;
        System.out.println(hour + " " + min);
        sc.close();
    }
}
