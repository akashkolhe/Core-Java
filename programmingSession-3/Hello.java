import java.util.ArrayList;
import java.util.TreeSet;
import java.util.Scanner;
public class Hello {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
		System.out.println("Enter string:-");
		String str=s.next();
		charOccurrence(str);
	}
    
	public static void charOccurrence(String s) {
		char[] st=s.toCharArray();
        // String[] res=new String[st.length];
        TreeSet res=new TreeSet<>();
        for(int i=0;i<st.length;i++){
                int l=0;
            for(int j=0;j<st.length;j++){
                if (st[i]==st[j]) {
                    l++;
                }
            }
            res.add(st[i]+" = "+l);
            // System.out.println(st[i]+" = "+l);
        }
        System.out.println(res);
	}
 
}
