package bj_2439;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i=1;i<=n;i++){ // 별 개수 기준으로 해보까
			for (int j=n-i;j>0;j--){
				System.out.print(" ");
			}
			for (int k=i;k>0;k--){
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
}
