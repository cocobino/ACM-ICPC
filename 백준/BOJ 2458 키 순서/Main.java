import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution {

	static int n, m;
	static int floyd[][];

	// static int dx[] = {0,0,1,-1};
	// static int dy[] = {1,-1,0,0};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
			
			n = Integer.parseInt(st.nextToken()); // 학생수
			m = Integer.parseInt(st.nextToken()); // 간선 수

			int rst[] = new int[505];
			floyd = new int[505][505];

			for (int i = 1; i <= n; i++) {
				Arrays.fill(floyd[i], 987654321);
			}
			for(int i=1; i<=n; i++) {
				floyd[i][i]=0;
			}
			for (int i = 0; i < m; i++) {
				st = new StringTokenizer(br.readLine());
				int from = Integer.parseInt(st.nextToken());
				int to = Integer.parseInt(st.nextToken());
				floyd[from][to] = 1;
			}

			for (int mid = 1; mid <= n; mid++) {
				for (int start = 1; start <= n; start++) {
					for (int end = 1; end <= n; end++) {
						if (floyd[start][end] > floyd[start][mid] + floyd[mid][end]) {
							floyd[start][end] = floyd[start][mid] + floyd[mid][end];
						}
					}
				}
			}
			int ans =0;
			 for(int i=1;i<=n;i++)
			    {
			        int f=1;
			        for(int j=1;j<=n;j++)
			        {
			            if(floyd[i][j]==987654321 && floyd[j][i]==987654321)
			            {
			                f=0;
			                break;
			            }
			        }
			        if(f==1) ans++;
			    }
			System.out.println( ans);

	 

	}// main

}// class