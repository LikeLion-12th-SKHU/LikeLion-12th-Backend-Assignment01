package BJ_2884;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner1 = new Scanner(System.in);
        int H = scanner1.nextInt();
        int M = scanner1.nextInt();

        M = M - 45;
        if (H <= 0 && M < 0)
        {
            H = 23;
            M = 60 + M;
        }
        else if (H > 0 && M < 0)
        {
            H--;
            M = 60 + M;
        }
        System.out.printf("%d %d\n", H, M);
    }
}
