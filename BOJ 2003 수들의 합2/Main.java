import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;
 
 
public class Main {
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int n = Integer.parseInt(st.nextToken());
    	int m = Integer.parseInt(st.nextToken());
    	
    	ArrayList<Integer> list = new ArrayList<>();
    	st = new StringTokenizer(br.readLine());
    	for(int i=0; i<n; i++) {
    		list.add(Integer.parseInt(st.nextToken()));
    	} //insert
    	
    	int rst=0;
    	int sum=0;
    	 //solution
     
    	int i=0,j=0;
    	for(;;) {
    		if(sum>=m) sum -=list.get(j++);
    		else if(i==n)break;
    		else sum += list.get(i++);
    		
    		if(sum ==m)rst++;
    	}
    	bw.write(String.valueOf(rst));
    	bw.flush();
	}//main
}