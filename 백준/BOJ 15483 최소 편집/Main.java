import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

class Main {
    
   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
   static Scanner sc = new Scanner(System.in);
   static StringTokenizer st;
   
   static int dist[][]= new int[1001][1001];
   
    public static void main(String[] args) throws IOException {
    	
    	String a = br.readLine();
    	String b = br.readLine();
    	
    	int rst = editd(a,b);
    
    	bw.write(String.valueOf(rst));
    	bw.flush();
    	
    	
    	
  
	}//main

	private static int editd(String a, String b) {
		// TODO Auto-generated method stub
		for(int i=1; i<=a.length(); i++	) {
			dist[i][0] = i;
		}
		for(int j=1; j<=b.length(); j++) {
			dist[0][j] = j;
		}
		
		for(int j=1; j<= b.length(); j++) {
			for(int i=1; i<=a.length(); i++) {
				if(a.charAt(i-1) == b.charAt(j-1))dist[i][j] =dist[i-1][j-1];
				else dist[i][j] = Math.min(dist[i-1][j-1]+1, Math.min(dist[i-1][j]+1, dist[i][j-1]+1));
			}
		}
		
		
		return dist[a.length()][b.length()];
	}
}//class