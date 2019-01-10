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

	
	static boolean visit[];
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
StringTokenizer st;

	st =new StringTokenizer(br.readLine());
	int n = Integer.parseInt(st.nextToken());
	int m = Integer.parseInt(st.nextToken());
	int l = Integer.parseInt(st.nextToken());
	
	int size = Math.max(n, Math.max(m, l));
	int food[][] = new int[3][size];
	
	int sum=0;
	for(int i=0; i<3; i++) {
		st =new StringTokenizer(br.readLine());
		for(int j=0; st.hasMoreTokens(); j++) {
			food[i][j] = Integer.parseInt(st.nextToken());
			sum +=food[i][j];
		}
	}
	
	for(int i=0; i<3; i++) {
		Arrays.sort(food[i]);
	}
	
	
	int sale=0;
	for(int i=size-1; i>=0; i--) {
		int set1 =0;
		boolean flag=true;
		
		for(int j=0; j<3; j++) {
			set1 += food[j][i];
			if(food[j][i]==0)flag=false;
		}
		
		sale += flag ? set1 * 0.9 : set1;
	}
	
	System.out.println(sum);
	System.out.println(sale);
		  
	}// main

	 

}// class
  