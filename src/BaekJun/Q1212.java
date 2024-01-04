package BaekJun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class Q1212 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split("");
        List<String> bin = new ArrayList<String>();
        String[] convert = {"000", "001", "010", "011", "100", "101", "110","111"};
        String[] first = {"0", "1", "10", "11", "100", "101", "110","111"};

        bin.add(first[Integer.parseInt(str[0])]);
        for(int i=1 ; i<str.length ; i++) {
            bin.add(convert[Integer.parseInt(str[i])]);
        }

        for (String s : bin) {
            System.out.print(s);
        }
    }
}
