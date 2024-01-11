package BaekJun.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1058 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] f_1 = new String[N];
        String[] f_2 = new String[N];
        String[] ans = new String[N];
        for(int i = 0 ; i<N ; i++){
            f_1[i] = "";
            f_2[i] = "";
            char[] temp = br.readLine().toCharArray();
            for(int j=0 ; j<N ; j++){
                if(temp[j] == 'Y'){
                    f_1[i]  += Character.toString('a' + j);
                }
            }
        }

        for(int i = 0 ; i<N ; i++) {
            if(f_1[i].length() > 1) {
                for(int j = 0; j < f_1[i].length(); j++) {
                    int index = f_1[i].charAt(j) - 'a';
                    f_2[index] = f_2[index].concat(f_1[i]);
                }
            }
        }

        for(int i=0 ; i<N ; i++){
            f_1[i] = f_1[i].concat(f_2[i]);
            ans[i] = "";
            for(int j=0 ; j<f_1[i].length() ; j++){
                if(f_1[i].indexOf(f_1[i].charAt(j))==j && f_1[i].charAt(j) - 'a' != i) {
                    ans[i] += f_1[i].charAt(j);
                }
            }
        }
        int max = 0;
        for(int i = 0 ; i< N ; i++){
            if(max<ans[i].length()) {
                max = ans[i].length();
            }
        }
        System.out.println(max);
    }
}
