import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;
 
class Solution {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	static char map[][];
	static int n;

 
	public static void main(String[] args) throws NumberFormatException, IOException {
		//int T = Integer.parseInt(br.readLine());
		
		for(int tc=1; tc<=10; tc++) {
			//회문길이
			int n = Integer.parseInt(br.readLine());
			map = new char[8][8];
			
			for(int i=0; i<8; i++) {
				String in = br.readLine();
				for(int j=0; j<8; j++) {
					map[i][j] = in.charAt(j);
				}
			}//insert
			int rst =0;
			for(int i=0; i<8; i++) {
				for(int j=0; j<8; j++) {
					String chk1 = "";
					String chk2 = "";
					for(int k=0; k<n; k++) {
						if(j+k>=8)continue;
						chk1 +=map[i][j+k];
						
					}
					for(int k=0; k<n; k++) {
						if(i+k>=8)continue;
						chk2 +=map[i+k][j];
					}
					if(chk1.length()==n)rst +=chk(chk1);		
					if(chk2.length()==n)rst +=chk(chk2);
					
				}
			}
			
			bw.write(String.valueOf("#"+tc+" "+rst+"\n"));
			bw.flush();
			
		 }//test_case
	}//main


	private static int chk(String st) {
		// TODO Auto-generated method stub
		String tmp = "";
		for(int i=st.length()-1; i>=0; i--) {
			tmp +=st.charAt(i);
		}
		
		if(st.equals(tmp))return 1;
		else return 0;
	}

 
}
 
