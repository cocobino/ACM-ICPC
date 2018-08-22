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
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
 
	 
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		 
		StringTokenizer st = new StringTokenizer(br.readLine());
		int r = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int zr = Integer.parseInt(st.nextToken());
		int zc = Integer.parseInt(st.nextToken());
		
		char map[][] = new char[r][c];
		
		for(int i=0; i<r; i++) {
			String a = br.readLine();
			for(int j=0; j<c; j++) {
			map[i][j] = a.charAt(j);
			}
		}
		
		for(int i=0; i<r; i++) {
			for(int l=0; l<zr; l++) {
				for(int j=0; j<c; j++) {
					for(int k=0; k<zc; k++) {
						bw.write(String.valueOf(map[i][j]));
					}
				}	bw.write(String.valueOf("\n"));
			}
		
		}
		
		bw.flush();
	}
}
