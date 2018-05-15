import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;
import java.util.Vector;

public class Main {
	

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Vector<Integer> vc = new Vector<>();
		int[] people = new int[9];
		
		int cnt=0;
		int index1=0, index2=0;
		
		
		for(int i=0; i<9;i++) {
		people[i] = Integer.parseInt(br.readLine());
		cnt += people[i];
		}
		
		
		for(int i=0;i<9;i++) {
			
			for(int j=0; j<9; j++) {
				if(i==j)continue;
				if(cnt-people[i]-people[j]==100) {
					 index1 =i;
					 index2 = j;
					break;
				}
			}
		}
		Arrays.sort(people);
		for(int i=0; i<9; i++) {
			if(i==index1 || i==index2) {
				continue;
			}
			vc.add(people[i]);
			
		}
		Arrays.sort(people);
		
		for(int r : vc) {
			System.out.println(r);
		}

	
		}
}

