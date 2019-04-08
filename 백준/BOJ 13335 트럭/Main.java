import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	 
		static int n,length,limitwgt;
		 
		static int dx[] = {0,0,-1,1};
		static int dy[] = {1,-1,0,0};
		 
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st =new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		length = Integer.parseInt(st.nextToken());
		limitwgt = Integer.parseInt(st.nextToken());
		
		Queue<Integer> q = new LinkedList<>();
	 
		int sum, count; sum = count = 0;
		st =new StringTokenizer(br.readLine());
		for(int i=0; i<n;i++) {
			int cur = Integer.parseInt(st.nextToken());
			

				while(true) {
					if(q.isEmpty()) {
						q.add(cur);
						count++;
						sum +=cur;
						break;
					}
					else if(q.size() == length) {
						sum -= q.poll();
					}
					else {
						if(sum +cur > limitwgt) {
							q.add(0);
							count++;
						}
						else {
							q.add(cur);
							count++;
							sum +=cur;
							break;
						}
					}
					
				}
		
		}
		System.out.println(count+length);
		
	}//main

	 
}//class
 
