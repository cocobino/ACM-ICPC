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
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	
	 
	 
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken()); // 하고싶은 운동 N 분 // 5
		int m = Integer.parseInt(st.nextToken()); // m 최소맥박 // 70
		int M = Integer.parseInt(st.nextToken()); // 최대 맥박// 120
		int T = Integer.parseInt(st.nextToken()); // 운동시 증가 // 25
		int R = Integer.parseInt(st.nextToken()); // 휴식시 감소  // 15
		
		int min =m;
		int ans=0;
		int total=0;
		if(M-m<T) {
			bw.write(String.valueOf(-1));
			bw.flush();
			System.exit(0);
		}
		while(true) {
			
			if(ans == N) {
				break;
			}
			//total++;
			if(m+T<=M) { //운동시
				ans++;
				m+=T;
				total+=1;
			}else if(m+T>T) { //최대 맥박수 넘어가면 휴식 시간
				total+=1;
				m-=R;
				if(m<min)m=min; // m 값 이하론 떨어지지 x
			}
			
			
		}
		
		bw.write(String.valueOf(total));
		bw.flush();
		
		
		
	}
}