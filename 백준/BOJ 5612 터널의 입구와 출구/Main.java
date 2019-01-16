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
	
			int n  =Integer.parseInt(br.readLine());//조사한 시간
			
			int m = Integer.parseInt(br.readLine()); //터널안에 있는 차량수
			
			int max = m;
			boolean flag=false;
			
			for(int i=0; i<n; i++) {
				st=  new StringTokenizer(br.readLine());
				int in = Integer.parseInt(st.nextToken());
				int out = Integer.parseInt(st.nextToken());
				
				m += in-out;
				max = Math.max(m, max);
				if(m<0)flag=true;
				
			}
			
			
			if(flag)bw.write(String.valueOf("0"));
			else if(!flag)bw.write(String.valueOf(max));
			bw.flush();
	}//main
   
	
 
}// class

    