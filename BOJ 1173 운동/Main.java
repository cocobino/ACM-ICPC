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
		
		int N = Integer.parseInt(st.nextToken()); // �ϰ���� � N �� // 5
		int m = Integer.parseInt(st.nextToken()); // m �ּҸƹ� // 70
		int M = Integer.parseInt(st.nextToken()); // �ִ� �ƹ�// 120
		int T = Integer.parseInt(st.nextToken()); // ��� ���� // 25
		int R = Integer.parseInt(st.nextToken()); // �޽Ľ� ����  // 15
		
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
			if(m+T<=M) { //���
				ans++;
				m+=T;
				total+=1;
			}else if(m+T>T) { //�ִ� �ƹڼ� �Ѿ�� �޽� �ð�
				total+=1;
				m-=R;
				if(m<min)m=min; // m �� ���Ϸ� �������� x
			}
			
			
		}
		
		bw.write(String.valueOf(total));
		bw.flush();
		
		
		
	}
}