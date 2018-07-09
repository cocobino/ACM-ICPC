import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;


public class Main {

	
	public static void main(String... args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	Stack<Character> st = new Stack<Character>();
	
	String a = br.readLine();
	int sum=0;
	for(int i=0; i<a.length(); i++) {
		if(a.charAt(i)=='(')st.add(a.charAt(i));
		else {st.remove(st.size()-1);
		
		if(a.charAt(i-1)=='(') {
			sum += st.size();
		}else {
			sum +=1;
		}
		}
	}
		
	bw.write(String.valueOf(sum));
	bw.flush();
	}
}
