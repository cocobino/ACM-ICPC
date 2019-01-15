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
		int r = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		char map[][] = new char[r*2][c*2];
		
		for(int i=0; i<r; i++) {
			String a = br.readLine();
			for(int j=0; j<c; j++) {
				map[i][j] =a.charAt(j);
			}
		}
		st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken())-1;
		int y = Integer.parseInt(st.nextToken())-1;
		
		//right
		int tmpr=r;
		int tmpc=c-1;
		
		for(int i=0; i<r; i++) {
			for(int j=c; j<2*c; j++) {
				map[i][j] = map[i][tmpc--];
			}
			tmpc=c-1;
		}
		
		//right down
		tmpr = r-1;
		tmpc = c-1;
		for(int i=r; i<2*r; i++) {
			for(int j=c; j<2*c; j++) {
				map[i][j] = map[tmpr][j];
			}
			tmpr--;
		}
		
		
		//down
		tmpr = r-1;
		tmpc = c-1;
		
		for(int i=r; i<2*r; i++) {
			for(int j=0; j<c; j++) {
				map[i][j] = map[tmpr][j];
			}
			tmpr--;
		}
		
		if(map[x][y] == '#')map[x][y]='.';
		else if(map[x][y]== '.')map[x][y] ='#';
		
		for(int i=0; i<2*r; i++)	{
			for(int j=0; j<2*c; j++) {
				bw.write(String.valueOf(map[i][j]));
			}
			bw.newLine();
		}
		
		bw.flush();
	}// main
   
 
}// class

    