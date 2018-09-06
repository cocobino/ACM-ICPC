import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
  
	static boolean visit[][] = new boolean[7][7];
	static String a,startA;
	static int x,y, preA,preB;
	static int input[][] = new int[37][3];
	
	static int dx[] = {1,2,2,1,-1,-2,-2,-1};
	static int dy[] = {2,1,-1,-2,-2,-1,1,2};
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for(int i=0; i<36; i++) {
			String a = br.readLine();
		x = a.charAt(0)-'A';
		y = a.charAt(1)-'1';
		input[i][0]=x;
		input[i][1]=y;
		if(i>0) {
		preA = input[i-1][0];
		preB = input[i-1][1];
		}
			if(visit[x][y])break;
			visit[x][y]=true;
			
			boolean case3 = false;
			for(int j=0; j<8; j++) {
				int aa = preA +dx[j];
				int bb = preB +dy[j];
			
			if(aa<0 || aa>5 || bb<0 || bb>5)continue;
			if(aa==x && bb==y)case3=true;
			}
			if(!case3 && i!=0)break;
		}
			for(int i=0; i<6; i++) {
				for(int j=0; j<6; j++) {
					if(!visit[i][j]) {
						bw.write(String.valueOf("Invalid"));
						bw.flush();
						System.exit(0);
					}
				}
			}
			
			boolean case4 = false;
			for(int j=0; j<8; j++) {
				int aa = input[0][0] +dx[j];
				int bb = input[0][1] +dy[j];
				if(aa<0 || aa>5 || bb<0 || bb>5)continue;
				if(aa==input[35][0] && bb == input[35][1])case4=true;
			}
			if(!case4) {
				bw.write(String.valueOf("Invalid"));
				bw.flush();
				System.exit(0);
			}
			
		bw.write(String.valueOf("Valid"));
		bw.flush();
		}
		
	}
 

