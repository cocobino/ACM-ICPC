
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
		
		int test = Integer.parseInt(br.readLine());
		
		for(int i=0; i<test; i++) {
			st =new StringTokenizer(br.readLine());
			int r = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			if(r==e-c)bw.write(String.valueOf("does not matter"));
			else if(r>e-c)bw.write(String.valueOf("do not advertise"));
			else if(r<e-c)bw.write(String.valueOf("advertise"));
			bw.newLine();
			bw.flush();
			
		}
		
		
	}// main

 

}// class

   