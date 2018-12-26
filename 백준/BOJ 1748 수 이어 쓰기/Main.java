import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	static StringTokenizer st;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 
	static int n;
	static int dx[] = {0,0,1,-1};
	static int dy[] = {1,-1,0,0};
	
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		n = Integer.parseInt(br.readLine());
		int ans=0;
		 int base=10;
		 int cnt=1;
		for(int i=1; i<=n; i++) {
			if(i==base) {
				base *=10;
				cnt++;
			}
			ans+=cnt;
		}
		bw.write(String.valueOf(ans));
		bw.flush();
 
	}//main

 
	
}//class

 