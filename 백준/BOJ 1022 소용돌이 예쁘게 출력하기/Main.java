import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main2 {
	
		static int max_unit=0;
	public static void main(String...args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 
		StringTokenizer st = new StringTokenizer(br.readLine());
		int x1 = Integer.parseInt(st.nextToken());
		int y1 = Integer.parseInt(st.nextToken());
		int x2 = Integer.parseInt(st.nextToken());
		int y2 = Integer.parseInt(st.nextToken());
		
		int max=0;
		
		if(Integer.parseInt(cal(x1,y1)) >Integer.parseInt(cal(x2,y2))) max = Integer.parseInt(cal(x1,y1));
		else max =Integer.parseInt(cal(x2,y2));
		
		while(true) {
			max/=10;
			max_unit++;
			if(max==0)break;
		}
		for(int i=x1; i<=x2; i++) {
			String oneL = cal(i,y1)+" ";
			for(int j=y1+1; j<=y2; j++) {
				oneL += cal(i,j)+" ";
			}
			bw.write(oneL);
			bw.newLine();
		}
		bw.flush();
		bw.close();
		br.close();
 }

	private static String cal(int x, int y) {
		// TODO Auto-generated method stub
		int max =0;
		if(Math.abs((int)x) > Math.abs((int)y)) max= Math.abs((int)x);
		else max = Math.abs((int)y);
		
		int max_code= max;
		max = 2*max+1;
		
		int n = max;
		max = (int)Math.pow((double)max, (double)2);
		
		int start = max;
		int res;
		
		
		if( x==max_code && y>-max_code){
		res = start-(max_code-y);
		}
		else if(y == -max_code && y<max_code) {
			start -=(n-1);
			res = start-(max_code-x);
		}
		else if(x ==-max_code && y<max_code) {
			start -=2*(n-1);
			res = start -(max_code+y);
		}
		else {
			start-=3*(n-1);
			res = start - (max_code+x);
		}
	int unit =0, temp=res;
	while(true) {
		temp /=10;
		unit++;
		if(temp ==0)break;
	}
	String res_st = Integer.toString(res);
	for(int i=0; i<max_unit-unit; i++) {
		res_st = " "+res_st;
	}
		
		
		return res_st;
	}

}
