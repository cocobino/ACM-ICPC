package com.ssafy.java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	
	static BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int n =Integer.parseInt(br.readLine());
		 int i=0;
		while(n>0) {
			i ++;
			String a =String.valueOf(i);
			n-=a.length();
			if(n<=0) {
				bw.write(a.charAt(a.length()-1+n));
			}
		}
	 bw.flush();
	}// main


 
}// class
