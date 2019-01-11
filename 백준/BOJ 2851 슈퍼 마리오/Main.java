
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
	 
	static int pin=100,gap=100,rst=0;
	static int arr[];
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
 
		arr = new int[10];
		
		for(int i=0; i<10; i++)arr[i] = Integer.parseInt(br.readLine());
		
		dfs(0,0);
		
		bw.write(String.valueOf(rst));
		bw.flush();
		
	}// main
	


	private static void dfs(int cur, int sum) {
		// TODO Auto-generated method stub
		if(Math.abs(sum-pin)>Math.abs(gap))return;
		else {
			gap =Math.abs(sum-pin);
			if(rst<=sum)rst =sum;
		}
		
		if(cur==10)return;
		
		dfs(cur+1, sum+arr[cur]);
	//	dfs(cur+1, sum);
			
	}// func : dfs
 
}// class

   