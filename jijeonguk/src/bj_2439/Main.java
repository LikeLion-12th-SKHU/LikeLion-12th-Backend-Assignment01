package bj_2439;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for (int i = 1; i<= number; i++){
            for (int j = number -i; j>0; j--){
                System.out.print(" ");
            }
            for (int k=i;k>0;k--){
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }
}