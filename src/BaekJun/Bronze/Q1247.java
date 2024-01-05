package BaekJun.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Q1247 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger[] A_sum = new BigInteger[3];

        for (int i = 0; i < 3; i++) {
            int A = Integer.parseInt(br.readLine());
            A_sum[i] = new BigInteger("0");
            for (int j = 0; j < A; j++) {
                BigInteger a = new BigInteger(br.readLine());
                A_sum[i] = A_sum[i].add(a);
            }
        }

        for (int i = 0; i < 3; i++) {
            if (A_sum[i].compareTo(BigInteger.ZERO) > 0) {
                System.out.println("+");
            } else if (A_sum[i].compareTo(BigInteger.ZERO) < 0) {
                System.out.println("-");
            } else System.out.println("0");
        }
    }
}
