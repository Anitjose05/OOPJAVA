package javalab;
import java.util.*; 
public class StringToken {
	public static void main (String args []) {
		int n,sum=0;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the integer with one space gap:");
		String s=sc.nextLine ();
		StringTokenizer st=new StringTokenizer (s);
		while (st.hasMoreTokens ()) {
			String a=st.nextToken();
			n=Integer.parseInt (a);
			System.out.println (n);
			sum+=n;		
		}
		System.out.println ("Sum of integers="+sum);
		sc.close ();
	}
}
