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
		
		int K =Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		int total=0;
		for(int i=0; i<N; i++) {
		StringTokenizer st =new StringTokenizer(br.readLine());
		int time = Integer.parseInt(st.nextToken());
		String ans = st.nextToken();
		
		total +=time;
		if(total>=210)break;
		if(ans.equals("T"))K++;
		if(K>8)K%=8;
		}
		bw.write(String.valueOf(K));
		bw.flush();
		
		
	}
}