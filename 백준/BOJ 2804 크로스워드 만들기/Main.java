
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
		String a = st.nextToken();
		String b = st.nextToken();
	int r= -1, c= -1;
	boolean flag=false;
	
		for(int i=0; i<a.length() && !flag; i++) {
			for(int j=0; j<b.length(); j++) {
				if(a.charAt(i) ==  b.charAt(j)) {
					r = j; c = i;
					flag=true;
					break;
				}
			}
		}
		
		char map[][] = new char[b.length()][a.length()];
		for(int i=0; i<b.length(); i++)Arrays.fill(map[i], '.');
		
		for(int i=0; i<a.length(); i++) {
			map[r][i] = a.charAt(i);
		}
		
		for(int i=0; i<b.length(); i++) {
			map[i][c]=b.charAt(i);
		}
		
		for(int i=0; i<b.length(); i++) {
			for(int j=0; j<a.length(); j++) {
				bw.write(String.valueOf(map[i][j]));
			}
			bw.newLine();
		}
		bw.flush();
	
	}// main
   
 
}// class

   