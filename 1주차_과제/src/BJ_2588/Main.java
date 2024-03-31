package BJ_2588;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int input1, input2;
        Scanner scanner1 = new Scanner(System.in);

        input1 = scanner1.nextInt();
        input2 = scanner1.nextInt();

        System.out.printf("%d\n", input2 % 100 % 10 * input1);
        System.out.printf("%d\n", input2 % 100 / 10 * input1);
        System.out.printf("%d\n", input2 / 100 * input1);
        System.out.printf("%d\n", input1 * input2);

        /*
        int number1, number2, B1, B2, B3; char C1, C2, C3; String input1, input2;
        Scanner scanner1 = new Scanner(System.in);

        input1 = scanner1.nextLine();
        number1 = Integer.parseInt(input1);
        input2 = scanner1.nextLine();

        C1 = input2.charAt(0); B1 = Character.getNumericValue(C1);
        C2 = input2.charAt(1); B2 = Character.getNumericValue(C2);
        C3 = input2.charAt(2); B3 = Character.getNumericValue(C3);
        number2 = Integer.parseInt(input2);

        System.out.printf("%d\n", B3 * number1);
        System.out.printf("%d\n", B2 * number1);
        System.out.printf("%d\n", B1 * number1) ;
        System.out.printf("%d\n",number1 * number2);
         */
    }
}
