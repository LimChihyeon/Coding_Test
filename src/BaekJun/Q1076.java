package BaekJun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1076 {

    public enum Colors{
        black, brown, red, orange, yellow, green, blue, violet, grey, white
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] A = new int[3];
        for(int i = 0 ; i <3 ; i++){
            Colors color = Colors.valueOf(br.readLine());
            A[i] = color.ordinal();
        }
        System.out.println((long)(A[0]*10+A[1])*(long)Math.pow(10, A[2]));
    }

}
