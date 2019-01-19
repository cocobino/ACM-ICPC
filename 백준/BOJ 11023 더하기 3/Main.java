import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	 
	
	static int r,c,a,b,k;
	static int map[][];
	static int[][] dpice,dpjung,dpocean;
	
	static boolean visit[][];
	
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		 String a[] = br.readLine().split(" ");
		 
		 int sum=0;
		 for(int i=0; i<a.length; i++) {
			 sum += Integer.parseInt(a[i]);
		 }
		 
		 bw.write(String.valueOf(sum));
		 bw.flush();
		
	}//main
}//class