import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	 
	static int dx[] = {-1,1,0,0}; //╩С, го , аб , ©Л
	static int dy[] = {0,0,-1,1};
	 
 

	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
	 for(;;) {
		 String a = br.readLine();
		 if(a.equals("0"))break;
		 int mid = a.length()/2;
		 
	 
			 String tmp ="";
			 String tmp2 ="";
			 if(a.length() %2 ==0) {
			 for(int i=0; i<mid; i++) {
				 tmp+=a.charAt(i);
			 }
			 for(int i=a.length()-1; i>=mid; i--) {
				 tmp2+=a.charAt(i);
			 }
			 
			 
			 if(tmp.equals(tmp2)) {
				 bw.write(String.valueOf("yes"));
				 bw.newLine();
				 bw.flush();
			 }
			 else {
				 bw.write(String.valueOf("no"));
				 bw.newLine();
				 bw.flush();
			 }
			 
			 }
			 
			 else {
				 for(int i=0; i<mid; i++) {
					 tmp+=a.charAt(i);
				 }
				 for(int i=a.length()-1; i>mid; i--) {
					 tmp2+=a.charAt(i);
				 }
				 
				 
				 if(tmp.equals(tmp2)) {
					 bw.write(String.valueOf("yes"));
					 bw.newLine();
					 bw.flush();
				 }
				 else {
					 bw.write(String.valueOf("no"));
					 bw.newLine();
					 bw.flush();
				 }
				 
				 
			 }
		 }
	 
		
		
	}//main
 
 
}//class
    