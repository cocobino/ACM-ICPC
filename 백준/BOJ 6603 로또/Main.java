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
import java.util.Stack;
import java.util.StringTokenizer;

import javax.swing.plaf.synth.SynthSpinnerUI;


public class Main {
	static int N;
	static int arr[], result[];
	static boolean visit[];
	//static int cnt=1,ans=1;
	//static int dx[] = {1,-1,0,0};
	//static int dy[] = {0,0,-1,1};

	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        for(;;) {
        StringTokenizer st = new StringTokenizer(br.readLine());	
         
        N = Integer.parseInt(st.nextToken());
        if(N==0)break;
        arr = new int[N];
        result = new int[N];
        	
        for(int i=0; i<N; i++) {
        	arr[i] = Integer.parseInt(st.nextToken());
        }
        
        dfs(0,0);
        System.out.println();
        
        }
        
        
	}

	private static void dfs(int start, int depth) {
		// TODO Auto-generated method stub
		if(depth ==6)print();
		
		for(int i=start; i<N; i++) {
			result[i]=1;
			dfs(i+1,depth+1);
			result[i]=0;
		}
	}

	private static void print() {
		// TODO Auto-generated method stub
		for(int i=0; i<N; i++) {
			if(result[i]==1)System.out.print(arr[i]+" ");
		}
		System.out.println();
	}	
}
