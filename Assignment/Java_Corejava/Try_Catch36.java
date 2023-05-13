package Assignment_work;

import java.util.Arrays;

public class Try_Catch36 {
public static void main(String[] args) {
	try {
		/*Arithmatic exception
		int a[]=new int[] {10,20,30,40,50};
		a[3]=30/0;
		System.out.println(a[3]);*/
		
		//ArrayIndexOutOfBound
		int b[]=new int[] {10,20,30,40,50};
		b[5]=30/5;
		System.out.println(b[5]);
		
	} catch (ArithmeticException e) {
		e.printStackTrace();
	}catch (ArrayIndexOutOfBoundsException r) {
		r.printStackTrace();
	}
}
}
