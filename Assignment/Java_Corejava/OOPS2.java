package Assignment_work;

public class OOPS2 {
	public void firstMethod(int a,char b) {
	      	System.out.println(a);
	      	System.out.println(b);
	}
	
	public void firstMethod(char a,int b) {
		System.out.println(a);
		System.out.println(b);
	}
	
public static void main(String[] args) {
	OOPS2 a=new OOPS2();
	a.firstMethod(100,'a');
	a.firstMethod('b', 200);
}
}
