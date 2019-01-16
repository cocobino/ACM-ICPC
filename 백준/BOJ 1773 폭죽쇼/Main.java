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
	 
	 
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
	st = new StringTokenizer(br.readLine());
	int n = Integer.parseInt(st.nextToken()); //학생수
	int m = Integer.parseInt(st.nextToken()); // 불꽃 시간
	
	boolean fire[] = new boolean[m+1];
	int rst=0;
	for(int i=0; i<n; i++) {
		int time = Integer.parseInt(br.readLine());
		
		for(int j=1; ; j++) {
			if(j*time>m)break;
			
			if(!fire[time*j]) {
				fire[time*j]=true;
				rst++;
			}
		}
	}
	
	
	bw.write(String.valueOf(rst));
	bw.flush();
	
	
	
	}//main
   
	
 
}// class

    