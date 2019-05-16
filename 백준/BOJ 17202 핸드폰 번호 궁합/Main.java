import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static int dx[] = { 0, 0, -1, 1 };
	static int dy[] = { 1, -1, 0, 0 };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		String a = br.readLine();
		String b = br.readLine();
		
		ArrayList<Integer> s = new ArrayList<>();
		
		for(int i=0; i<a.length(); i++) {
			s.add(a.charAt(i)-'0');
			s.add(b.charAt(i)-'0');
		}
		
		
		
		ArrayList<Integer> tmp;
		while(true) {
			tmp  = new ArrayList<>();
			for(int i=0; i<s.size()-1; i++) {
				int n = (s.get(i))+(s.get(i+1));
				if(n>=10)n-=10;
				
				tmp.add(n);
			}
			if(tmp.size()==2) {
				break;
			}
			else {
				s.clear();
				s = new ArrayList<>(tmp);
			}
			
		}//while loop
	 
		System.out.print(tmp.get(0));
		System.out.print(tmp.get(1));
		
	}
 
}
 