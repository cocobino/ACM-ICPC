import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String args[]) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	
    	
    	
    	
    	for(;;) {
    		String input = br.readLine(); //전체 문자열
    	
    		 if(input.equals("."))break;

    			  
    		
    		int[] ans = getPi(input);
    		int len = ans.length-1;
    		
    		if(ans[len]==0) {
    			System.out.println("1");
    		}
    		else
    		{
    			System.out.println(input.length() / (input.length()-ans[len]));
    		}
    		
    	}

      	}
    



public static int[] getPi(String pattern) {

		int m = pattern.length();
		int j = 0;
		char[] p = new char[m];
		int[] pi = new int[m];
	
		p = pattern.toCharArray();
	
		for (int i = 1; i < m; i++) {
			while (j > 0 && p[i] != p[j]) {
				j = pi[j - 1];
			}
	
			if (p[i] == p[j]) {
				pi[i] = ++j;
			}
		}
		return pi;
		}
	}