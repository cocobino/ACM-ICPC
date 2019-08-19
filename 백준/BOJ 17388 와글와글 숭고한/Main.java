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
        	
       
        st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        
        int min = 1000000;
        
        min = Math.min(min, Math.min(s, Math.min(k, h)));
        
        if(s+k+h>=100)System.out.println("OK");
        else {
        	if(s==min)System.out.println("Soongsil");
        	else if(k==min)System.out.println("Korea");
        	else if(h==min)System.out.println("Hanyang");
        }
        
        
    }// main
 
     

}// class
  
