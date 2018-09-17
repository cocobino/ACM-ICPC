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
	


 
	public static void main(String[] args) throws NumberFormatException, IOException {
//		int T = Integer.parseInt(br.readLine());
		
		for(int tc=1; tc<=10; tc++) {
			int n = Integer.parseInt(br.readLine());
			String in  = br.readLine();
			String a = br.readLine();
			

			

			int rst=0,cnt=0;
			for(int i=0; i<a.length()-in.length()+1; i++) {
				String tmp="";
				for(int j=i; j<i+in.length();j++	) {
					tmp+=a.charAt(j);
				}
				if(in.equals(tmp))rst++;
			}

		  bw.write(String.valueOf("#"+n+" "+rst+"\n"));
		  bw.flush();
		  
		 }//test_case
	}//main


}
 
