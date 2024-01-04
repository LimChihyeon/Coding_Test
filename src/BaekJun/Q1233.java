package BaekJun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1233 {
    public static void main(String[] args) throws IOException {
        int[] sum = new int[81];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int S1 = Integer.parseInt(st.nextToken());
        int S2 = Integer.parseInt(st.nextToken());
        int S3 = Integer.parseInt(st.nextToken());

        for(int i= 1 ; i<=S1 ; i++){
            for(int j= 1 ; j<=S2 ; j++){
                for(int k= 1 ; k<=S3 ; k++){
                    sum[i+j+k]++;
                }
            }
        }
        boolean flag = false;
        int max = 0;
        int maxIndex = 0;
        for(int i = 3 ; i<81 ; i++){
            if(sum[i] > max) {
                max = sum[i];
                maxIndex = i;
            }
        }
        System.out.println(maxIndex);
    }
}
