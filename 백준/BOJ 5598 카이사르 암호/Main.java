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
        
        String a = br.readLine();
     
        //sol
        for(int i=0; i<a.length(); i++) {
        	if(a.charAt(i)-'A'-3 >=0) {
        		System.out.print((char)(a.charAt(i)-3));
        	}else {
//        		System.out.println((int)a.charAt(i)-3);
        		System.out.print((char)(a.charAt(i)-3+26));
        	}
        }
        
    }// main
	 
     
}// class
  
 