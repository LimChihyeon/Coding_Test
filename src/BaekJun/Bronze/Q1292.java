package BaekJun.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int i = 1;
        while(i*(i+1) < 2*A){i++;}
        int j = i;
        while(j*(j+1) < 2*B){j++;}

        int sum = 0 ;
        if(i==j) sum = (B-A+1)*i;
        else {
            sum += i*((i*(i+1)/2)-A+1);
            sum += j*(B-(j*(j-1)/2));
            for(int k = i+1 ; k<j ; k++){
                sum += k*k;
            }
        }
        System.out.println(sum);
    }

}
