package BaekJun.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] str = br.readLine().toUpperCase().toCharArray();
        Arrays.sort(str);
        int[] cnt = new int[26];
        for(int i = 0 ; i < str.length ; i++) {
            cnt[str[i]-'A']++;
        }
        int max = 0;
        int maxIndex = 0;
        boolean flag = false;
        for(int i = 0 ; i<26 ; i++){
            if(cnt[i] > max) {
                max = cnt[i];
                maxIndex = i;
                flag = false;
            }
            else if(cnt[i] == max) flag = true;
        }
        if(!flag) {
            System.out.println((char)(maxIndex+'A'));
        }
        else System.out.println('?');
    }
}
