import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class Main {


	public static void main(String... args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	int in =Integer.parseInt(br.readLine());
	
	
	int cnt=0;
	int tmp = in;
	while(true) {
		int a = tmp/10;
		int b = tmp%10;
		
		if(a+b<10) {
			tmp = b*10 + a+b;
		}else {
			tmp = b*10 + (a+b)%10;
		}
		cnt++;
		if(tmp==in)break;
	}
	bw.write(String.valueOf(cnt));
	bw.flush();
/*for(;;) {
		
		tmp1 = (tmp%10)*10;
		cycle=0;
	while(tmp>0) {
		cycle += tmp%10;
		tmp/=10;
		if(tmp==0)cnt++;
	}tmp=(cycle%10)+tmp1;
	if(tmp==in)break;
	}*/
	}

		
}
