import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
 
public class Main {


    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int n =Integer.parseInt(br.readLine());
   		
   		
   	
   		char [][] file = new char[n][80];
   		int length =0;
   		
   		for(int i=0; i<n; i++) {
   			String a = br.readLine();
   			length = a.length();
   			file[i] = a.toCharArray();
   		}
   		
   		char [] rst  =file[0];
   		
   		for(int i=0; i<length; i++) {
   			for(int j=0; j<n; j++) {
   				if(rst[i] == file[j][i])
   				continue;
   				else rst[i] = '?';
   					
   			}
   		}
   		
   		for(int i=0; i<length; i++) {
   			bw.write(String.valueOf(rst[i]));
   			bw.flush();
   		}
   		
    		
	
}
}

	
