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
	
	static int map[][] = new int[101][101];
	static int a,b;
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		while(true) {
		int tc = Integer.parseInt(br.readLine());
		
		a=0;b=0;map = new int[101][101];
		
		for(int i=0; i<100; i++) {
			StringTokenizer st= new StringTokenizer(br.readLine());
			
			for(int j=0; j<100; j++) {
			map[i][j] = Integer.parseInt(st.nextToken());
			
			if(i==j)a +=map[i][j];
			if((i+j+1)==100)b+=map[i][j];
			map[100][j] +=map[i][j];
			map[i][100] +=map[i][j];
			}
		}
			int z =100; int i=0;
			int max=0;
			while(z-->0) {
				max= Math.max(max, map[100][i]);
				max = Math.max(max, map[i][100]);
				i++; 
			}
			max = Math.max(max, a);
			max = Math.max(max, b);
			
			bw.write(String.valueOf("#"+tc+" "+max+"\n"));
			bw.flush();
	
			if(tc ==10)break;
		}//while
	}//main

 
	 
 
}//class
