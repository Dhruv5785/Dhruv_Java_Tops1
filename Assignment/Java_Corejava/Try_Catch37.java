package Assignment_work;

/*W.A.J. P to implement the above program (pro.no-B27) using nesting of try-catch 
block. try { 
try 
{//code} 
catch (Exception e) 
{//code} 
catch (Exception e) 
{//code}*/

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

public class Try_Catch37 {
	public static void main(String[] args) {
		try {
			subclass1 ab=new subclass1();
			subclass2 abc=new subclass2();
			
			ab.message();
			abc.message();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
     	}
     }
  
