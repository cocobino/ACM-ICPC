import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
	
	static StringTokenizer st;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		st =  new StringTokenizer(br.readLine());
		
		String n = st.nextToken();
		int k = Integer.parseInt(st.nextToken());
		boolean[] mod = new boolean[k];
		
		int cnt =0;
		String cur = n;
		while(true) {
			cnt++;
			long rst = Long.parseLong(cur) % k;
			if(rst ==0) {
				System.out.println(cnt);
				break;
			}else if(mod[(int)rst]) {
				System.out.println(-1);
				break;
			} else if(!mod[(int)rst]) {
				cur = Long.toString(rst)+n;
				mod[(int)rst] = true;
			}
			
		}
	}
}