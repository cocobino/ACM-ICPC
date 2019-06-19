import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
 
	static int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());
		 ArrayList<Integer> arr = new ArrayList<>();
		 
		 for(int i=0; i<n; i++) {
			 arr.add(Integer.parseInt(br.readLine()));
		 }
		 Collections.sort(arr);
		 for(int i=0; i<n; i++) {
			 System.out.println(arr.get(i));
		 }
	}// main
 
}// class
 