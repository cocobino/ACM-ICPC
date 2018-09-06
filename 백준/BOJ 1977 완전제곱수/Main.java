import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;


public class Main{
		
		
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
			int i;
		 for( i=0;i*i<a;++i);
		    int ans=0;
		    for(int j=i;j*j<=b;++j){
		        ans+=j*j;
		}
		    
		    if(ans !=0) {
		bw.write(String.valueOf(ans)+"\n");
		bw.write(String.valueOf(i*i));
		    }
		    else {
				bw.write(String.valueOf(-1));
		    }
		bw.flush();
		
		
	}

}
