import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	 
	static int dx[] = {-1,1,0,0};
	static int dy[] = {0,0,-1,1};
	 
	static int n,k;
	static LinkedList<Integer> arr;
	static boolean[] visit;
	
	static ArrayList<Integer> tmp = new ArrayList<>();
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		st =new StringTokenizer(br.readLine());
		 n = Integer.parseInt(st.nextToken());
		 k = Integer.parseInt(st.nextToken());
		
		arr =new LinkedList<Integer>();
		visit = new boolean[n+1];
		
	
	
	dfs(1);
	
		
	 
	
		 
	}//main

	private static void dfs(int cur) throws IOException {
		// TODO Auto-generated method stub
	if(arr.size() ==k) {	
		for(int i=0; i<k; i++) {
			bw.write(String.valueOf(arr.get(i)+" "));
		}
		bw.newLine();
		bw.flush();
		return;
	}//ends option
	
	for(int i=cur; i<=n; i++) {
		if(!visit[i]) {
			visit[i]=true;
			arr.add(i);
			dfs(i);
			visit[i]=false;
			arr.removeLast();
		}
	}
	}

	 
	
}//class
 