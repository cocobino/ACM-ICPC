import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

class Main{
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> ar = new ArrayList<>();
		//StringTokenizer st = new StringTokenizer(br.readLine()); 
		int cnt =0;
		for(;;) {
			String a = br.readLine();
			
			if(a.length()>100 || cnt >100)break;
			
			ar.add(a);
			cnt++;
		}
		
		for(int i=0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		
		
		
	}
	
}