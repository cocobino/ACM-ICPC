import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter; 
import java.util.StringTokenizer;

class Main {
    
   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
   static StringTokenizer st;
     
   
   
   public static void main(String[] args) throws IOException {	
	   
	    
	   for(int i=0; i<3; i++) {
		   st = new StringTokenizer(br.readLine());
		    int fromh = Integer.parseInt(st.nextToken());
		    int fromm = Integer.parseInt(st.nextToken());
		    int froms = Integer.parseInt(st.nextToken());
		    
		    int toh = Integer.parseInt(st.nextToken());
		    int tom = Integer.parseInt(st.nextToken());
		    int tos = Integer.parseInt(st.nextToken());
		    
		   //int rsth=0,rstm=0,rsts=0;

		    if(tos - froms <0) {
		    	tom -=1;
		    	tos= 60 + tos-froms;
		    }
		    else {
		    	tos = tos - froms;
		    }
		    if(tom - fromm <0 ) {
		    	toh -=1;
		    	tom = 60 + tom-fromm;
		    }
		    else {
		    	tom = tom - fromm;
		    }
		    toh = toh - fromh;
		    
		    bw.write(String.valueOf(toh+" "+ tom+" "+tos+"\n"));
		    bw.flush();
		    
		   
	   }
	    	  
	   }//main
   
   
    } //class
