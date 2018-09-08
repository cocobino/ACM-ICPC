import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
 
 
public class Solution {
		
	static int n,m,max=0;
	static int map[];
	static boolean visit[];
	
	static int dx[] = {0,1,0,-1, 1,1,-1,-1};
	static int dy[] = {1,0,-1,0,-1,1, 1,-1};
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int test_case = Integer.parseInt(br.readLine());
    	
    	for(int T=1; T<=test_case; T++) {
    		boolean flag = false;
    	//S, D, H, C
    	int card[] = new int[4];
    	for(int i=0; i<4; i++)card[i]=13;
    	
    	//solve
    	String in =" "+br.readLine();
    	// 중복방지
    	LinkedList<String> duple = new LinkedList<>();
 
    	for(int i=1; i<in.length();i =i+3) {
    		String tmp =in.substring(i, i+3);
    		
    		//중복 체크
    		for(int j=0; j<duple.size(); j++) {
    			if(tmp.equals(duple.get(j))) {
    				bw.write(String.valueOf("#"+T+" "+"ERROR"+"\n"));
    				bw.flush();
    				flag =true;
    				break;
    			}
    		}
    		if(flag) {
    			break;
    			
    		}
    		duple.add(tmp);
    		
    		switch(tmp.charAt(0)) {
    		case 'S':
    		card[0]--;
    		break;
    		case 'D':
        		card[1]--;
        		break;
    		case 'H':
        		card[2]--;
        		break;
    		case 'C':
        		card[3]--;
        		break;
    		}
    		
    		
    	}
    	if(flag) {
    		flag =false;
			continue;
			
		}
    	bw.write(String.valueOf("#"+T+" "));
    	for(int i=0; i<4; i++)bw.write(String.valueOf(card[i]+" "));
    	bw.write(String.valueOf("\n"));
    	
    	bw.flush();
    		
    		}//test-case
    	}//main func

	
 	}//class

	 
