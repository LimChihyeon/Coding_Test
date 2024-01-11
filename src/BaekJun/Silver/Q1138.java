package BaekJun.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1138 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] order = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0 ; i< N ; i++){
            int ex = Integer.parseInt(st.nextToken());
            int cnt = 0;
            for(int j = 0 ; j < N ; j++){
                if(cnt == ex && order[j] == 0) { order[j] = i + 1; break;}
                else if(order[j] == 0){
                    cnt++;
                }
            }
        }
        for(int i=0 ; i<N ; i++){
            System.out.print(order[i]+" ");
        }
    }
}
