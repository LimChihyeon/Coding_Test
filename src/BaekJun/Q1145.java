package BaekJun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1145 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] num = new int[5];
        for(int i = 0 ; i< 5; i++){
            num[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(num);

        int mul = num[2];
        while(true){
            int cnt = 0;
            for(int i = 0 ; i<5 ; i++){
                if(mul%num[i] == 0) cnt++;
            }
            if(cnt>=3) {break;}
            mul++;
        }
        System.out.println(mul);
    }
}
