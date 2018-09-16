import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;
 
class Solution {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	static LinkedList arr[];
	static int n;
	static int command[];
	static boolean visit[],flag;
	 
	public static void main(String[] args) throws NumberFormatException, IOException {
 
		for(int tc=1; tc<11; tc++) {
			flag=false;
			StringTokenizer st = new StringTokenizer(br.readLine());
			int test_case = Integer.parseInt(st.nextToken());
			n = Integer.parseInt(st.nextToken());
			
			visit = new boolean[n];
			command = new int[n*2];
			arr = new LinkedList[n];
			for(int i=0; i<n; i++)arr[i] = new LinkedList<Integer>();
			
			st = new StringTokenizer(br.readLine());
			for(int i=0; i<n*2; i++) {
			command[i] = Integer.parseInt(st.nextToken());
			}
			
			for(int i=0; i<n*2; i=i+2) {
				arr[command[i]].add(command[i+1]);
			}
			
			dfs(0);
			
			if(flag)bw.write(String.valueOf("#"+tc+" "+"1"+"\n"));
			else bw.write(String.valueOf("#"+tc+" "+"0"+"\n"));
			bw.flush();
		}//test_case
		
	 

	}

	private static void dfs(int cur) {
		// TODO Auto-generated method stub
		if(visit[cur])return;
		for(int i=0; i<arr[cur].size(); i++){
			int log =(int)arr[cur].get(i);
			if((int)arr[cur].get(i)==99) {
				flag = true;
				return;
			}
			
		}
		
		visit[cur]=true;
		
		for(int i=0; i<arr[cur].size(); i++) {
			int next = (int) arr[cur].get(i);
			
			if(!visit[next])dfs(next);
			
		}
		
	} 
  
}//class
 