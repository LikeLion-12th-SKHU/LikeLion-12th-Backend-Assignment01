package BJ_2439;

import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner1 = new Scanner(System.in);
        int repeatNum = scanner1.nextInt();

        for(int i = 0; i < repeatNum; i++)
        {
            for (int j = repeatNum - 1; j > i; j--)
            {
                System.out.printf(" ");
            }

            for(int j = 0; j < i + 1; j++)
            {
                System.out.printf("*");
            }
            System.out.printf("\n");
        }
    }
}
