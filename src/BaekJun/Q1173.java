import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1173 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());
        int cnt = 0;
        int current = m;
        while(N>0 && m+T <= M){
            if(current+T <= M) {
                current+=T;
                N--;
                cnt++;
            }
            else {
                current-=R;
                if(current < m) current=m;
                cnt++;
            }
        }
        if(cnt == 0 ) cnt=-1;
        System.out.println(cnt);
    }
}
