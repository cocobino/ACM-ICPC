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
		 int n = Integer.parseInt(br.readLine());
		 
		 for(int i=0; i<n; i++) {
			 int tmp = Integer.parseInt(br.readLine());
			 
			 boolean a[] = new boolean[tmp+1];
			 
			 //Arrays.fill(a, true);
			 
			 for(int j=1; j<a.length; j++) {
				for(int k=1; k<a.length; k++) {
					if(k*j>tmp)continue;
					 if(a[k*j])a[k*j]=false;
					 else a[k*j]=true;
				}
			 }
			 
			 int cnt=0;
			 for(int j=1; j<a.length; j++) {
				if(a[j])cnt++; 
			 }
			 bw.write(String.valueOf(cnt+"\n"));
			 bw.flush();
		 }
		 
		
	}//main
 
}//class
 