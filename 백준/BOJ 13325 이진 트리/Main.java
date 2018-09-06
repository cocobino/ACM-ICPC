import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
			
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		 
		int i,lv = Integer.parseInt(br.readLine()), size=1<<(lv+1);
		int tree[] = new int[size];
		int path[] = new int[size];
		int sum[] =  new int[size];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int z=2;z<size; z++) {
			tree[z] = Integer.parseInt(st.nextToken());
		}
		
		int left,right;
		for(i=1<<lv;--i>0;) {
			left = i<<1; right = left+1;
			path[i] = Math.max(path[left]+tree[left], path[right]+tree[right]);
			sum[i] = sum[left]+sum[right]+(path[i]-path[left])+(path[i]-path[right]);
		}
		bw.write(String.valueOf(sum[1]));
		bw.flush();
		
}
	
}