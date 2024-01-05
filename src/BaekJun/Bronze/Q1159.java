package BaekJun.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1159 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] cnt = new int[26];
        for(int i=0 ; i<N ; i++) {
            String Line = br.readLine();
            cnt[Line.charAt(0)-'a']++;
        }

        boolean flag = false;
        for(int i = 0 ; i<26 ; i++){
            if(cnt[i]>=5) {
                System.out.print((char)(i+'a'));
                flag = true;
            }
        }
        if(!flag) System.out.println("PREDAJA");

    }
}
