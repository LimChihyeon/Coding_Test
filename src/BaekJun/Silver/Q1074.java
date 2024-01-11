package BaekJun.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1074 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int cnt = 0;

        while(N>0) {
            int q = 0;
            if(1<<(N-1) > r && 1<<(N-1) > c) {q=0;}
            else if (1<<(N-1) > r && 1<<(N-1) <= c) {q=1; c-=1<<(N-1);}
            else if (1<<(N-1) <= r && 1<<(N-1) > c) {q=2; r-=1<<(N-1);}
            else {q=3; c-=1<<(N-1); r-=1<<(N-1);}
            cnt+=q*(1<<(2*(N-1)));
            N-=1;
        }

        System.out.println(cnt);
    }
}
