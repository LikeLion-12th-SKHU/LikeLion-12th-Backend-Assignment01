package bj_9086;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i=0;i<n;i++){
			String testString = sc.next();
			System.out.println(testString.charAt(0)+""+testString.charAt(testString.length()-1));
		}
		sc.close();
	}
}
