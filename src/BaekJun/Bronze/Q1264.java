package BaekJun.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Q1264 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] vow = {'a', 'e', 'i', 'o', 'u'};
        List<Integer> cnt = new ArrayList<Integer>();

        while(true){
            char[] s = br.readLine().toLowerCase().toCharArray();
            if(s[0] == '#') {break;}
            int s_count = 0;
            for (char c : vow) {
                for(int i = 0 ; i< s.length ; i++){
                    if(s[i] == c) s_count++;
                }
            }
            cnt.add(s_count);
        }

        for (Integer integer : cnt) {
            System.out.println(integer);
        }
    }
}
