package BaekJun.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1085 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] g = new int[4];
        int x, y;
        for(int i = 0 ; i < 4 ; i++){
            g[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(Math.min(Math.min(g[2] - g[0], g[0]), Math.min(g[3] - g[1], g[1])));
    }
}
