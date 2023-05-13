package Assignment_work;


class AgeNotWithinRangeException extends Exception{
	public String toString() {
		return "Age is not between 15 and 20";
	}
}

class NameNotValidException extends Exception{
	public String toString(){
		   return "It contain numbers or special symbol so it is not valid";
	}
}
 

class Student{
	
	static int Roll_no;
   static String Name;
   static int Age;
    static String Course;
	
	   /* Student(){
		   Roll_no=0;
		   Name=null;
		   Age=0;
		   Course=null;
		}*/
	    
	   Student(int Roll_no,String Name,int Age,String Course) {
		   
		   this.Roll_no=Roll_no;
		   this.Course=Course;
		   this.Age=Age;
		   this.Name=Name;
		
		//For age
		try {
			if (Age>=15 && Age<=21) {
				System.out.println("It is within range");
				
			}else {
				throw new AgeNotWithinRangeException();
			}
		} catch (AgeNotWithinRangeException e) {
			System.out.println(e);
		}
		
		//For name
		char ch;
		int temp = 0;
		for(int i=0;i<Name.length();i++) {
			
			ch=Name.charAt(i);
			if (ch == '%' || ch == '#' || ch == '&' || ch =='$' || ch =='@') {
				temp=1;
			}
		}
		try {
		
			if (temp==1) {
				throw new NameNotValidException();
			}else {
				System.out.println("Name is valid");
			}
			
		 }catch (NameNotValidException e1) {
		System.out.println(e1);
	}
		
   }
}


public class Try_Catch41 {
   public static void main(String[] args) throws AgeNotWithinRangeException,NameNotValidException {
	   Student ab=new Student(10, "Dhruv", 19,"Java");
	   }
}
