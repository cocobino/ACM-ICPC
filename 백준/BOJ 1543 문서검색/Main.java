import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;
import java.util.StringTokenizer;


public class Main {

	public static void main(String... args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	String a = br.readLine();
	String b = br.readLine();
	int cnt=0;
	for(;a.indexOf(b)>-1; cnt++) {
		int t = a.indexOf(b);
		int c = b.length();
		int x = a.length();
	a = a.substring(a.indexOf(b)+b.length(), a.length());
	}
	bw.write(String.valueOf(cnt));
	bw.flush();	
	}
}