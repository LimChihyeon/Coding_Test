package BaekJun.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
// 오류 : ArrayIndexOutOfBounds, 해결 보류
public class Q1009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int[] A = new int[N];
        int[] B = new int[N];
        int[][] C = {{1},{2,4,8,6},{3,9,7,1},{4,6},{5},{6},{7,9,3,1},{8,4,2,6},{9,1}};
        for(int i=0 ; i< N ; i++){
            st = new StringTokenizer(br.readLine());
            A[i] = Integer.parseInt(st.nextToken());
            B[i] = Integer.parseInt(st.nextToken()) % C[A[i] - 1].length;
            if (B[i] == 0) B[i] = C[A[i] - 1].length;
        }
        for (int i = 0; i < N; i++) {
            int col = B[i] - 1;
            System.out.println(C[A[i] - 1][col]);
        }
    }
}
