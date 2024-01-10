package BaekJun.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1024 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        double first = 0;
        boolean flag = false;


        for(int i = L ; i<=100 ; i++) {
            first = (1 - (double)i) / 2 + ((double)N / i);
            if (first == (int)first && first >= 0) {
                for(int j = (int)first ; j< (int)first + i ; j++){
                    System.out.print(j + " ");
                    flag = true;
                }
                break;
            }
        }
        if(!flag) System.out.println("-1");

    }
}
