import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

class Main {
    
   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
   static StringTokenizer st;
   
   static char map[][];
   static int r,c;
   
   public static void main(String[] args) throws IOException {
	   st =new StringTokenizer(br.readLine());
	   r = Integer.parseInt(st.nextToken());
	   c = Integer.parseInt(st.nextToken());
	   
	   map = new char[r][c];
	   
	   for(int i=0; i<r; i++) {
		   String a = br.readLine();
		   for(int j=0; j<c; j++) {
			   map[i][j] = a.charAt(j);
		   }
	   }//insert
	   
	   ArrayList<String> arr = new ArrayList<>();
	   
	   for(int i=0; i<r; i++) {
		   String rtmp = "";
		   String ctmp = "";
		   for(int j=0; j<c; j++) {
			   
			
			 if(map[i][j] != '#') {
				 rtmp+=map[i][j];
			 }else {
				 if(rtmp.length()>=2) {
					   arr.add(rtmp);
				   }
				 rtmp="";
				 
			 }
			 if(j<r && i<c) {
			 if(map[j][i] != '#') {
				 ctmp += map[j][i];
			 }else {
				 if(ctmp.length()>=2) {
					   arr.add(ctmp);
				   }
				 ctmp="";
			 }
		}
		   }
		   if(rtmp.length()>=2) {
			   arr.add(rtmp);
		   }
		   if(ctmp.length()>=2) {
			   arr.add(ctmp);
		   }
	   }
	   
	   if(arr.size()>0) {
	   Collections.sort(arr);
	   String rst = arr.get(0);
	   
	   bw.write(String.valueOf(rst));
	   bw.flush();
	   }
	   
	   }//main
 
   
} //class
 