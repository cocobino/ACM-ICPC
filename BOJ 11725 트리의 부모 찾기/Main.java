import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;


public class Main{
	
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int test_case = Integer.parseInt(br.readLine());
		
		int root[] = new int[test_case+1];
		root[1] =1; 
		
		Stack<int []> stack = new Stack<>();
		Stack<int []> stack2 = new Stack<>();
		
		for(int i=0; i<test_case -1; i++) {
			StringTokenizer st= new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			if(root[a] == 0 && root[b] ==0) {
				int [] arr = {a,b};
				stack.push(arr);
			} else if (root[a] !=0) root[b] =a;
			else root[a] =b;
			
		}
		
		 while (!stack.isEmpty() || !stack2.isEmpty()) {
	            while (!stack.isEmpty()) {
	                int[] arr = stack.pop();
	                int a = arr[0];
	                int b = arr[1];

	                if (root[a] == 0 && root[b] == 0) {
	                    arr[0] = a;
	                    arr[1] = b;
	                    stack2.push(arr);
	                } else if (root[a] != 0)
	                    root[b] = a;
	                else    //root[b] !=0
	                    root[a] = b;
	            }
	            while (!stack2.isEmpty()) {
	                int[] arr = stack2.pop();
	                int a = arr[0];
	                int b = arr[1];

	                if (root[a] == 0 && root[b] == 0) {
	                    arr[0] = a;
	                    arr[1] = b;
	                    stack.push(arr);
	                } else if (root[a] != 0)
	                    root[b] = a;
	                else    //root[b] !=0
	                    root[a] = b;
	            }
	        }
		for(int i=2; i<=test_case; i++) {
			bw.write(String.valueOf(root[i]+"\n"));
			bw.flush();
		}
		
		
	}

	}