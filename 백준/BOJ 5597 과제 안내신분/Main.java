import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main2 {
	
		
	public static void main(String...args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 
		boolean chk[] = new boolean[31];
		
		for(int i=1; i<=28; i++) {
			int a = Integer.parseInt(br.readLine());
			chk[a]=true;
		}
		
		for(int i=1; i<=30; i++) {
			if(!chk[i])bw.write(String.valueOf(i+"\n"));
			}
		
		bw.flush();
	}
}
