package BaekJun.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Q1296 {//보류

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] name = br.readLine().toCharArray();
        int N = Integer.parseInt(br.readLine());
        int[][] cnt = new int[N][4];
        char[] love = {'L', 'O', 'V', 'E'};
        int[] sum = new int[N];

        for(int i = 0 ; i<name.length ; i++){
            for(int j= 0 ; j<4 ; j++){
                if(name[i] == love[j]) {
                    for(int k= 0 ; k<N ; k++){
                        cnt[k][j]++;
                    }
                }
            }
        }

        char[][] str = new char[N][];
        for(int i = 0 ;i<N ; i++){
            str[i] = br.readLine().toCharArray();
            for(int j= 0 ; j< str[i].length ; j++){
                for(int k = 0 ; k<4 ; k++) {
                    if(str[i][j] == love[k]) {
                        cnt[i][k]++;
                    }
                }
            }
            sum[i] = 1;
            List<Integer> ex = new ArrayList<Integer>();
            for(int j = 0 ; j< 3 ; j++){
                for(int k = j+1 ; k<4 ; k++){
                    ex.add(cnt[i][j]+cnt[i][k]);
                }
            }
            for(int j = 0 ; j<6 ; j++){
                sum[i]*=ex.get(j);
            }
            sum[i]%=100;
        }

        int max=-1;
        int maxIndex=0;

        for(int i = 0 ; i<N ; i++){
            if(max<sum[i] || (max==sum[i] && str[i].toString().compareTo(str[maxIndex].toString()) < 0)) {
                max = sum[i];
                maxIndex = i;
            }
        }
        System.out.println(str[maxIndex]);
    }
}
