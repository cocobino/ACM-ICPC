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
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i=N; i>=4; i--) {
			if(check(i)){
				bw.write(String.valueOf(i));
				break;
			}
		}
		bw.flush();
		
	}

	private static boolean check(int curNum) {
		// TODO Auto-generated method stub
		String a =String.valueOf(curNum).trim();
		
		for(int i=0; i<a.length(); i++) {
		//	char c = a.charAt(i);
			if(a.charAt(i)-'0' !=4 && a.charAt(i)-'0' != 7)return false;
		}
		return true;
	}
}
		