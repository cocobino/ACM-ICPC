import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;
import java.util.StringTokenizer;


public class Main {

		
	public static void main(String... args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	int n = Integer.parseInt(br.readLine());
	ArrayList<String> word = new ArrayList<>();
	ArrayList<String> wgt = new ArrayList<>();
	int num[] = new int[1001];
	int max=0;
	
	for(int i=0; i<n; i++) {
		String a = br.readLine();
		if(!word.contains(a)) {
			word.add(a);
		}
		int idx = word.indexOf(a);
		num[idx]++;
		
		if(max<num[idx]) {
			max=num[idx];
		}	
	}
	for(int i=0; i<n; i++) {
		if(num[i]==max)wgt.add(word.get(i));
	}
	Collections.sort(wgt);
	bw.write(String.valueOf(wgt.get(0)));
	bw.flush();
	
	}
}

		
