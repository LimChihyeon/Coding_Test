package BaekJun.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Q1284 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> count = new ArrayList<Integer>();

        while(true){
            String s = br.readLine();
            if(s.equals("0")) break;
            char[] ex = s.toCharArray();
            int ex_cnt = ex.length+1;
            for(int i = 0 ; i<ex.length ; i++){
                if(ex[i] == '0') ex_cnt+=4;
                else if(ex[i] == '1') ex_cnt+=2;
                else ex_cnt+=3;
            }
            count.add(ex_cnt);
        }
        for(int i = 0 ; i< count.size() ; i++) {
            System.out.println(count.get(i));
        }
    }
}
