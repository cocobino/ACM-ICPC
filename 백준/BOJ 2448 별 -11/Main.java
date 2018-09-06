import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		String map[] = new String[n];
		map[0] = "  *  ";
		map[1] = " * * ";
		map[2] = "*****";
		
		for(int i=1; 3*(int)Math.pow(2, i)<=n; i++) {
			f(i,map);
		}
		for(int i=0; i<n; i++) {
			bw.write(String.valueOf(map[i] +"\n"));
		}
		
		bw.flush();
	}

	private static void f(int i, String[] map) {
		// TODO Auto-generated method stub
		int down = 3*(int)Math.pow(2, i);
		int mid = down/2;
		
		for(int j=mid; j<down; j++) {
			map[j] = map[j-mid]+" " + map[j-mid];
		}
		String empty = "";
		while(empty.length() < mid) {
			empty +="  ";
		}
		for(int j=0; j<mid; j++) {
			map[j] = empty +map[j] +empty;
		}
		
	}
}