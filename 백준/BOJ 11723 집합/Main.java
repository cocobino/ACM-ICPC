import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

 
public class Main {
 
    // left, up, right, down
    static int[] dx = {0, -1, 0, 1};
    static int[] dy = {-1, 0, 1, 0};
 
     
    
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int bit=0;
    	int test = Integer.parseInt(br.readLine());
    	boolean arr[] = new boolean[21];
    	String cmd;
		int num=0;
    	for(int i=0; i<test; i++) {
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		
    		cmd = st.nextToken();
    		if(st.hasMoreTokens())num=Integer.parseInt(st.nextToken());
    		
    		switch(cmd) {
    		case "add":
    			bit |= 1 << num;
    			break;
    		case "remove":
    			bit &= ~(1 << num);
    			break;
    		case "check":
    			 bw.write(String.valueOf(((bit & (1 <<num)) >> num) +"\n" ));
    			break;
    		case "toggle":
    			bit ^=(1<<num); 
    			break;
    			
    		case "all":
    		bit |=(1<<21)-1;
    		break;
    		
    		case "empty":
    		bit =0;
    		break;
    			
    		}
    	}//test_case
    	bw.flush();
    }//main
}


class Node{
	int x,y;
	public Node(int x, int y) {
		// TODO Auto-generated constructor stub
		this.x=x;
		this.y=y;
	}
}