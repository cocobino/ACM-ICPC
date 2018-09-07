import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
 
 
public class Solution {
		
	static char arr[];
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int test_case = Integer.parseInt(br.readLine());

    	for(int T=1; T<=test_case; T++) {
    	 
    		String a = br.readLine();
    		arr = new char[a.length()];
    		if(a.length()==1) {
    			arr[0] = a.charAt(0);
    			dia(arr[0]);
    		}else {
    			for(int i=0; i<arr.length; i++) {
    				arr[i] = a.charAt(i);
    			}
    			create(arr);
    			
    			
    		}
    		
    	}//test-case
    		
    	}//main func
	private static void create(char[] arr) {
		// TODO Auto-generated method stub
		System.out.print("..");
		for(int i=1; i<arr.length;i++)System.out.print("#...");
		System.out.println("#..");
		

		for(int i=0; i<arr.length*2; i++)System.out.print(".#");
		System.out.println(".");
		
		for(int i=0; i<arr.length; i++) {
			System.out.print("#."+arr[i]+".");
		}
		System.out.println("#");
		
		for(int i=0; i<arr.length*2; i++)System.out.print(".#");
		System.out.println(".");
		
		System.out.print("..");
		for(int i=1; i<arr.length;i++)System.out.print("#...");
		System.out.println("#..");
	}
	private static void dia(char arr) {
		// TODO Auto-generated method stub
		System.out.println("..#..");
		System.out.println(".#.#.");
		System.out.println("#."+arr+".#");
		System.out.println(".#.#.");
		System.out.println("..#..");
	}
 

	}//class

	 
