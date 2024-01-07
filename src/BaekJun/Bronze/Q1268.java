package BaekJun.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1268 { //보류
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[][] student = new String[N][5];
        String[] cnt = new String[N];
        for(int i = 0 ; i<N ; i++) {
            student[i] = br.readLine().split(" ");
            cnt[i]="";
        }
        for(int i = 0 ; i < N-1 ; i++){
            for(int j = i+1; j < N ; j++){
                for(int k = 0 ; k<5 ; k++){
                    if(student[i][k].equals(student[j][k]) && !cnt[i].contains(Integer.toString(j+1))){
                        cnt[i] = cnt[i].concat(Integer.toString(j+1));
                        cnt[j] = cnt[j].concat(Integer.toString(i+1));
                    }
                }
            }
        }

        int max = 0;
        int maxIndex=0;
        for(int i = 0 ; i<N ; i++){
            if(max<cnt[i].length()){
                max = cnt[i].length();
                maxIndex=i;
            }
        }
        System.out.println(maxIndex+1);

    }
}
