package BaekJun.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[] ans = new int[T];

        for(int i= 0 ; i<T ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int M = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            int[][] loc = new int[M][N];
            for(int j = 0 ; j < K ; j++){
                st = new StringTokenizer(br.readLine());
                loc[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())] = 1;
            }
            
        }
    }

}
