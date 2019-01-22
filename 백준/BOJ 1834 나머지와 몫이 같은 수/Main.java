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
	
	static int a,b,c;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
	
	long cnt=0;
	
	long a = Long.parseLong(br.readLine());
//	if(a<3) {
//		bw.write(String.valueOf(0));
//		bw.flush();
//		return;
//	}
	for(int i=1; i<a; i++) {
		cnt += (a+1)*i;
	}
		
		bw.write(String.valueOf(cnt));
		bw.flush();
	
	}//main
	
	
}//class
 