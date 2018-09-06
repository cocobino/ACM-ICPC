import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(br.readLine());
		int []num = new int[8001];
		int sum=0;
		int min= 4000;
		int max= -4000;
		int tmp;
		
		for(int i=0; i<n; i++) {
			tmp = Integer.parseInt(br.readLine());
			sum += tmp;
			if(min>tmp)min = tmp;
			if(max<tmp)max = tmp;
			num[tmp+4000]++;
		}
		
		bw.write(String.valueOf(( (int) Math.round((double) sum / n)+"\n")));
		
		int mid=0;
		int acc=0;
		boolean cal = false;
		
		int mode =0;
		ArrayList<Integer> modeList = new ArrayList<>();
		int half = (n&1) == 1? n/2+1 : n/2;
		for(int i=0; i<=8000; i++) {
			if(mode<num[i]) {
				mode = num[i];
				modeList.clear();
				modeList.add(i);
			}else if(mode == num[i]) {
				modeList.add(i);
			}
			
			acc +=num[i];
			if(!cal && acc>=half) {
				mid =i-4000;
				cal =true;
			}
		}
		
		if(modeList.size()==1)mode = modeList.get(0)-4000;
		else mode = modeList.get(1) -4000;
		
		int range = max-min;
		
		bw.write(String.valueOf(mid+"\n"));
		bw.write(String.valueOf(mode+"\n"));
		bw.write(String.valueOf(range));
		bw.flush();
	}
}