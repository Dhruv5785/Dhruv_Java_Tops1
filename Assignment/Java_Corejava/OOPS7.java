package Assignment_work;
import java.lang.Math;

class triangle{
	double area1;
	double s;
	int side1=3;
	int side2=4;
	int side3=5;
    int pera;
	
	public void area() {
		s=(side1+side2+side3)/2;
	    System.out.println(Math.sqrt((s*(s-side1)*(s-side2)*(s-side3))));
	}
	
	public int perimeter() {
		pera=side1+side2+side3;
		return pera;
	}
}

public class OOPS7 {
   public static void main(String[] args) {
	triangle ab=new triangle();
	ab.area();
   System.out.println(ab.perimeter());
}
}
