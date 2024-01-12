package BaekJun.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1080 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] flip = new int[N][M];
        char[][] A = new char[N][M];
        char[][] B = new char[N][M];
        int cnt = 0;
        boolean flag = false;

        for(int i=0 ; i<N ; i++){ A[i] = br.readLine().toCharArray();}
        for(int i=0 ; i<N ; i++){ B[i] = br.readLine().toCharArray();}
        for(int i=0 ; i<N ; i++){
            for(int j=0 ; j<M ; j++){
                if(A[i][j] != B[i][j]) {flip[i][j] = 1; flag = true; }
            }
        }

        for(int i=0 ; i<N ; i++){
            for(int j=0 ; j<M ; j++){
                if(flip[i][j] == 1) {
                    flipper(N,M,i,j,flip);
                    cnt++;
                }
            }
        } //뒤집기 카운트


        if((N < 3 || M < 3) && flag) { cnt = -1; }
        else {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (flip[i][j] == 1) {cnt = -1; break;}
                }
            }
        }

        System.out.println(cnt);
    }
    static void flipper(int N, int M, int a, int b, int[][] flip){
        for(int i=a ; i<a+3 && a+3<=N ; i++){
            for(int j=b ; j<b+3 && b+3<=M ; j++){
                flip[i][j] = 1- flip[i][j];
            }
        }
    }
}
