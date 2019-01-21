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
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	 
	static int dx[] = {-1,1,0,0};
	static int dy[] = {0,0,-1,1};
	
	static int r,c;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
	  int a = Integer.parseInt(br.readLine());
	  int b = Integer.parseInt(br.readLine());
	  int c = Integer.parseInt(br.readLine());
	  
	  if(a+b+c!=180	) {
		  bw.write(String.valueOf("Error"));
	  }else if(a+b+c ==180 && a==60 && b ==60 && c==60) {
		  bw.write(String.valueOf("Equilateral"));
	  }else if(a+b+c ==180 && (a==b || b==c || a==c)) {
		  bw.write(String.valueOf("Isosceles"));
	  }else if (a+b+c ==180 &&  a!=b && b!=c && c!=a) {
		  bw.write(String.valueOf("Scalene"));
	  }
		
	  bw.flush();
	}//main 
	
	
	
}//class
 