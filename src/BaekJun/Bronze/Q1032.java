package BaekJun.Bronze;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1032 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String f_line = br.readLine();
        char[] Pattern = f_line.toCharArray();

        for(int i = 0 ; i< N-1 ; i++){
            char[] str = br.readLine().toCharArray();
            for(int j = 0 ; j < Pattern.length ; j++){
                if(Pattern[j] != str[j] ){
                    Pattern[j] = '?';
                }
            }
        }
        System.out.println(Pattern);
    }
}
