import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
 
public class Main {
	
	
	public static void main(String[] args) throws IOException { 
				
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int[] num = new int[4];
		int cnt=0;
		
		for(int i=0;i<3;i++) {
			cnt =0;
			
			StringTokenizer st = new StringTokenizer(br.readLine());
		for(int j=0; j<4;j++) {
			
			cnt += Integer.parseInt(st.nextToken());	
			
		}
		switch(cnt) {
		
		case 0:
			System.out.println("D");
			break;
			
		case 1:
            System.out.println("C");
            break;

        case 2:
            System.out.println("B");
            break;

        case 3:
            System.out.println("A");
            break;

        case 4:
            System.out.println("E");
            break;
		}
		
		
		
		}
		
		

		
	}
}