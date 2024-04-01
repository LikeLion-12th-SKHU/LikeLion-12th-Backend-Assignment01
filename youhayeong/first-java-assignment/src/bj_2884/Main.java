package bj_2884;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        if (M < 45) {
            M = M + 15;     // (M + 60)- 45
            H = H - 1;
            if (H < 0)      // H - 1 값이 0보다 작을 경우(=맨 처음 입력 H가 0인 경우)
                H = 23;
        } else
            M -= 45;
        System.out.println(H + " " + M);

        br.close();
    }
}
