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
	 
	
	static int n,m;
	static char map[][];
	static int rst[][];
	static boolean visit[][];
	
	
	static int dx[] = {0,0,1,-1}; //©Л,аб,го,╩С
	static int dy[] = {1,-1,0,0};
 
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
 
		int n = Integer.parseInt(br.readLine());
		int sum=0;
		for(int i=0; i<n; i++) {
			int m = Integer.parseInt(br.readLine());
			
			sum += Math.pow(m/10, m%10);
		}
		bw.write(String.valueOf(sum));
		bw.flush();
		
	}//main
}//class
 