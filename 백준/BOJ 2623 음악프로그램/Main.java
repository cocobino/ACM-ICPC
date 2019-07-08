import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

 
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        StringTokenizer st;
        	
       
       int n = sc.nextInt();
       int m = sc.nextInt();
       
       int link[][] = new int[n+1][n+1];
       int degree[] = new int[n+1];
       LinkedList<Integer> tree[] = new LinkedList[n+1];
       for(int i=0; i<=n; i++)tree[i] = new LinkedList<>();
       StringBuilder sb = new StringBuilder();
       for(int i=0; i<m; i++) {
    	
    	   int size = sc.nextInt();
    	   int from = sc.nextInt();
    	   
    	   for(int j=1; j<size; j++) {
    		   int to = sc.nextInt();
    		   
    		   if(link[from][to] ==0 ) {
    			   link[from][to]=1;
    			   tree[from].add(to);
    			   degree[to]++;
    		   }
    		   from = to;
    	   }
       }
       
       Queue<Integer> q = new LinkedList<>();
       for(int i=1; i<=n; i++) {
    	   if(degree[i]==0) {
    		   q.add(i);
    		   sb.append(i+"\n");
    	   }
       }
       
       if(q.isEmpty()) {
    	  System.out.println(0);
    	  return;
       }
       
       while(!q.isEmpty()) {
    	   int cur =q.poll();
    	   
    	   for( int to : tree[cur]) {
    		   if(--degree[to] ==0) {
    			   q.add(to);
    			   link[cur][to]=0;
    			   sb.append(to+"\n");
    		   }
    	   }
    	   
       }
       for(int i=1; i<=n; i++) {
    	   if(degree[i] !=0) {
    		   System.out.println(0);
    		   return;
    	   }
       }
       
       System.out.println(sb.toString());
       
    }// main
 
     

}// class
  
  