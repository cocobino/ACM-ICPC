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
	         
	        for(n=1;;n++){  // �Է°��� ��ġ�� ���� ã�´�
	          min = n*(n+1)/2-n;
	          max = n*(n+1)/2;
	          if((min < find) && (find <= max))
	            break;  // �Է°��� ��ġ�� ��(n)�� ã�Ҵ�
	        }
	         
	        if(n%2==1){ // ���� Ȧ�� �� ��
	          int u = 1;  // b u n j a
	          int d = n;  // b u n m o
	          while(true){
	            if(max==find){ // �Է°��� ã�Ҵ�
	              System.out.println(u +"/"+d);
	              break;
	            }
	            else{ // ã�� ���ϸ� �ִ밪�� ����, ���ڴ� ����, �и�� ����
	              max--;
	              u++;
	              d--;
	            }
	          }
	        }
	        else{ // ���� ¦�� �� ��
	          int u = n;
	          int d = 1;
	          while(true){
	            if(max==find){
	              System.out.println(u +"/"+d);
	              break;
	            }
	            else{ // ã�� ���ϸ� �ִ밪�� ����, ���ڴ� ����, �и�� ����
	              max--;
	              u--;
	              d++;
	            }
	          }
	        }
	      }
	    }


	    
	
	    
	
