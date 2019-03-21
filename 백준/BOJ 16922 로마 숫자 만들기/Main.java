import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	 static int n;
	 static LinkedList<Integer> s;
	 static HashSet<Integer> duple;
	 static int arr[];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		n =  Integer.parseInt(br.readLine());
		//I, V, X, L
	
		int map[] = new int[n];
		s = new LinkedList<>();
		duple = new HashSet<>();
		arr = new int[4];
		arr[0]=1;
		arr[1]=5;
		arr[2]=10;
		arr[3]=50;
		
	Queue<Integer> q = new LinkedList<>();
	for(int i=0; i<4; i++)q.add(arr[i]);
	
	for(int i=0; i<n-1; i++) {
	int qsize =q.size();
	boolean vis[] = new boolean[100001];
	
	while(qsize-->0) {
		int cur =q.poll();
		
		for(int j=0; j<4; j++) {
			int now = cur+arr[j];
			if(!vis[now]) {
				q.add(now);
				vis[now]=true;
			}
		}
	}
	
	}
	
	System.out.println(q.size());
	
	}//main

	 
	 
}// class
