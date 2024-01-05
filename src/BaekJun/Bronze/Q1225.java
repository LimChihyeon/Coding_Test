package BaekJun.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Q1225 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String[] a = st.nextToken().split("");
        String[] b = st.nextToken().split("");
        Long sum = 0L;

        for (String A : a) {
            for (String B : b) {
                sum += Integer.parseInt(A) * Integer.parseInt(B);
            }
        }

        System.out.println(sum);
    }
}
