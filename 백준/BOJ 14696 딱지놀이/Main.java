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
	 
		int test_case = Integer.parseInt(br.readLine());
		
		for(int k=0; k<test_case; k++)	{
		
			st = new StringTokenizer(br.readLine());
			int n  = Integer.parseInt(st.nextToken());
			int arr[] = new int[n];
			int acnt[] = new int[5];
			
			for(int i=0; i<n; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
				acnt[arr[i]]++;
			}
			
			st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken());
			int brr[] = new int[n];
			int bcnt[] = new int[5];
			
			for(int i=0; i<n; i++) {
				brr[i] = Integer.parseInt(st.nextToken());
				bcnt[brr[i]]++;
			}			//insert
			
			//sol
			
			//1. case :  별의 개수
			if(acnt[4] > bcnt[4]) {
				bw.write(String.valueOf("A"));
				bw.newLine();
				bw.flush();
			}
			else if( acnt[4] < bcnt[4]) {
				bw.write(String.valueOf("B"));
				bw.newLine();
				bw.flush();
			}
			//case 2 : 별의개수가 같고 동그라미 
			else if(acnt[3] > bcnt[3]) {
				bw.write(String.valueOf("A"));
				bw.newLine();
				bw.flush();
			}
			else if(acnt[3]< bcnt[3]) {
				bw.write(String.valueOf("B"));
				bw.newLine();
				bw.flush();
			}
			//case 3: 
			else if(acnt[2] > bcnt[2]) {
				bw.write(String.valueOf("A"));
				bw.newLine();
				bw.flush();
			}
			else if(acnt[2] < bcnt[2]) {
				bw.write(String.valueOf("B"));
				bw.newLine();
				bw.flush();
			}
			//case 4 : 세모
			else if(acnt[1] > bcnt[1]) {
				bw.write(String.valueOf("A"));
				bw.newLine();
				bw.flush();
			}
			else if(acnt[1] < bcnt[1]) {
				bw.write(String.valueOf("B"));
				bw.newLine();
				bw.flush();
			}else {
				bw.write(String.valueOf("D"));
				bw.newLine();
				bw.flush();
			}
			
			
		}
		
		
	}//main
 
}//class
 