	import java.io.BufferedReader;
	import java.io.BufferedWriter;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.io.OutputStreamWriter;
	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.LinkedList;
	import java.util.Queue;
	import java.util.Scanner;
	import java.util.StringTokenizer;
	
	
	
	public class Main {
	
		
	    public static void main(String[] args) throws IOException {
	   //     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	      //  BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	     
	        int find;   // position to find
	        int n;    // which line?
	        int min;  // minimum range
	        int max;  // maximum range
	        Scanner sc = new Scanner(System.in);
	     
	        find = sc.nextInt();
	         
	        for(n=1;;n++){  // 입력값이 위치한 줄을 찾는다
	          min = n*(n+1)/2-n;
	          max = n*(n+1)/2;
	          if((min < find) && (find <= max))
	            break;  // 입력값이 위치한 줄(n)을 찾았다
	        }
	         
	        if(n%2==1){ // 줄이 홀수 일 때
	          int u = 1;  // b u n j a
	          int d = n;  // b u n m o
	          while(true){
	            if(max==find){ // 입력값을 찾았다
	              System.out.println(u +"/"+d);
	              break;
	            }
	            else{ // 찾지 못하면 최대값을 감소, 분자는 증가, 분모는 감소
	              max--;
	              u++;
	              d--;
	            }
	          }
	        }
	        else{ // 줄이 짝수 일 때
	          int u = n;
	          int d = 1;
	          while(true){
	            if(max==find){
	              System.out.println(u +"/"+d);
	              break;
	            }
	            else{ // 찾지 못하면 최대값을 감소, 분자는 감소, 분모는 증가
	              max--;
	              u--;
	              d++;
	            }
	          }
	        }
	      }
	    }


	    
	
	    
	
