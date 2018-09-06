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
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
 
	
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		  
		StringTokenizer st= new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int r = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		 int y = (int)Math.pow(2,N)/2;
		 int x = y;
		int ans=0;
		
		while(N-->0) {
			int tmp = (int)Math.pow(2,N)/2;
			int skip= (int)Math.pow(4,N);
			
			if(r < y && c < x) {
				x -=tmp;
				y -=tmp;
			}else if(r < y && x <= c) {
				x+=tmp;
				y-=tmp;
				ans += skip;
			}else if(y <= r && c<x) {
				x -=tmp;
				y +=tmp;
				ans += skip*2;
			}else{
				x += tmp;
				y += tmp;
				ans += skip*3;
			}
		}
		
		bw.write(String.valueOf(ans));
		bw.flush();
	
	}
 }
  
