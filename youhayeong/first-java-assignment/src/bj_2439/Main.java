package bj_2439;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++)
                sb.append(" ");         //공백 출력
            for (int k = 1; k <= i; k++)
                sb.append("*");         //* 출력
            sb.append("\n");
        }
        System.out.println(sb);

        br.close();
    }
}
