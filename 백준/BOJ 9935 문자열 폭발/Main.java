import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	
	static StringTokenizer st;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		//st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		String target = br.readLine();
		String bomb = br.readLine();
		Stack<Character> stack = new Stack<>();
		ArrayList<Character> list =new ArrayList<>();
		
		int len = bomb.length();
		
		for(int i=0; i<target.length(); i++) {
			char cur = target.charAt(i);
			stack.push(cur);
			
			if(cur == bomb.charAt(len-1)) {
				for(int j=len-1; j>=0; j--) {
					if(stack.isEmpty() || bomb.charAt(j) != stack.peek()) {
						for(int k=list.size()-1; k>=0; k--) {
							stack.push(list.remove(k));
						}
						break;
					}
					else list.add(stack.pop());
				}
				list.clear();
 			}
		}
		if(stack.size() ==0) {
			System.out.println("FRULA");
		}else {
			while(!stack.isEmpty()) {
				list.add(stack.pop());
			}
			for(int i=list.size()-1; i>=0; i--) {
				sb.append(list.get(i));
			}
			System.out.println(sb.toString());
		}
	}
}