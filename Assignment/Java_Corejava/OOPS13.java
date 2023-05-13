package Assignment_work;

import java.util.Scanner;

public class OOPS13 {
    public static void display(int marks) {
    	if (marks>=91 && marks<=100) {
			System.out.println("You got A1 grade,You are pass");
		}else if (marks>=81 && marks<=90) {
			System.out.println("You got A2 grade,You are pass");
		}else if (marks>=71 && marks<=80) {
			System.out.println("You got B1 grade,You are pass");
		}else if (marks>=61 && marks<=70) {
			System.out.println("You got B2 grade,You are pass");
		}else if (marks>=51 && marks<=60) {
			System.out.println("You got C grade,You are pass");
		}else if (marks>=41 && marks<=50) {
			System.out.println("You got D grade,You are pass");
		}else if (marks<=40) {
			System.out.println("You are fail");
		}
    }
	
	public static void main(String[] args) {
	Scanner a=new Scanner(System.in);
	System.out.println("Enter marks: ");
	int marks=a.nextInt();
	display(marks);
	
}
}
