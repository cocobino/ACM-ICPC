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
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static Scanner sc = new Scanner(System.in);
	static StringTokenizer st;
	
	static int dx[] = {-2,-1,1,2};
	static int dy[] = {1,2,2,1};
	
	static boolean visit[][];
	static boolean dir[] = new boolean[4];
	static int r,c,ans=0;
	
	 public static void main(String[] args) throws IOException {
		 st =new StringTokenizer(br.readLine());
		 r = Integer.parseInt(st.nextToken());
		 c = Integer.parseInt(st.nextToken());
		 
		 
		 if(r==1);
		 else if(r==2) {
			 ans = (r-1)/2;
			 ans = ans >3 ? 3 : ans;
		 }
		 else if(c<7) {
			 ans = c-1;
			 ans = ans >3 ? 3 : ans;
		 }
		 else ans = 4 + c-7;
		 
		 
		 bw.write(String.valueOf(ans+1));
		 bw.flush();
	 }//main
 
	
}// class
 