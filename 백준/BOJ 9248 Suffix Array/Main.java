import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {


	  public static int[] suffixArray(CharSequence S) {
	    int n = S.length(); //�Է°� ��������
	    Integer[] order = new Integer[n];
	    for (int i = 0; i < n; i++)
	      order[i] = n - 1 - i; // �ε��� �ּҰ� �� �����������


	    Arrays.sort(order, (a, b) -> Character.compare(S.charAt(a), S.charAt(b)));

	    int[] sa = new int[n]; // Suffix Array �ε��� �ּҸ� ���� ����
	    int[] classes = new int[n]; 
	    for (int i = 0; i < n; i++) {
	      sa[i] = order[i];
	      classes[i] = S.charAt(i);  // �̰��� ���ڿ��� �ƽ�Ű������ ����
	    }
	    

	    for (int len = 1; len < n; len *= 2) { //d ���� 2�� �÷����鼭 sa �迭�� �ϼ���ŵ�ϴ�.
	      int[] c = classes.clone();
	      for (int i = 0; i < n; i++) {
	    
	        classes[sa[i]] = i > 0 && c[sa[i - 1]] 
	        		== c[sa[i]] && sa[i - 1] + len < n && c[sa[i - 1] + len / 2]
	        		== c[sa[i] + len / 2] ? classes[sa[i - 1]] : i;
	      }
	    
	      int[] cnt = new int[n]; // �ε����� 0~ ������� ä���ݴϴ�
	      for (int i = 0; i < n; i++)
	        cnt[i] = i;
	      int[] s = sa.clone();
	      for (int i = 0; i < n; i++) {
	    
	        int s1 = s[i] - len;
	    
	        if (s1 >= 0)
	          sa[cnt[classes[s1]]++] = s1;
	      }
	    }
	    return sa;
	  }

	  // 
	  public static int[] rotationArray(CharSequence S) {
	    int n = S.length();
	    Integer[] order = new Integer[n];
	    for (int i = 0; i < n; i++)
	      order[i] = i;
	    Arrays.sort(order, (a, b) -> Character.compare(S.charAt(a), S.charAt(b)));
	    int[] sa = new int[n];
	    int[] classes = new int[n];
	    for (int i = 0; i < n; i++) {
	      sa[i] = order[i];
	      classes[i] = S.charAt(i);
	    }
	    for (int len = 1; len < n; len *= 2) {
	      int[] c = classes.clone();
	      for (int i = 0; i < n; i++)
	        classes[sa[i]] = i > 0 && c[sa[i - 1]] == c[sa[i]] && c[(sa[i - 1] + len / 2) % n] == c[(sa[i] + len / 2) % n] ? classes[sa[i - 1]] : i;
	      int[] cnt = new int[n];
	      for (int i = 0; i < n; i++)
	        cnt[i] = i;
	      int[] s = sa.clone();
	      for (int i = 0; i < n; i++) {
	        int s1 = (s[i] - len + n) % n;
	        sa[cnt[classes[s1]]++] = s1;
	      }
	    }
	    return sa;
	  }


	  public static int[] lcp(int[] sa, CharSequence s) {
	    int n = sa.length; // ���ڿ� ���̼���
	    int[] rank = new int[n];
	    for (int i = 0; i < n; i++)
	      rank[sa[i]] = i; // ��ġ������ 
	    int[] lcp = new int[n - 1];
	    for (int i = 0, h = 0; i < n; i++) {
	      if (rank[i] < n - 1) {
	        for (int j = sa[rank[i] + 1]; Math.max(i, j) + h < s.length() && s.charAt(i + h) == s.charAt(j + h); ++h)
	          ;
	        lcp[rank[i]] = h;
	        if (h > 0)
	          --h;
	      }
	    }
	    
	    return lcp;
	    
	  }


	  public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 
		  String s1 = br.readLine();
	    int[] sa1 = suffixArray(s1);


	    for (int p=0; p<sa1.length; p++) {
	    	  System.out.print(sa1[p]+1+" ");
	    }
	    
	    System.out.print("\n"+"x ");
	    
	    int inttemp = s1.length();
	    int temp[] = new int[s1.length()];
	    		temp = lcp(sa1, s1);
	    		
	    for(int i=0; i<s1.length()-1; i++) {
		    System.out.print(temp[i]+" ");	
		   
	    
	  }
	}
}