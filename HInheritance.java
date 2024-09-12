package javalab;
import java.util.Scanner;
class Employee{
	String Name;
	int Age;
	long Phoneno;
	String Address;
	double Salary;
	Employee(String name,int age,long phoneno,String address,double salary)
	{
		Name=name;
		Age=age;
		Phoneno=phoneno;
		Address=address;
		Salary=salary;
	}
	void printEmployee()
	{
	 System.out.println("Name:"+Name);
	 System.out.println("Age:"+Age);
	 System.out.println("Phone Number:"+Phoneno);
	 System.out.println("Address:"+Address);
	}
	void printSalary()
	{
		System.out.println("Salary:"+Salary);
	}
   }
	class Officer extends Employee
	{
		String specilization;
		Officer(String name1,int age1,long phoneno1,String address1,double salary1,String specilization1)
		{
			super(name1,age1,phoneno1,address1,salary1);
			specilization=specilization1;
		}
	void printspecilization ()
	{
		System.out.println("Specilization:"+specilization);
	}
   }
	class Manager extends Employee
	{
		String department;
		Manager(String name2,int age2,long phoneno2,String address2,double salary2,String department1)
		{
			super(name2,age2,phoneno2,address2,salary2);
			department=department1;
		}
		void printdepartment ()
		{
			System.out.println("Department:"+department);
		}
	}
   public class HInheritance {
	   public static void main(String args[]) {
		   Scanner Sc =new Scanner(System.in);
		   int age;
		   String name,address,specilization,department;
		   double salary;
		   long phoneno;
		   System.out.println("Entering details of Officer");
		   System.out.println("Enter Name:");
		   String Name=Sc.nextLine();
		   System.out.println("Enter Age:");
		   int Age=Sc.nextInt();
		   System.out.println("Enter Phone Number:");
		   long Phoneno=Sc.nextLong();
		   System.out.println("Enter Address");
		   String Address=Sc.next();
		   System.out.println("Enter Salary");
		   double Salary=Sc.nextDouble();
		   System.out.println("Enter Specilization");
		   String Specilization=Sc.next();
		   Officer of = new Officer (Name,Age,Phoneno,Address,Salary,Specilization);
		   System.out.println("Entering details of Manager");
		   System.out.println("Enter Name:");
		   String Name2=Sc.next();
		   System.out.println("Enter Age:");
		   int Age2=Sc.nextInt();
		   System.out.println("Enter Phone Number:");
		   long Phoneno2=Sc.nextLong();
		   System.out.println("Enter Address");
		   String Address2=Sc.next();
		   System.out.println("Enter Salary");
		   double Salary2=Sc.nextDouble();
		   System.out.println("Enter Department");
		   String Department=Sc.next();
		   Manager Mr = new Manager (Name2,Age2,Phoneno2,Address2,Salary2,Department);
		   
		   
		   System.out.println("DETAILS OF OFFICER");
		   of.printEmployee();
		   of.printSalary();
		   of.printspecilization();
		   
		   
		   System.out.println("DETAILS OF MANAGER");
		   Mr.printEmployee();
		   Mr.printSalary();
		   Mr.printdepartment();
		   }}
