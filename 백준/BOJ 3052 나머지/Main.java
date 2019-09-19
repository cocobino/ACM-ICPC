import java.awt.List;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	 
	
	
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int num[] = new int[1001];
        for(int i=0; i<10; i++) {
        	num[Integer.parseInt(br.readLine())%42]++;        	
        }
        int rst=0;
        for(int i=0; i<1001; i++) {

        	if(num[i]>0) {
//        		System.out.println(num[i]);
        		rst++;
        	}
        }
        System.out.println(rst);
    }// main
	 
     
}// class
   