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
	 
	
	static int r,c;
	static char map[][];
	static int rst[][];
	static boolean visit[][];
	
	
	static int dx[] = {0,0,1,-1}; //우,좌,하,상
	static int dy[] = {1,-1,0,0};
 
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
	
	 int n = Integer.parseInt(br.readLine());
	 
	 for(int k=0; k<n; k++) {
		 
		 int s = Integer.parseInt(br.readLine());
		 
		 double sscore=0,sgrade=0;
		 for(int i=0; i<s; i++) {
			 st =new StringTokenizer(br.readLine());
			 double score = Double.parseDouble(st.nextToken());
			 double grade = Double.parseDouble(st.nextToken());
			 
			 sscore+=score;
			 sgrade += (score*grade);
		 }
		 double gpa = (Math.round((sgrade/sscore)*10));
		 bw.write(String.valueOf((int)sscore+" "+gpa/10));
		 bw.newLine();
		 bw.flush();
		 
	 }//학기수
	 
	 
	}//main 
 
}// classg
  