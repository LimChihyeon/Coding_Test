    package BaekJun.Silver;

    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.util.StringTokenizer;

    public class Q1105 {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            String L = st.nextToken();
            String R = st.nextToken();
            String sub = String.valueOf((Integer.parseInt(R) - Integer.parseInt(L)));
            int cnt = 0;

            if(Integer.parseInt(sub) == 0) {
                for(int i=0; i<L.length() ; i++){
                    if(L.charAt(i) == '8') cnt++;
                }
            }
            else {
                if (L.length() - sub.length() > 0 && R.length() == L.length()) {
                    for(int i = 0 ; i<L.length() - sub.length() ; i++){
                        if(L.charAt(i) == '8' && R.charAt(i) == '8') cnt++;
                    }
                }
            }
            System.out.println(cnt);
        }
    }
