package Assignment_work;

class a{
	public void ab() {
		System.out.println("This is parent class");
	}
	
}

class b extends a{
	public void ba() {
		System.out.println("This is child class");
	}
}
public class OOPS4 {
    public static void main(String[] args) {
	a obj1=new a();
      b obj2=new b();
      
      obj1.ab();
      obj2.ba();
      obj2.ab();
      
    }
}
