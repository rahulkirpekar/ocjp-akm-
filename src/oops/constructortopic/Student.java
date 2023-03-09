package oops.constructortopic;
import java.util.Scanner;
public class Student 
{
	int rno;//0
	String name;//null
	int std;//0
	// Default Constructor
	public Student() 
	{
		System.out.println("Default Constructor ---- " + rno + " "+ name + " "+std);
		rno=1;
		name="ASShiq";
		std=12;
	}
	// Para Constructor
	public Student(int r,String n,int s) 
	{
		System.out.println("Para Constructor ---- " + rno + " "+ name + " "+std);
		rno=r;
		name=n;
		std=s;
	}
	// Copy Constructor
	public Student(Student s) 
	{
		System.out.println("COpy Constructor ---- " + rno + " "+ name + " "+std);
		rno=s.rno;
		name=s.name;
		std=s.std;
	}
	// 2) Member Function--Optional	
	public void scan()
	{
		System.out.println("scan method ---- " + rno + " "+ name + " "+std);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Rno : ");
		rno = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		name = sc.nextLine();
		System.out.println("Enter Std : ");
		std = sc.nextInt();
	}
	public void disp() 
	{
		System.out.println(rno + " "+ name + " "+std);
	}
	public static void main(String[] args) 
	{
		Student s1 = new Student();// Runtime---[Java Virtual Machine]--invoke Default Constructor
		Student s2 = new Student(2,"krunal",10);// Runtime---[Java Virtual Machine]--invoke Default Constructor
		s1.disp();// 
		s2.disp();// 

		Student s3 = new Student(s2);
		s3.disp();// 
	}
}