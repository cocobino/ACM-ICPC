import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());	
        int input = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int arr[] = new int[input+1];
        
        for(int i=1; i<=input; i++) {
        	arr[i]= i;
        }
        
        
        int cnt=0;
        int i,j=0;
        for( i=2; i<=input; i++) {
        	
        	for(  j=1; j*i<=input; j++) {
        		if(arr[i*j]!=-1)cnt++;
        		if(cnt ==N)break;
        		arr[i*j]=-1;		
        	}
        	if(cnt ==N)break;
        }
        bw.write(String.valueOf(arr[i*j]));
        bw.flush();
}
}
