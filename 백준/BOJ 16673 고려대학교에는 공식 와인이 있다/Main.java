import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	 
	static int dx[] = {-1,1,0,0};
	static int dy[] = {0,0,-1,1};
	 
	static int c,k,p;
	static int map[], rst[], stack[];
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
	st =new StringTokenizer(br.readLine());
	c = Integer.parseInt(st.nextToken());
	k = Integer.parseInt(st.nextToken());
	p = Integer.parseInt(st.nextToken());
	
	/*
	 * c년동안 수집한 와인수
	 */
	
	int sum=0;
	
	for(int i=1; i<=c; i++) {
		sum += k*i + p*(i*i);
	}
	
	bw.write(String.valueOf(sum));
	bw.flush();
	}//main

}//class
 