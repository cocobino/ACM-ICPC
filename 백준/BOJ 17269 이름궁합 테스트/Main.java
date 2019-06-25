import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
		static int sorted[];
		static int[] score = {
				3,2,1,2,4,3,1,3,1,1,3,1,3,2,1,2,2,2,1,2,1,1,1,2,2,1
		};
		
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		String a = st.nextToken();
		String b = st.nextToken();
		 
		int max = Math.max(a.length(), b.length());
		ArrayList<Integer> rst = new ArrayList<>();
		
		for(int i=0; i<max; i++) {
			if(i < a.length()) {
				rst.add(score[a.charAt(i)-'A']);
			}
			if(i < b.length()) {
				rst.add(score[b.charAt(i)-'A']);
			}
		}
		
		int ans =0;
		while(rst.size()>2) {
			ArrayList<Integer> tmp = new ArrayList<>();
			ans=0;
			for(int i=0; i<rst.size()-1; i++) {
				int sum = rst.get(i)+rst.get(i+1);
				if(sum>=10)sum-=10;
				
				tmp.add(sum);
			}
			rst = new ArrayList<>(tmp);
		}
		
		System.out.println((rst.get(0)*10 + rst.get(1))+"%");
		
		
		

	}// main

	 
	 
}// class
