package javalab;
import java.util.Scanner;
interface  Human {
	final int jobid=2252;
	void  learn (String str);
	void work ();	
}
interface Recruitment {
	void screening (int score);
}
class Programmer implements Human,Recruitment {
	public void learn (String str) {
		System.out.println ("My Training Area is "+str);
	}
	public void screening (int score) {
		System.out.println ("Test Score :"+score);
	}
	public void work () {
		System.out.println ("Selected to the Role Development");
	}
}
public class Interface {
	public static void main (String args []) {
		Programmer trainee = new Programmer ();
		Scanner sc=new Scanner (System.in);
		System.out.println ("Enter your training area :");
		String str = sc.nextLine ();
		System.out.println ("Enter your Test Score :");
		int score = sc.nextInt ();
		System.out.println("_____ABOUT_MY_PLACEMENT_____");
		trainee.learn(str);
		trainee.screening(score);
		trainee.work();
		System.out.println ("My Job ID :"+trainee.jobid);
	}
}
