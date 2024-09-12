package javalab;

import java.util.Scanner;
public class FrequencyOfString {
	public static void main (String [] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a string to check the frequency ");
		String str= sc.nextLine();
		System.out.println("Enter the Character to be checked");
		char ch=sc.nextLine().charAt(0);
		int count=0;
		for (int i=0;i<str.length();i++) {
			if (str.charAt(i)==ch) {
				count++;
			}
			}
		System.out.println("Frequency of character "+ch+" in the string is:"+count);
	}
}
		


