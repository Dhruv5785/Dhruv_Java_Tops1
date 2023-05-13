package Assignment_work;

import java.util.Scanner;

public class Try_Catch39 {
	
	static void valid(int age) {
		  if (age<18) {
			throw new ArithmeticException("you are not eligable to vote");
		}else {
			System.out.println("You are eligible to vote");
		}
	}
public static void main(String[] args) {
    Scanner a=new Scanner(System.in);
	System.out.println("Enter your age: ");
	int age=a.nextInt();
	valid(age);
}
}
