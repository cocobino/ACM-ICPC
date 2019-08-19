import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

class Main {

	
	public static void main(String[] args) throws IOException {
	 BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
	 StringTokenizer st;
	 
	int n = Integer.parseInt(br.readLine());
	
	int arr [] = new int [1000001];
	int cnt[] = new int[1000001];
	int rst[] = new int[1000001];
	st = new StringTokenizer(br.readLine());
	for(int i=1; i<=n; i++) {
		arr[i] = Integer.parseInt(st.nextToken());
		cnt[arr[i]]++;
		rst[i] =-1;
	}//insert
 
	Stack<Node> stack = new Stack<>();
	
	for(int i=1; i<=n; i++	) {
		while(!stack.isEmpty() && cnt[arr[i]] > cnt[stack.peek().a]) {
			rst[stack.peek().b] = arr[i];
			stack.pop();
		}
		
		stack.push(new Node(arr[i], i));
	}
	
	for(int i=1; i<=n; i++) { 
		System.out.print(rst[i]+" ");
	}
	
	
	}//main
 

}// class

class Node{
	int a,b;

	public Node(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	
}