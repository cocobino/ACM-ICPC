import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
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
		//int T = Integer.parseInt(br.readLine());
		
		for(int tc=1; tc<=10; tc++) {
		int n = Integer.parseInt(br.readLine());
		
		String in = br.readLine();
		String post ="";
		
		for(int i=0; i<in.length(); i++) {
			if(in.charAt(i)== '+') {
				post +=in.charAt(++i);
				post +='+';
			}else {
				post += in.charAt(i);
			}
		}
		int rst =0;
		for(int i=0; i<in.length(); i++) {
			if(post.charAt(i) != '+') {
				rst +=(post.charAt(i)-'0');
			}
		}
		
		bw.write(String.valueOf("#"+tc+" "+rst+"\n"));
		bw.flush();
			
		 }//test_case
	}//main
 
	
}
 
