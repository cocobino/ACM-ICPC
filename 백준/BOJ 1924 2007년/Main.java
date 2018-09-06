import java.io.BufferedReader;
	import java.io.BufferedWriter;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.io.OutputStreamWriter;
	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.LinkedList;
	import java.util.Queue;
	import java.util.StringTokenizer;
	
	
	
	
	public class Main {
		
		//static String arr[] = {"MON","TUE","WED","THU", "FRI", "SAT","SUN"};
				
	    public static void main(String[] args) throws IOException {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	        	
	        StringTokenizer st = new StringTokenizer(br.readLine());
	        int month = Integer.parseInt(st.nextToken());
	        int day = Integer.parseInt(st.nextToken());
	        
	        int cnt=0;
	        
	        int mon[] = {31, 28,  31,30, 31,30, 31,31, 30,31,30,31};
	        	
	        for(int i=0; i<month-1; i++) {
	        	cnt +=mon[i];
	        }
	        cnt +=day;
	        
	        switch(cnt % 7) {
	        case 0:
				System.out.println("SUN");
				break;
			case 1:
				System.out.println("MON");
				break;
			case 2:
				System.out.println("TUE");
				break;
			case 3:
				System.out.println("WED");
				break;
			case 4:
				System.out.println("THU");
				break;
			case 5:
				System.out.println("FRI");
				break;
			case 6:
				System.out.println("SAT");
				break;
			}
	        	
	        }
	        
		}
	
	