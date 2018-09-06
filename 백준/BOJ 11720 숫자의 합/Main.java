import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class Main{
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int test_case = Integer.parseInt(br.readLine());
		
		int arr[] = new int[test_case];
		String a = br.readLine();
		
		int rst=0;
		for(int i=0; i<a.length(); i++) {
			rst += a.charAt(i)-'0';
		}
				bw.write(String.valueOf(rst));
				bw.flush();
		
	}
 }