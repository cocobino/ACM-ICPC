import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	static StringTokenizer st;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 
	static int n;
 	static boolean visit[];
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	n = Integer.parseInt(br.readLine());
	
	int prime[] = {2,3,5,7};
	
	 for(int i=0; i<4; i++) {
		 recur(prime[i],n-1);
	 }
	 bw.flush();
	}//main

	private static void recur(int first, int n) throws IOException {
		// TODO Auto-generated method stub
		if(n==0)bw.write(String.valueOf(first+"\n"));
		
		for(int i=1; i<10; i+=2) {
			int tmp = first*10 + i;
			if(isprime(tmp)) {
				recur(tmp,n-1);
			}
		}
		
	}//func recur

	private static boolean isprime(int num) {
		// TODO Auto-generated method stub
		if(num<2)return false;
		for(int i=2; i*i<=num; i++) {
			if(num%i ==0)return false;
		}
		return true;
	}

	
 
}//class   