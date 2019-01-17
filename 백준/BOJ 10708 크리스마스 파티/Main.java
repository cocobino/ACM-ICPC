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

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	 
	
	static int n,m;
	static char map[][];
	static int rst[][];
	static boolean visit[][];
	
	
	static int dx[] = {0,0,1,-1}; //우,좌,하,상
	static int dy[] = {1,-1,0,0};
 
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		//친구들의 수
	 n = Integer.parseInt(br.readLine());
	 	// 게임횟수
	 m = Integer.parseInt(br.readLine());
	 
	 int[] arr = new int[m+1];
	 st =new StringTokenizer(br.readLine());
	 for(int i=1; i<=m; i++)arr[i] = Integer.parseInt(st.nextToken());
	 
	 int[] man = new int[n+1];
	 int[] rst = new int[n+1];
	 
	 for(int i=1; i<=m; i++) {
		 st = new StringTokenizer(br.readLine());
		 for(int j=1; j<=n; j++) {
			 man[j]= Integer.parseInt(st.nextToken());
			 if(arr[i]==man[j]) {
				 rst[j]++;
			 }else {
				 rst[arr[i]]++;
			 }
		 } 
	 }
	  
	 
	 for(int i=1; i<=n; i++) {
		 bw.write(String.valueOf(rst[i]+"\n"));
		 bw.flush();
	 }
	 
	 
	}//main 
 
}// classg
  