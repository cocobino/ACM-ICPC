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
        
        int n = Integer.parseInt(br.readLine());
        
        String a = br.readLine();
        
        int wgt =0;
        int cnt =0;
        for(int i=0; i<a.length(); i++) {
        if(a.charAt(i) == 'O') {
        	cnt+=(i+1+wgt);
        	wgt++;
        }
        else {
        	wgt=0;
        	}
        }
        
        System.out.println(cnt);
    }// main
 
     

}// class
  
 