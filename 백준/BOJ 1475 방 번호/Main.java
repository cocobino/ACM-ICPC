				import java.io.BufferedReader;
			import java.io.BufferedWriter;
			import java.io.IOException;
			import java.io.InputStreamReader;
			import java.io.OutputStreamWriter;
			import java.util.StringTokenizer;
			
			
			
			
			public class Main {
				
				
				
			    public static void main(String[] args) throws IOException {
			        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			        String n = br.readLine();
			        int[] number = new int[10];
			        int set = 1;
			        
			        for(int i=0; i<n.length(); i++) {
			            
			            if(n.charAt(i)-48 == 9 && number[9] == set && number[6] < set) {
			                
			                number[6] += 1;
			            }else if(n.charAt(i)-48 == 6 && number[6] == set && number[9] < set) {
			                number[9] += 1;
			            }else if(number[n.charAt(i)-48] == set) {
			                set++;
			                
			            }
			            
			            if(number[n.charAt(i)-48] < set) {
			                number[n.charAt(i)-48] += 1;
			                
			            }    
			        }
			        bw.write(String.valueOf(set));
			        bw.flush();
			        
			        
			        
				}
			    
			}
			