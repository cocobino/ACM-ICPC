
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
	
	static int n,map[];
	
	
	static int dx[] = {0,0,-1,1};
	static int dy[] = {1,-1,0,0};
	
	static int x,y;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		 String in[] = new String[5];
		 int maxlen=0;
		 for(int i=0; i<5; i++) {
			 in[i]=br.readLine();
			 maxlen = Math.max(maxlen, in[i].length());
		 }
		 
		 char rst[][] = new char[5][maxlen];
		 for(int i=0; i<5; i++)Arrays.fill(rst[i], '-');
		 
		for(int i=0; i<5; i++) {
			for(int j=0; j<in[i].length(); j++) {
				rst[i][j] = in[i].charAt(j);
			}
		}
		
		for(int i=0; i<maxlen; i++) {
			for(int j=0; j<5; j++) {
				if(rst[j][i]=='-')continue;
				bw.write(String.valueOf(rst[j][i]));
			}
		}
		bw.flush();
		 
		 
		
	}// main

 

}// class

   