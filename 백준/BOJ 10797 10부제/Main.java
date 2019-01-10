
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
		n = Integer.parseInt(br.readLine());
		
		map = new int[5];
		st = new StringTokenizer(br.readLine());
		int rst=0;
		for(int i=0; i<5; i++) {
			map[i] = Integer.parseInt(st.nextToken());
			if(map[i]==n)rst++;
		}
		bw.write(String.valueOf(rst));
		bw.flush();
		
		
		
	}// main

 

}// class

   