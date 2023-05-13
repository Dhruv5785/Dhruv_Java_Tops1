package Assignment_work;
class rectangle{
	int length;
	int width;
	int area1;
	int perimeter1;
	int area3;
	int perimeter3;
	
	public rectangle(int length2,int width2) {
		this.length=length2;
		this.width=width2;
	}
	
	public void area() {
		area1=width*length;
		System.out.println(area1);
	}
	
	public void perimeter() {
		perimeter1=2*(length+width);
		System.out.println(perimeter1);
	}
}

class square extends rectangle{
     
	public square(int s) {
		super(s,s);
	}
	
}
public class OOPS6 {
	//OOPS6
     public static void main(String[] args) {
		rectangle a=new rectangle(4,6);
		square b=new square(3);
		a.area();
		a.perimeter();
		b.area();
		b.perimeter();
	}
}
