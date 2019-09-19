import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	 
	
	
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        Scanner sc = new Scanner(System.in);
        StringTokenizer st;
        
        double rst[] = new double[3];
        double max = -1;
//        System.out.println(max);
        for(int i=0; i<3; i++) {
        	st = new StringTokenizer(br.readLine());
        	double p = Double.parseDouble(st.nextToken()); //가격
        	double h = Double.parseDouble(st.nextToken()); //무게
        	
        	if(p*10 >=5000) {
        		rst[i] = (h*10)/(p*10-500);
        	}
        	else {
        		rst[i] = (h*10) /(p*10);
        	}
        	max = Math.max(max, rst[i]);
        }
//        System.out.println(Arrays.toString(rst));
        for(int i=0; i<3; i++) {
        	if(rst[i] == max) {
        		if(i==0) {
        			System.out.println("S");
        			break;
        		}
        		else if(i==1) {
        			System.out.println("N");
        			break;
        		}
        		else if(i==2) {
        			System.out.println("U");
        			break;
        		}
        	}
        	
        }
        
        
        
    }// main
	 
     
}// class
  
 