import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;
import java.util.Vector;

public class Main{
    public static void main(String[] agrs) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String a = br.readLine();
        char[] arr = a.toCharArray();
    
        int count = 0;
        
        for(int i=arr.length-1; i>=0; i--){
            for(int j=i; j<arr.length; j++){
                String temp1 = a.substring(i+1);
                String temp2 = a.substring(i, j+1);
                if(temp1.contains(temp2)){
                    continue;
                }else{
                    count++;    
                }
            }
        }
        System.out.println(count);
        br.close();
    }
}