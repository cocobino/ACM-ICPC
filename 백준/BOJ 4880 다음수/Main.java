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
import java.util.StringTokenizer;

public class Main {
	
	 static int R,C;
	 static boolean map[][]= new boolean[6][6];
	 static int dx[] = {0,1,0,-1}; //©Л, го, аб, ╩С
	 static int dy[] = {1,0,-1,0};
	 static int cnt=0, dir=0;
	 
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 

		/*R = Integer.parseInt(st.nextToken())-1;
		C = Integer.parseInt(st.nextToken())-1;
	*/
		
		for(;;) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a =Integer.parseInt(st.nextToken());
			int b =Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			if(a == 0 && b == 0 && c== 0)break;

				
			
			if(b-a == c-b) {
				bw.write(String.valueOf("AP "+(c+(c-b))+"\n"));
				bw.flush();
			}
			else if((int)Math.pow(b, 2)==a*c) {
				bw.write(String.valueOf("GP "+c*(c/b)+"\n"));
				bw.flush();
			}
		}

		
	}
}