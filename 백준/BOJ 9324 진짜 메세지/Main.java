import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	 
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		int n= Integer.parseInt(br.readLine());
		for(int i=0; i<n; i++) {
			String a = br.readLine();
			boolean flag =false;
			
			int alpha[] = new int[26];
			char tmp;
			for(int j=0; j<a.length(); j++) {
				//해당 알파벳 cnt++
				alpha[a.charAt(j)-'A']++;
				
				//3번나오면
				if(alpha[a.charAt(j)-'A']==3) {
					//글자가 2번나와야함 
					//다음칸과 비교해야하는데 다음칸이 범위 벗어나면 오류
						if(j+1>=a.length()) {
							flag=true;
							break;
						}
						
						else {
							
							if(a.charAt(j)==a.charAt(j+1)) {
								j++;
								alpha[a.charAt(j)-'A']=0;
							}else {
								flag=true;
								break;
							}
						}
						
				}
				 
					 
			}
				
				
			
			if(flag)bw.write(String.valueOf("FAKE\n"));
			else bw.write(String.valueOf("OK\n"));
			bw.flush();
			
		}//for loop
		
	}//main
 
 
}// classg

    