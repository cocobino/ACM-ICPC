import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
 
	static int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		int prev =0, ans =0;
				
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<m; i++) {
			int pos = Integer.parseInt(st.nextToken());
			
			if(i==0) {
					ans = Math.max( ans , pos);
					
					prev = pos;
			}
			
			else {
				if(ans < (pos -prev + 1)/2 )ans = (pos-prev+1)/2;
				prev = pos;
			}
		}
		
		if(ans < n-prev)ans = n-prev;
		
		System.out.println(ans);
		
		
	}// main
 
}// class


class Node{
	int from, to;

	public Node(int from, int to) {
		super();
		this.from = from;
		this.to = to;
	}
	
}