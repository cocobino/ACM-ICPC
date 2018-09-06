import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
		
 		static boolean btn[];
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int cur =100; //현재 채널위치
		
		int n = Integer.parseInt(br.readLine()); //이동하려는 채널
		
		int a = Integer.parseInt(br.readLine()); //고장난 버튼개수
		 btn= new boolean[10];
		//고장난버튼은 -1 표시
		StringTokenizer st = new StringTokenizer(br.readLine()); 
		for(int i=0; i<a; i++)btn[Integer.parseInt(st.nextToken())]=true;
		
		int ans = n-100;
		if(ans<0)ans=-ans;
		
		for(int i=0; i<=1000000; i++) {
			int c = i;
			int len = canMove(c);
			
			if(len>0) {
				int press = c-n;
				if(press<0) {
					press=-press;
				}
				if(ans > len +press) {
					ans = len+press;
				}
			}
			
		}
		
		bw.write(String.valueOf(ans));
		bw.flush();
		
		
	}

	private static int canMove(int c) {
		// TODO Auto-generated method stub
		int lenth =0;
		if(c==0)return btn[0] ? 0:1;
		while(c>0) {
			if(btn[c%10]) {
				return 0;
			}
			lenth +=1;
			c /=10;
		}
		return lenth;
	}
  }
