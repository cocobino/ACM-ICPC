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
		
	 	
		int L = Integer.parseInt(br.readLine()); // 롤케이크 길이
		int role[] = new int[1001];
		
		int N = Integer.parseInt(br.readLine()); //방청객 수
		int	castMan[] = new int[1001]; //예측 사람
		int realMain[] = new int[1001]; // 실제 사람
		int mx=Integer.MIN_VALUE;
		int whomx= Integer.MIN_VALUE;
		int ans=0,ans_who=Integer.MIN_VALUE;
		for(int i=1; i<=N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			if(mx<b-a+1) {
				mx =b-a+1;
				whomx=i;
			}
			
			
			for(int j=a; j<=b; j++) {
				if(role[j]!=0)continue;
					role[j]=i;
					realMain[i]++;
			}
			if(ans<realMain[i]) {
				ans = realMain[i];
				ans_who=i;
			}
		}
		 bw.write(String.valueOf(whomx +"\n"+ans_who));
		
		 		bw.flush();
		
	}
}