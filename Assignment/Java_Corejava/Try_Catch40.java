package Assignment_work;

import java.util.Scanner;

class CustomException extends Exception{
	
	int amount2;
	public CustomException(int amount) {
		this.amount2=amount;
	}
}

public class Try_Catch40 {
public static void main(String[] args) throws CustomException {
	int d = 0;
	int e=0;
	Scanner a=new Scanner(System.in);
	System.out.println("Account balance: ");
	int b=a.nextInt();
	System.out.println("Enter amount to withdraw: ");
	int c=a.nextInt();
	
	try {
		if (c>b) {
			d=c-b;
			throw new CustomException(d);
		}else {
			e=b-c;
			System.out.println("Amount "+c+" withdrawn successfully");
			System.out.println("Your current balance is: "+e);
		}
	} catch (CustomException e1) {
		System.out.println("Sorry, insufficient balance you need more "+ e1.amount2 +" Rs. more To perform this transaction. ");
	}
	
	
}
}
