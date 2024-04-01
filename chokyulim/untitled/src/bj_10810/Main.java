package bj_10810;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int m = sc.nextInt();

        for (int i = 0; i < m; i++) {
            int ii = sc.nextInt();
            int jj = sc.nextInt();
            int kk = sc.nextInt();

            for (int j = (ii-1);j < jj; j++) { //
                arr[j] = kk; // j번째 arr배열에 kk번 공 넣기
            }
        }
        for (int k = 0; k < arr.length; k++)
            System.out.print(arr[k] + " ");


    }
}
