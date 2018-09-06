import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;
import java.util.StringTokenizer;


public class Main {
	static int row,col;
	static char arr[][];
	

	public static void main(String... args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	StringTokenizer st = new StringTokenizer(br.readLine());
	 row = Integer.parseInt(st.nextToken());
	 col = Integer.parseInt(st.nextToken());
	
	arr = new char[row][col];
	boolean chkrow[] = new boolean[row];
	boolean chkcol[] = new boolean[col];
	
	for(int i=0; i<row; i++) {
		String a =br.readLine();
		for(int j=0; j<col; j++) {
			arr[i][j] = a.charAt(j);
			if(arr[i][j]=='X') {
				chkrow[i] =true;
				chkcol[j] =true;
			}
		}
	}
	int cnt=0;
		for(int i=0; i<row; i++) {
			if(!chkrow[i]) {
				cnt++;
			}
		}
		int cnt1=0;
		for(int j=0; j<col; j++) {
			if(!chkcol[j]) {
				cnt1++;
			}
		}
	bw.write(String.valueOf(Math.max(cnt, cnt1)));
	bw.flush();
	
	}
}