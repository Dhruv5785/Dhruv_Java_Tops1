package Assignment_work;

public class OOPS3 {
	int first;
	float second;
	//Area of square
	public void a(int side) {
		first=side*side;
		System.out.println(first);
	}
	
	//Area of rectangle
	public void a(float length,float breadth) {
		second=length*breadth;
		System.out.println(second);
	}

public static void main(String[] args) {
	OOPS3 am=new OOPS3();
	am.a(5);
	am.a(6 , 5.5f);
}
}
