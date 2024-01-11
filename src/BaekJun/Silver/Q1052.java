package BaekJun.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1052 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int need = 0;
        while(true){
            int cur = N+need;
            int cnt = 0;
            while(cur>0){
                if(cur % 2 != 0) cnt++;
                cur/=2;
            }
            if(cnt <= K) break;
            need++;
        }
        System.out.println(need);
    }
}
