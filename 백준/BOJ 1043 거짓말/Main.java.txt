import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	
	static StringTokenizer st;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	static int parent[] = new int[51];
	static ArrayList<Integer> know = new ArrayList<Integer>();
	static ArrayList<Integer> v[] = new ArrayList[51];
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		for(int i=0; i<51; i++) v[i] = new ArrayList<Integer>();
		
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int k  = Integer.parseInt(st.nextToken());
		
		while(k-->0) {
			know.add(Integer.parseInt(st.nextToken())); 
		}
		
		for(int i=1; i<=n; i++) {
			parent[i] = i;
		}
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine());
			int p = Integer.parseInt(st.nextToken());
			int num=0,prev=0;
			for(int j=0; j<p; j++) {
				if(j >= 1) {
					prev =num;
					num = Integer.parseInt(st.nextToken());
					Union(prev, num);
				} else {
					num = Integer.parseInt(st.nextToken());
				}
				v[i].add(num);
			}
		}
		
		for(ArrayList<Integer> list : v) {
			boolean flag =false;
			for(int i=0; i<list.size(); i++) {
				if(flag) break;
				for(int j=0; j<know.size(); j++) {
					if(Find(list.get(i)) == Find(know.get(j))) {
						flag = true;
						break;
					}
				}
			}
			if(flag)m--;
		}
		System.out.println(m);
		
	}
	
	public static int Find(int x) {
		if(parent[x] == x) return x;
		return x = Find(parent[x]);
	}
	
	public static void Union(int x, int y) {
		x = Find(x);
		y = Find(y);
		parent[x] =y;
	}
}