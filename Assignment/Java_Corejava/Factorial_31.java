package Assignment_work;


import java.util.Scanner;
public class Factorial_31 {
public static void main(String[] args) {
	Scanner a=new Scanner(System.in);
	System.out.print("Enter number: ");
	int b=a.nextInt();
	System.out.println(factorial(b));
	
}
   
     static int factorial(int i) {
    	  int ax=1;
		for(int i1=i;i1>=1;i1--) {
			ax*=i1;
		}
		return ax;
	}

}
