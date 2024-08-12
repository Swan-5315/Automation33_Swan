package newbegining;

import java.util.Scanner;

public class P6_pract {
	static void add()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a value a:");
		int a = sc.nextInt();
		System.out.println("enter a value b:");
		int b = sc.nextInt();
		int c = a+b;
	 System.out.println("Addition of a and b " +c);
	}
	static void sub()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a value a:");
		int a = sc.nextInt();
		System.out.println("enter a value b:");
		int b = sc.nextInt();
		int c = a-b;
	 System.out.println("Subtraction of a and b " +c);
	}
	static void mul()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a value a:");
		int a = sc.nextInt();
		System.out.println("enter a value b:");
		int b = sc.nextInt();
		int c = a*b;
	 System.out.println("Multiplication of a and b " +c);
		
	}
	static void div()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a value a:");
		int a = sc.nextInt();
		System.out.println("enter a value b:");
		int b = sc.nextInt();
		int c = a/b;
	 System.out.println("division of a and b " +c);
	}
	
	public static void main(String[] args) {
		add();
		sub();
		mul();
		div();
		
		
		
	}

}
