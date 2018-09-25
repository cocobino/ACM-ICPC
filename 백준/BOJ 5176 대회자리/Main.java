import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

class Solution {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	 public static void main(String[] args) throws IOException {
		 int test_case = Integer.parseInt(br.readLine());
		 
		 for(int T=1; T<=test_case; T++) {
			 StringTokenizer st =new StringTokenizer(br.readLine());
			 int n = Integer.parseInt(st.nextToken()); //참가자수
			 int p = Integer.parseInt(st.nextToken()); //좌석수
			 
			 int cnt=0;
			 boolean visit[] = new boolean[p];
			 for(int i=0; i<n; i++) {
				 int chk = Integer.parseInt(br.readLine())-1;
				 if(visit[chk])cnt++;
				 else visit[chk]=true;
			 }
			 bw.write(String.valueOf(cnt+"\n"));
			 bw.flush();
					 
			 
		 }
		 
	 			}
			}
