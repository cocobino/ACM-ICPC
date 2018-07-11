import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;
import java.util.StringTokenizer;


public class Main {

	public static void main(String... args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	 int page = Integer.parseInt(br.readLine());
	    int[] ans = new int[10];
	    int point = 1;
	    int start = 1;
	 
	    while (start <= page) {
	        // 끝자리 9로 만들기
	        while (page % 10 != 9 && start <= page) {
	            cal(page, ans, point);
	            page--;
	        }
	 
	        if (page < start) {
	            break;
	        }
	 
	        // 끝자리 0으로 만들기
	        while (start % 10 != 0 && start <= page) {
	            cal(start, ans, point);
	            start++;
	        }
	 
	        start /= 10;
	        page /= 10;
	 
	        for (int i = 0; i < 10; i++) {
	            ans[i] += (page - start + 1) * point;
	        }
	 
	        point *= 10;
	    }
	 
	    for (int i = 0; i < 10; i++) {
	        System.out.print(ans[i] + " ");
	    }
	 
	}
	 


	
	
	private static void cal(int n, int[] ans, int point) {
		// TODO Auto-generated method stub
		while(n>0) {
			ans[n%10] += point;
			n/=10;
		}
	}
}