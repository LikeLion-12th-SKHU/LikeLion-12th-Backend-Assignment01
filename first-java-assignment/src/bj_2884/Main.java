package bj_2884;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h;
		int m;
		h = sc.nextInt();
		m = sc.nextInt();
		int diff=0;
		if (h==0) {
			if(m>=45){
				m -= 45;
				System.out.println(h +" "+ m);
			}else{
				diff = 45 -m;
				m = 60-diff;
				h = 23;
				System.out.println(h+" "+m);
			}
		}else{
			if (m >= 45){
				m-=45;
				System.out.println(h+" "+m);
			}
			else{
				diff = 45 - m;
				m=60-diff;
				h-=1;
				System.out.println(h+" "+m);
			}
		}
		sc.close();
	}
}
