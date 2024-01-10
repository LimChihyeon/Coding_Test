package BaekJun.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Q1012 {

    public static int update_flag(int[][][] loc, int x, int y, int area ,int count){
        if(loc[x][y][0] == 1) {
            loc[x][y][0] = 2; //flag 2 == 이미 탐색함
            if(area==0) {loc[x][y][1] = count++;} //area 설정
            else {loc[x][y][1] = area;}

            if (x + 1 < loc.length) {
                update_flag(loc, x + 1, y, area, count);
            }
            if (x - 1 >= 0) {
                update_flag(loc, x - 1, y, area, count);
            }
            if (y + 1 < loc[0].length) {
                update_flag(loc, x, y + 1, area, count);
            }
            if (y - 1 >= 0) {
                update_flag(loc, x, y - 1, area, count);
            }
        }
        return count;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[] ans = new int[T];

        for(int i= 0 ; i<T ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int M = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            int[][][] loc = new int[M][N][2];
            int count = 1;
            for(int j = 0 ; j < K ; j++){
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                loc[x][y][0] = 1; //flag
                loc[x][y][1] = 0; //area
            }

            for(int j= 0 ; j< M ; j++){
                for(int k = 0 ; k< N ; k++){
                    count = update_flag(loc, j, k, 0,count);
                }
            }
            ans[i] = count-1;
        }
        for(int i = 0 ; i<T ; i++){
            System.out.println(ans[i]);
        }
    }
}
