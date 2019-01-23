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
	static int [] a;
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
		 a = new int[n+1];
		 st= new StringTokenizer(br.readLine());
		 for(int i=1; i<=n; i++) {
			 a[i] =Integer.parseInt(st.nextToken());
		 }
	 Arrays.sort(a);
		 dfs();
		 
	}//main

	private static void dfs() throws IOException {
		// TODO Auto-generated method stub
		if(arr.size() == k) {
			boolean flag=false;
			for(int i=0; i<arr.size()-1; i++) {
				if(arr.get(i)>arr.get(i+1))flag=true;
			}
			if(!flag) {
			for(int i=0; i<arr.size(); i++) {
				bw.write(String.valueOf(arr.get(i)+" "));
			}
			bw.newLine();
			bw.flush();
			}
			return;
		}
		
		for(int i=1; i<=n; i++) {
			if(!visit[i]) {
				visit[i]=true;
			arr.addLast(a[i]);
			dfs();
			arr.removeLast();
				visit[i]=false;
			}
		}
	}

	 
	
}//class
 