import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	
	static char map[][] = new char[111][111];
	static int s;
	static char walk[] = new char[51];
	static int x,y,tx,ty,i,j,sx,sy,ex,ey,t;
	
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		s = Integer.parseInt(br.readLine());
		y=55; x=55;
		tx=0; ty=1;
		
		for(i=0; i<51; i++) {
			map[y][x]='.';
			if(walk[i]=='F') {
				x+=tx;
				y+=ty;
			}
			 else if(walk[i]=='R')
			    {
			      t=tx;
			      tx=-ty;
			      ty=t;
			    }
			    else if(walk[i]=='L')
			    {
			      t=tx;
			      tx=ty;
			      ty=-t;
			    }
			  }
		map[y][x]='.';
		 for(i=0;i<111;i++)
		  {
		    t=0;
		    for(j=0;j<111;j++)
		    {
		      t+=!!map[i][j];
		    }
		    if(!t)sy++;
		    else break;
		  }
		  for(i=0;i<111;i++)
		  {
		    t=0;
		    for(j=0;j<111;j++)
		    {
		      t+=!!map[j][i];
		    }
		    if(!t)sx++;
		    else break;
		  }
		  for(ey=i=110;i>=0;i--)
		  {
		    t=0;
		    for(j=0;j<111;j++)
		    {
		      t+=!!map[i][j];
		    }
		    if(!t)ey--;
		    else break;
		  }
		  for(ex=i=110;i>=0;i--)
		  {
		    t=0;
		    for(j=0;j<111;j++)
		    {
		      t+=!!map[j][i];
		    }
		    if(!t)ex--;
		    else break;
		  }
	}
 }
