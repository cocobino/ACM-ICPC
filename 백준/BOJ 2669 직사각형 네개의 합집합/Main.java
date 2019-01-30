import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	                                                                                                  
	static int dx[] = {-1,1,0,0}; //상, 하 , 좌 , 우
	static int dy[] = {0,0,-1,1};
	 						  //오른위(4), 오른아래(5), 왼위(6), 왼아래(7)
	static int map[][],rst[][];
	static boolean visit[][];
	
	static int n;
	 
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
	 
		map = new int[105][105];
		
		for(int k=0; k<4; k++) {
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			
			for(int i=x1; i<x2; i++) {
				for(int j=y1; j<y2; j++) {
					map[i][j] = 1;
				}
			}
		}
		int rst= 0;
		for(int i=0; i<105; i++) {
			for(int j=0; j<105; j++) {
				rst +=map[i][j];
			}
		}
		
		bw.write(String.valueOf(rst));
		bw.flush();
	}//main
 
}//class
 