package javalab;
import java.util.*;
import java.io.*;
public class FileReadernWriter {
	public static void main (String args [])  {
		try	{
			Scanner sc=new Scanner (System.in);
			File ob=new File ("Register1.txt");
			ob.createNewFile ();
			System.out.println ("Register1.txt is created\n");
			FileWriter fout=new FileWriter ("Register1.txt");
			System.out.println("Enter KEAM rank number:");
			int n=sc.nextInt ();
			fout.write (n+"\n");
			fout.close ();
			System.out.println("Data added");
			FileReader fin = new FileReader ("Register1.txt");
			BufferedReader br=new BufferedReader (fin);
		    String line;
		    System.out.println ("\ncontent in Register1.txt is:");	
		    while ((line=br.readLine())!=null)	{
		    	System.out.println(line);
		    }
		    br.close ();
		}
		catch (IOException e)	{
			System.out.println ("Exception occured:"+e.getMessage());
		}
	}
}
