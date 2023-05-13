package Assignment_work;

import java.util.Scanner;

public class Try_Catch38 {
public static void main(String[] args) {
	
	Scanner ab=new Scanner(System.in);
	System.out.println("Enter first number");
	int a=ab.nextInt();
	System.out.println("Enter second number");
	int b=ab.nextInt();
	int c;
	try {
		c=a/b;
		System.out.println(c);
	} catch (Exception e) {
		System.out.println(e);
	}
	
System.out.println("Hello!!!");
}
}
