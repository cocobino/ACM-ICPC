import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
	
	static StringTokenizer st;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	static TreeSet set = new TreeSet();
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		String[] A = br.readLine().split(" ");
		String[] B = br.readLine().split(" ");
		
		for(int i=0; i<a; i++) {
			int el = Integer.parseInt(A[i]);
			if(!set.add(el)) set.remove(el);
		}
		
		for(int i=0; i<b; i++) {
			int el = Integer.parseInt(B[i]);
			if(!set.add(el)) set.remove(el);
		}

		System.out.println(set.size());
	}
}