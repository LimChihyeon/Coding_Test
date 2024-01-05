package BaekJun.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1267 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int y_sum = 0, m_sum = 0;

        for(int i = 0 ; i<N ; i++){
            int a = Integer.parseInt(st.nextToken());
            y_sum += (a/30+1)*10;
            m_sum += (a/60+1)*15;
        }
        if(y_sum < m_sum) {
            System.out.println("Y "+y_sum);
        } else if (m_sum < y_sum) {
            System.out.println("M "+m_sum);
        }
        else {
            System.out.print("Y M " + y_sum);
        }
    }
}
