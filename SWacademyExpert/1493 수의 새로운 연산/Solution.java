import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
 
import java.util.StringTokenizer;
 
class Solution {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	 static int n;
	 static int map[][];
	 static int dx[] = {-1};
	 static int dy[] = {1};

	public static void main(String[] args) throws NumberFormatException, IOException {
		int T = Integer.parseInt(br.readLine());
		map = new int[1001][1001];
		int cnt=1;
		for(int i=1; cnt<=100000; i++) {
			for(int j=1,k=i; j<=i; j++,k--) {
				map[k][j]=cnt++;
			}
		}
		
		for(int tc=1; tc<=T; tc++) {
			StringTokenizer st=  new StringTokenizer(br.readLine());
			int p = Integer.parseInt(st.nextToken());
			int q = Integer.parseInt(st.nextToken());
			
			int rst = cal(p,q);
			
			bw.write(String.valueOf("#"+tc+" "+rst+"\n"));
			bw.flush();
	   
		}//test-case
	}//main

 

	private static int cal(int p, int q) {
		// TODO Auto-generated method stub
		int px=0,py=0,qx=0,qy=0;
		
		for(int i=1; i<=150; i++) {
			for(int j=1; j<=150; j++) {
				if(map[i][j]==p) {
					px =i;
					py =j;
				}
				if(map[i][j]==q) {
					qx = i;
					qy = j;
				}
				if(px !=0 && qx != 0)break;
			}
		}
		
		int rstx = px + qx;
		int rsty = py + qy;
		
		
		
		
		return map[rstx][rsty]	;
	}

 
 
}//class
 
