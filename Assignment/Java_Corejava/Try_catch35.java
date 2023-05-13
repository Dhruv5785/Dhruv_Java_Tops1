package Assignment_work;

public class Try_catch35 {
public static void main(String[] args) {
	try {
		int a=20;
		int b=0;
		int c=a/b;
		System.out.println(c);
	}
	catch (Exception e) {
		e.printStackTrace();
		System.out.println("Cant divide by zero");
	}
}

}