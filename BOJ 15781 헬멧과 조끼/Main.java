import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int head = Integer.parseInt(st.nextToken());
		int body = Integer.parseInt(st.nextToken());
		
		int h[] = new int[head];
		int b[] = new int[body];
		int bmax=0, hmax =0;
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<h.length; i++) {
			h[i] = Integer.parseInt(st.nextToken());
		if(hmax<h[i])hmax=h[i];
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<b.length; i++) {
			b[i] = Integer.parseInt(st.nextToken());
			if(bmax<b[i])bmax=b[i];
		}
		
		int rst = hmax+bmax;
		bw.write(String.valueOf(rst));
		bw.flush();
    }
		
		
       
        
    }
