package bj_10810;

import java.util.Arrays;
import java.util.Scanner;
// 세그먼트 트리로 다시한번 풀어보기.
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] ballList = new int[N];
		Arrays.fill(ballList,0);
		for (int i=0;i<M;i++){
			int first = sc.nextInt();
			int last = sc.nextInt();
			int ballNumber = sc.nextInt();
			for (int j=first;j<=last;j++){
				ballList[j-1]=ballNumber;
			}
		}
		Arrays.stream(ballList).forEach((ball)-> System.out.print(ball+" "));
		sc.close();
	}
}
