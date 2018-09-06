import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
		 
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int pointer =1; //현재 주사위 위치
		StringTokenizer st= new StringTokenizer(br.readLine());
		int N =Integer.parseInt(st.nextToken()); //n 개줄
		int M =Integer.parseInt(st.nextToken()); // 주사위 던짐
		
		int line[] = new int[1001];
		for(int i=1; i<=N; i++) {
			line[i]=Integer.parseInt(br.readLine());
		}
		int ans=0;
		for(int i=1; i<=M; i++) {
			int dice = Integer.parseInt(br.readLine());
			ans++; //주사위를 던진후 턴 계산
			pointer += dice; //주사위 위치만큼이동
			
			if(pointer>=N) {//N 칸을 넘으면 출력후 종료
				bw.write(String.valueOf(i));
				bw.flush();
				System.exit(0);
			}
			pointer += line[pointer]; // 해당 칸에서 1번 내용만큼 이동
			
			if(pointer>=N) {//N 칸을 넘으면 출력후 종료
				bw.write(String.valueOf(i));
				bw.flush();
				System.exit(0);
			}
			
			
			
			
			 
		}
		
		
	}
}