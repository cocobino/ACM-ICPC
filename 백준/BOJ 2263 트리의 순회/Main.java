import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static int dp[];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		
		
		int pre[] = new int[n+1];
		int post[] = new int[n];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0,tmp; i<n; i++) {
			tmp = Integer.parseInt(st.nextToken());
			pre[tmp] = i;
		}
		
		st= new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			post[i] = Integer.parseInt(st.nextToken());
		}
		
		order(0,n-1,0,n-1,pre,post);
	}// main
	private static void order(int is, int ie, int ps, int pe, int[] pre, int[] post) {
		if(is>ie || ps>pe)return;
		
		int root = post[pe];
		System.out.print(root+" ");
		
		order(is, pre[root]-1, ps, ps+pre[root]-is-1,pre, post );
		order(pre[root]+1, ie, ps + pre[root]-is, pe-1, pre, post);
		
	}
 
  }// class
  