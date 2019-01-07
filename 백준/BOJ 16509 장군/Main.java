import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {


	static BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	//target
	static int dx[] = {-3,-2,2,3, 3, 2,-2,-3};  
	static int dy[] = { 2, 3,3,2,-2,-3,-3,-2};
	 
	//canmove1
	static int mx1[] = {-1,0,0,1,1, 0, 0,-1};
	static int my1[] = { 0,1,1,0,0,-1,-1, 0};
	//canmove2
	static int mx2[] = {-2,-1,1,2, 2, 1,-1,-2};
	static int my2[] = { 1, 2,2,1,-1,-2,-2,-1};
	
	static boolean visit[];
	static int kingx,kingy,rst=10000;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		st = new StringTokenizer(br.readLine());
		int sangx = Integer.parseInt(st.nextToken());
		int sangy = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		kingx = Integer.parseInt(st.nextToken());
		kingy = Integer.parseInt(st.nextToken());
		
		visit =new boolean[8];
		
		dfs(sangx,sangy,0);
		
		if(rst!=10000)bw.write(String.valueOf(rst));
		else bw.write(String.valueOf(-1));
		bw.flush();
		
		
	}// main

	private static void dfs(int x, int y, int depth) {
		// TODO Auto-generated method stub
		if(depth ==10)return;
		if(x==kingx && y == kingy) {
			rst = Math.min(rst, depth);
			return;
		}
		
		for(int i=0; i<8; i++) {
			int nx = x +dx[i];
			int ny = y +dy[i];
			
			if(x==ny && y==ny)continue;
			if(nx>=0 && ny>=0 && nx<10 && ny<9) {
				if((x+mx1[i]==kingx && y+my1[i] ==kingy) || 
						(x+mx2[i] ==kingx && y +my2[i] ==kingy)) {
					continue;
				}
				dfs(nx,ny,depth+1);
			}
		}
		
	}// func : dfs

	
 

}//class
 