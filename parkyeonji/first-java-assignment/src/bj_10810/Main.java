package bj_10810;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int i, j, k;

        int array[] = new int[N];

        for(int x=0;x<M;x++) {
            i = scanner.nextInt();
            j = scanner.nextInt();
            k = scanner.nextInt();

            for(int l=i-1;l<j;l++) {
                array[l] = k;
            }
        }

        for(int y=0;y<N;y++) {
            System.out.print(array[y] + " ");
        }
    }
}
