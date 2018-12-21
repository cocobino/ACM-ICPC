import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	
	
	public static void main(String[] args) throws IOException {
	// TODO Auto-generated method stub
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		Set<String> set1 = new HashSet<String>();
		Set<String> rst = new HashSet<String>();
		
		String set2[] = new String[m];
		
		for(int i=0; i<n; i++) {
			String tmp = br.readLine();
			set1.add(tmp);
		}
		
		for(int i=0; i<m; i++) {
			String tmp = br.readLine();
			set2[i]=tmp;
		}
		//insert
		
		
		for(int i=0; i<m; i++) {
			if(set1.contains(set2[i])==true)
			rst.add(set2[i]);
		}
		String tmp[] = rst.toArray(new String[rst.size()]);
		Arrays.sort(tmp);
		
		bw.write(String.valueOf(tmp.length+"\n"));
		for(int i=0; i<tmp.length; i++)	{
			bw.write(String.valueOf(tmp[i]+"\n"));
		}
		
		bw.flush();
		
	}//main
 
}//class
 
