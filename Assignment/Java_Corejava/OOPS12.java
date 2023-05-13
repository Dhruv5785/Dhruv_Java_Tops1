package Assignment_work;

abstract class shape{
	public abstract void RectangleArea(int length,int breadth);
	public abstract void SquareArea(int side);
	public abstract void CircleArea(Double radius);
}

class Area extends shape{

	@Override
	public void RectangleArea(int length, int breadth) {
		int ans;
		ans=length*breadth;
	    System.out.println(ans);	
	}

	@Override
	public void SquareArea(int side) {
         int ans2;
         ans2=side*side;
         System.out.println(ans2);
		
	}

	@Override
	public void CircleArea(Double radius) {
		double ans3;
		ans3=Math.PI*(radius*radius);
		System.out.println(ans3);
		
	}
}

public class OOPS12 {
public static void main(String[] args) {
	Area ar=new Area();
	ar.RectangleArea(6, 8);
	ar.SquareArea(4);
	ar.CircleArea(7d);
}
}
