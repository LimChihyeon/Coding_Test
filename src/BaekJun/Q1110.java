package BaekJun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;
        int A = N;
        do{
            A = (A%10)*10 + ((A/10)+(A%10))%10;
            cnt++;
        }while(A!=N);
        System.out.println(cnt);
    }
}
