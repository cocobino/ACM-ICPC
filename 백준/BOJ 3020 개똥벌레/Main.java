import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	 
	
	static long min,max;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        StringTokenizer st;
        
        int b[];
        int t[];
        
        
        st = new StringTokenizer(br.readLine());
        int n= Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        
        b = new int[500002];
        t = new int[500002];
        
        for(int i=0; i<n; i++) {
        	if(i%2 ==0) {
        		b[Integer.parseInt(br.readLine())]++;
        	}
        	else {
        		t[Integer.parseInt(br.readLine())]++;
        	}
        }//insert
        
        int tb[] = new int[500002];
        int tt[] = new int[500002];
        int rst[] = new int[500002];
        
        for(int i=h; i>=1; i--) {
        	tb[i] = b[i] + tb[i+1];
        	tt[i] = t[i] + tt[i+1];
        }
        
        int min = Integer.MAX_VALUE;
        int cnt =1;
        for(int i=1; i<=h; i++) {
        	rst[i] = tb[i] + tt[h-i+1];
        	
        	if(rst[i] <= min) {
        		if(rst[i] == min)cnt++;
        		else cnt =1;
        		min = rst[i];
        	}
        }
        
        System.out.println(min +" "+ cnt);
        
    }// main
     
 
     

}// class
  
 