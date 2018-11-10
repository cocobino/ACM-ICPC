import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;

class Main {
    
   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
   static Scanner sc = new Scanner(System.in);
   static StringTokenizer st;

    public static void main(String[] args) throws IOException {

    	for(;;) {
    		String a = br.readLine();
    		
    		if(a.equals("END"))break;
    		
    		for(int i = a.length()-1; i>=0; i--) {
    			bw.write(String.valueOf(a.charAt(i)));
    		}//for
    		
    		bw.write(String.valueOf("\n"));
    		bw.flush();
    		
    		}//loop
    	
    	} //main
		 
 	}//class