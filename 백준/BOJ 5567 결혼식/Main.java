
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
	 
	static int n,k,rst=0;
	static LinkedList<Integer> tree[];
	static boolean visit[];
	 
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
	 n = Integer.parseInt(br.readLine());
	 k = Integer.parseInt(br.readLine());
	 
	 visit =new boolean[n+1];
	 tree = new LinkedList[n+1];
	 for(int i=0; i<=n; i++)tree[i] = new LinkedList<>();
	 
	 for(int i=0; i<k; i++) {
		 st = new StringTokenizer(br.readLine());
		 int from = Integer.parseInt(st.nextToken());
		 int to = Integer.parseInt(st.nextToken());
		 
		 tree[from].add(to);
		 tree[to].add(from);
	 }
	 
	 //depth +1, +2;
	 visit[1]=true;
	 for(int i=0; i<tree[1].size(); i++) {
		dfs(tree[1].get(i),0);
	 }
	 
	 bw.write(String.valueOf(rst));
	 bw.flush();
	
	}// main


	private static void dfs(int cur, int depth) {
		// TODO Auto-generated method stub
		//깊이가 3이면 다return;
		if(depth==2)return;
		
		if(!visit[cur])rst++;
		
		visit[cur]=true;
		for(int i=0; i<tree[cur].size(); i++) {
		
				dfs(tree[cur].get(i), depth+1);
		}
		
		
	}
	
	
 
	

 
 
}// class

   