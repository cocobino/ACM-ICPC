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
        int cnt =-1;
        int rst =0;
        //sol
        while((cnt = a.indexOf("JOI", cnt+1))>=0) {
        rst++;	
        }
        System.out.println(rst);
        cnt=-1;
        rst=0;
        while((cnt = a.indexOf("IOI", cnt+1))>=0) {
            rst++;	
            }
        System.out.println(rst);
    }// main
	 
     
}// class
  
  