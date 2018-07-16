import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuffer sb = new StringBuffer();
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
 
        int[][] relation = new int[N + 1][N + 1];
        int r, c;
        for (int i = 1; i <= M; i++) {
            st = new StringTokenizer(br.readLine());
            r = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());
            relation[r][c] = 1;
            relation[c][r] = 1;
        }
 
        for (int k = 1; k <= N; k++) {
            for (int row = 1; row <= N; row++) {
                for (int col = 1; col <= N; col++) {
                    if (relation[row][k] != 0 && relation[k][col] != 0 && row != col) {
                        if (relation[row][col] == 0) {
                            relation[row][col] = relation[row][k] + relation[k][col];
                        } else {
                            relation[row][col] = Math.min(relation[row][col], relation[row][k] + relation[k][col]);
                        }
 
                    }
                }
            }
        }
 
        int min = Integer.MAX_VALUE;
        int sum = 0;
        int ans = 0;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                sum += relation[i][j];
            }
            if (min > sum) {
                min = sum;
                ans = i;
            }
            sum = 0;
        }
        System.out.println(ans);
    }
}
