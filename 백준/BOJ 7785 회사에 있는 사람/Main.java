import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	
	
	public static void main(String[] args) throws IOException {
	// TODO Auto-generated method stub
		int N = Integer.parseInt(br.readLine());
        String[] stArr = new String[2];
        
        Set<String> set = new HashSet<>();
    
        for(int i=0; i<N; ++i){
            stArr=br.readLine().split(" ");
            
            if(stArr[1].equals("enter")){
                set.add(stArr[0]);
            }
            else set.remove(stArr[0]);
            }
    
        String[] arr = set.toArray(new String[set.size()]);
        Arrays.sort(arr);
    
        for(int i=arr.length-1; i>=0; --i){
            bw.write(arr[i]+"\n");
        } 
        
        bw.flush();
	}//main
 
}//class
 