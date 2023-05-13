package Assignment_work;

abstract class parent{
    public abstract void message();
}

class subclass1 extends parent{
	public void message() {
		System.out.println("This is first subclass");
	}
}

class subclass2 extends subclass1{
	public void message() {
		System.out.println("This is first subclass");
	}
}

public class OOPS9 {
public static void main(String[] args) {
	subclass1 ab=new subclass1();
	subclass2 abc=new subclass2();
	
	ab.message();
	abc.message();
	
}
}
