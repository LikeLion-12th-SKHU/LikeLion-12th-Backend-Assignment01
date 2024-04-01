package BJ_9086;

import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner1 = new Scanner(System.in);

        int repeatNum = scanner1.nextInt();
        for(int i = 0; i < repeatNum; i++)
        {
            String input = scanner1.next();

            char input1 = input.charAt(0);
            char input2 = input.charAt(input.length() - 1);

            System.out.printf("%c%c\n",input1, input2);
        }
    }
}
