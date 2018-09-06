import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;
 
 

public class Main {
		
	 //static ArrayList<Integer> arr[];
	 // static int N, M, S, E;

	
    public static void main(String[] args) throws IOException {
    	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	 
    	StringTokenizer st= new StringTokenizer(br.readLine());
    	
    	int arr[] = new int[3];
    	for(int i=0; i<3; i++) {
    		arr[i] = Integer.parseInt(st.nextToken());
    	}
    	Arrays.sort(arr);
    	
    	for(int i=0; i<3; i++) {
    		bw.write(String.valueOf( arr[i] + " "));
    	}
    	
    	bw.flush();
    	
    	
    	       }

    }



