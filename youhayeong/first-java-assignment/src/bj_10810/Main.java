package bj_10810;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int arr[] = new int[n];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int I = Integer.parseInt(st.nextToken());
            int J = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            for (int j = I - 1; j < J; j++)     //I번 바구니부터 J번 바구니까지 K번 공을 배열에 저장
                arr[j] = K;
        }

        for (int k = 0; k < arr.length; k++)
            sb.append(arr[k] + " ");
        System.out.println(sb);

        br.close();
    }
}