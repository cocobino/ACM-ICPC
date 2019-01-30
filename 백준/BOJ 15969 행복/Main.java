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
	 
	static int dx[] = {-1,1,0,0,1,-1,-1,1}; //상, 하 , 좌 , 우
	static int dy[] = {0,0,-1,1,1,1,-1,-1};
	 						  //오른위(4), 오른아래(5), 왼위(6), 왼아래(7)
	static int map[][], com[];
	static boolean visit[][];
	
	static boolean flag=false;
	static int bingo=0;
	
	static ArrayList<ArrayList<ArrayList<Integer>>> bing = new ArrayList<>();	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		 
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		int max=0,min=10000;
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			max = Math.max(max, arr[i]);
			min = Math.min(min, arr[i]);
		}
		
		bw.write(String.valueOf(max-min));
		bw.flush();
		
	}//main
 
 
 
 
}//class
 