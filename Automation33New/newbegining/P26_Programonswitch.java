package newbegining;

import java.util.Scanner;

public class P26_Programonswitch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value for a");
		int a = sc.nextInt();
		switch(a)
		{
		case 1:System.out.println("chromebrowser");
			
		break;
		case 2:System.out.println("mozillabrowser");
			
		       break;
		case 3:System.out.println("edgebrowswer");
			 
			   break;
		default:System.out.println("safaribrowser");	   
			   
		}
	}

}
