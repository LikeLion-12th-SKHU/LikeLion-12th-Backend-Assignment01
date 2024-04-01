package bj_9086;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String arr[] = new String[n];

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            arr[i] = s.charAt(0) + "" + s.charAt(s.length() - 1);       //배열에 첫 문자 끝 문자 저장
        }

        for (int i = 0; i < n; i++)     //저장된 배열 출력
            System.out.println(arr[i]);

        br.close();
    }
}

/*
package bj_9086;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            String s = br.readLine();
            System.out.println(s.charAt(0) + ""+ s.charAt(s.length()-1));
        }
    }
}*/
