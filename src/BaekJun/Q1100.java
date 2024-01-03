package BaekJun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1100 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] chess = new char[8][8];
        int cnt=0;

        for(int i = 0 ; i<8 ; i++){
            String line = br.readLine();
            chess[i] = line.toCharArray();
            for(int j = 0 ; j<8 ; j++){
                if(chess[i][j] == 'F' && (i+j) % 2 == 0) cnt++;
            }
        }
        System.out.println(cnt);
    }
}
