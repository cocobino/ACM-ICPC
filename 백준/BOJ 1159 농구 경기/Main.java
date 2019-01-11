
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	
	static int h,m;
	
	
	static int dx[] = {0,0,-1,1};
	static int dy[] = {1,-1,0,0};
	
	static int x,y;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
	 int test_case = Integer.parseInt(br.readLine());
	 
	 char alpha[] = new char[26];
	
	 for(int i=0; i<test_case; i++) {
		 alpha[br.readLine().charAt(0)-'a']++;
		 
	 }
	 boolean flag=false;
	 for(int i=0; i<26; i++) {
		 if(alpha[i]>=5) {
			 bw.write(String.valueOf((char)('a'+i)));
			 flag=true;
		 }
	 }
		if(!flag)bw.write(String.valueOf("PREDAJA"));
	bw.flush();
		
	}// main

 

}// class

   