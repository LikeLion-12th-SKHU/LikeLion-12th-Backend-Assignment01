package BJ_10810;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner1 = new Scanner(System.in);

        int basketNum = scanner1.nextInt(); // 바구니 개수
        int repeatNum = scanner1.nextInt(); // 반복활 횟수
        int[] basket = new int[basketNum + 1]; // basket[0 ~ basketNum]

        for (int a = 0; a < repeatNum; a++) // i번 바구니부터 j번 바구니까지 k번 공을 넣음
        {
            int i = scanner1.nextInt();
            int j = scanner1.nextInt();
            int k = scanner1.nextInt();

            // 여기서부터 참조했음, https://www.acmicpc.net/board/view/128224
            for(int b = i; b <= j; b++) // i : 최솟값(변화x), j : 최댓값(변화x) / b : 범위(변화O)
                basket[b] = k;
        }
        for (int c = 1; c <= basketNum; c++)
            System.out.printf("%d ", basket[c]);
    }
}
