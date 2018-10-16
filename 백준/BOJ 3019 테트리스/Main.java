import java.awt.Point;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

class Main {
    
   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
   static Scanner sc = new Scanner(System.in);
   static StringTokenizer st;
    
   static int c,p;
   static int block[];
   static int rst=0;
   
    public static void main(String[] args) throws IOException {
    st = new StringTokenizer(br.readLine());
    c = Integer.parseInt(st.nextToken()); // colum
    p = Integer.parseInt(st.nextToken()); // block number
    
    block = new int[c];
    
    st = new StringTokenizer(br.readLine());
    for(int i=0; i<c; i++) {
    	int n = Integer.parseInt(st.nextToken());
    	block[i]=n;
    }
    //insert
   
    
    switch(p) {
    // 4牒 1切
    case 1:
    	num_one();
    	break;
    case 2:
    	num_two();
    
    break;
    case 3:
    	num_three();
    break;
    case 4:
    	num_four();
    break;
    case 5:
    	num_five();
    	break;
    case 6:
    	num_six();
    	break;
    case 7:
    	num_seven();
    	break;
    }
    
    bw.write(String.valueOf(rst));
    bw.flush();
   }//main 

	private static void num_seven() {
		// TODO Auto-generated method stub
		//case 1 : l__
		for(int i=0; i<c-2; i++) {
			if(block[i] == block[i+1] && block[i+1]==block[i+2])rst++;
		}
		//case 2 : l^
		for(int i=0; i<c-1; i++) {
			if(block[i] == block[i+1]-2)rst++;
		}
		//case 3 : --l
		for(int i=0; i<c-2; i++) {
			if(block[i] == block[i+1] && block[i+1] == block[i+2]+1)rst++;
		}
		//case 4 : _1
		for(int i=0; i<c-1; i++) {
			if(block[i] == block[i+1])rst++;
		}
		
	}

	private static void num_six() {
		// TODO Auto-generated method stub
		//case 1 : __び
		for(int i=0; i<c-2; i++) {
			if(block[i] == block[i+1] && block[i+1]==block[i+2])rst++;
		}
		//case 2 : ^l
		for(int i=0; i<c-1; i++) {
			if(block[i]-2 == block[i+1])rst++;
		}
		//case 3:  い
		for(int i=0; i<c-1; i++) {
			if(block[i] == block[i+1])rst++;
		}
		//case 4: r--
		for(int i=0; i<c-2; i++) {
			if(block[i]+1 == block[i+1] && block[i+1]==block[i+2])rst++;
		}
	}

	private static void num_five() {
		// TODO Auto-generated method stub
		//case : で
		for(int i=0; i<c-2; i++) {
			if(block[i] == block[i+1] && block[i+1]==block[i+2])rst++;
		}
		//case : た
		for(int i=0; i<c-1; i++) {
			if(block[i]+1 == block[i+1])rst++;
		}
		//case : っ
		for(int i=0; i<c-1; i++) {
			if(block[i] == block[i+1]+1)rst++;
		}
		//case : ぬ
		for(int i=0; i<c-2; i++) {
			if(block[i]==block[i+1]+1 && block[i+1]+1 == block[i+2])rst++;
		}
	}

	private static void num_four() {
		// TODO Auto-generated method stub
		//case 1: ^I_
		for(int i=0; i<c-2; i++) {
			if(block[i]-1 == block[i+1] && block[i+1]==block[i+2])rst++;
		}

		//case 2: r
		for(int i=0; i<c-1; i++) {
			if(block[i]+1 == block[i+1])rst++;
		}

	}

	private static void num_three() {
		// TODO Auto-generated method stub
		//case 1: _r
		for(int i=0; i<c-2; i++) {
			if(block[i]==block[i+1] && block[i+1] == block[i+2]-1)rst++;
		}
		//case 2: いぁ
		for(int i=0; i<c-1; i++) {
			if(block[i] == block[i+1]+1)rst++;
		}
	}

	private static void num_two() {
		// TODO Auto-generated method stub
		for(int i=0; i<c-1; i++) {
			if(block[i] == block[i+1])rst++;
		}
	}

	private static void num_one() {
		// TODO Auto-generated method stub
		rst+=c;
		
		for(int i=0; i<c-3; i++) {
			if(block[i] == block[i+1] && block[i+1] == block[i+2] && block[i+2] ==block[i+3])rst++;
		}
	}

}// class
  