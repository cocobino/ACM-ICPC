import java.awt.Point;
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
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

class Main {
    
   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
   static Scanner sc = new Scanner(System.in);
   static StringTokenizer st;
     
   static int n,max = Integer.MIN_VALUE;
  
   
    public static void main(String[] args) throws IOException {
     n = Integer.parseInt(br.readLine());
     ArrayList<Integer> arr =new ArrayList<>();
     
     st = new StringTokenizer(br.readLine());
     for(int i=0; i<n; i++) {
    	 arr.add(Integer.parseInt(st.nextToken()));
     }//isnert
     
     for(int i=1; i<arr.size()-1; i++) {
    	 dfs(arr, i, 1);
    	 
     }
     
     bw.write(String.valueOf(max -1));
     bw.flush();
    	
   }

	private static void dfs(ArrayList<Integer> prev, int idx, int sum) {
		// TODO Auto-generated method stub
		 ArrayList<Integer> tmp =new ArrayList<>();
		 tmp = (ArrayList<Integer>) prev.clone();
		 

		sum += tmp.get(idx-1)*tmp.get(idx+1);
		tmp.remove(idx);
		for(int i=1; i<tmp.size()-1; i++) {
			dfs(tmp, i, sum);
		}
		
		if(tmp.size()==2) {
			max = Math.max(max, sum);
			return;
		}
	}//main 

 

}// class
   
	 