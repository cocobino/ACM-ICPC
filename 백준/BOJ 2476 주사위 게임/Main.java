import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
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
	 
 
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
	int n = Integer.parseInt(br.readLine());
		int max=0;
	 for(int i=0; i<n; i++) {
		 st= new StringTokenizer(br.readLine());
		 int a = Integer.parseInt(st.nextToken());
		 int b = Integer.parseInt(st.nextToken());
		 int c = Integer.parseInt(st.nextToken());
		 
		 int rst=0;
		 int dchk=0;
		 int dice[] =new int[7];
		 
		if(dice[a]!=0) {
			dchk++;
			dice[a]++;
		}else dice[a]++;
		
		if(dice[b]!=0) {
			dchk++;
			dice[b]++;
		}else dice[b]++;
		
		if(dice[c]!=0) {
			dchk++;
			dice[c]++;
		}else dice[c]++;
		
		if(dchk==2) {
			for(int j=1; j<=6; j++) {
				if(dice[j]==3) {
					rst = 10000 + (j*1000);
					break;
				}				
			}
			max = Math.max(max, rst);
		}else if(dchk==1) {
			
			for(int j=1; j<=6; j++) {
				if(dice[j]==2) {
					rst = 1000 + j*100;
					break;
				}
			}
			max = Math.max(max, rst);
		}
		else if(dchk==0) {
			for(int j=6; j>=1; j--) {
				if(dice[j]==1) {
					rst = 100*j;
					break;
				}
			}
			max = Math.max(max, rst);
		}
			 
	 }
		 bw.write(String.valueOf(max));
		 bw.flush();
	}//main

	
}//class 