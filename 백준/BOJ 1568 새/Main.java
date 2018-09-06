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
	int tmp = n;
	int cnt=0;
	for(int i=1; i<=n; i++) {
		
		if(tmp<i)i=1;
		tmp = tmp-i;
		
		cnt++;
		if(tmp==0)break;
	}
	bw.write(String.valueOf(cnt));
	bw.flush();
	
	
	}
}
