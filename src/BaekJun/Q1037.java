package BaekJun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1037 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int min = 1000000;
        int max = 2;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i<num ; i++){
            int A = Integer.parseInt(st.nextToken());
            if(A < min) {min = A;}
            if(A > max) {max = A;}
        }
        System.out.println(min*max);
    }
}
