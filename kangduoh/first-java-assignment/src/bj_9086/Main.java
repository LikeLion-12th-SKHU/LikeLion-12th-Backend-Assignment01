package bj_9086;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        String in;

        for (int i = 0; i < T; i++) {
            in = br.readLine();
            sb.append(in.charAt(0)).append(in.charAt(in.length() - 1)).append('\n');
        }

        System.out.println(sb);
        br.close();
    }
}
