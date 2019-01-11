
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
	int n = Integer.parseInt(st.nextToken());
	int w = Integer.parseInt(st.nextToken());
	int h = Integer.parseInt(st.nextToken());
	
	for(int i=0; i<n; i++) {
		int tmp = Integer.parseInt(br.readLine());
		bw.write(String.valueOf(tmp*tmp>w*w +h*h ? "NE" : "DA"));
		bw.newLine();
		bw.flush();
	}
	 
	}// main
 
	

 
 
}// class

   