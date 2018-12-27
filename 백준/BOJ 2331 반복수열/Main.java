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
	
	static int p;
	static LinkedList<Integer> rst = new LinkedList<>();
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	 
		st = new StringTokenizer(br.readLine());
		String a = st.nextToken(); 
		p = Integer.parseInt(st.nextToken());
		int stop=0;
		
		
		LinkedList<Integer> arr = new LinkedList<>();
		Set<Integer> duple = new HashSet<>();
		//init
		arr.add(Integer.parseInt(a));
		duple.add(Integer.parseInt(a));
		//sol
		int cnt=0;
		boolean flag=false;
		while(!flag) {
			cnt++;
			int tmp=0;
			for(int i=0; i<a.length(); i++) {
				tmp += Math.pow(a.charAt(i)-'0', p);
			}
			if(!duple.contains(tmp)) {
				duple.add(tmp);
				arr.add(tmp);
				
				a = Integer.toString(tmp);
				continue;
			}
			else {
			for(int i=0; i<arr.size(); i++) {
				if(arr.get(i)!=tmp)stop++;
				
				else {
					flag=true;
					break;
				}
				
			}
			}
			
			
		}

		bw.write(String.valueOf(stop));
		bw.flush();
	
		
		
	}//main
 

}//class
  