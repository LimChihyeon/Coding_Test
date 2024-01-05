package BaekJun.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Q1259 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> ans = new ArrayList<String>();
        boolean flag = false;

        while(true){
            char[] a = br.readLine().toCharArray();
            flag = false;
            if(a[0] == '0') break;
            for(int i=0 ; i<a.length/2 ; i++){
                if(a[i] != a[a.length-i-1]) {
                    flag = true;
                }
            }
            if(flag) {ans.add("no");}
            else {ans.add("yes");}
        }
        for(String s : ans){
            System.out.println(s);
        }
    }
}
