import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static char map[][] = new char[10][10];
	static int dx[] = { 0, 0, -1, 1 };
	static int dy[] = { 1, -1, 0, 0 };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());

		int[] color = new int[n];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			color[i] = Integer.parseInt(st.nextToken());
		} // insert

		int l[] = new int[n];
		int r[] = new int[n];

		long left = 0, right = 0;
		for (int i = 0; i < n; i++) {
			if (i - 1 >= 0) {
				if (color[i - 1] < color[i]) {
					l[i] = c - color[i] + color[i - 1];
				} else {
					l[i] = color[i - 1] - color[i];
				}
			}

				if (i + 1 < n) {
					if (color[i] <= color[i + 1]) {
						r[i] = color[i + 1] - color[i];
					} else {
						r[i] = c - color[i] + color[i + 1];
					}
				}
			right += r[i];
		}
		long rst =1;
		long min = Long.MAX_VALUE;
		for(int i=0; i<n; i++) {
			left += l[i]; 
			long cnt = Math.max(right, left);
			
			if(min > cnt) {
				rst = i+1;
				min = cnt;
			}
			right -=r[i];
		}
		
		System.out.println(rst +"\n" + min);

	}// main

}// class
