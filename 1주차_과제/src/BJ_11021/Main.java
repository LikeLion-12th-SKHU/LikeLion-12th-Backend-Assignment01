package BJ_11021;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner1 = new Scanner(System.in);
        int T = scanner1.nextInt();
        for (int i = 1; i <= T; i++)
        {
            int A = scanner1.nextInt();
            int B = scanner1.nextInt();
            System.out.printf("Case #" + i + ": %d\n", A + B);
        }
    }
}
