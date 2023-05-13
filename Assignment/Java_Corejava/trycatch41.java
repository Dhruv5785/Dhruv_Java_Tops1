package Assignment_work;


class AgeNotWithinRange extends Exception{
	public String toString() {
		return "Your age is not within range";
	}
}

class NameNotValid extends Exception{
	public String toString() {
		return "Your name is invalid";
	}
}

class student3{
	int roll_no;
	String name;
 	int age;
	String course;
	
	public student3(int roll_no,String name,int age,String course) throws NameNotValid{
	       this.roll_no=roll_no;
	       this.name=name;
	       this.age=age;
	       this.course=course;
	    try {   
	       if (age>=15 && age<=21 ) {
	    	    System.out.println("It is within range");
		}else {
			throw new AgeNotWithinRange();
		}
	    }catch (AgeNotWithinRange e) {
			System.out.println(e);
		}   
	       char ch;
	       int temp=0;
	       for(int i=0;i<name.length();i++) {
	    	   ch=name.charAt(i);
	    	   if (ch=='#' || ch=='@' ||ch=='$' || ch=='&') {
	    		   temp=1;
	         }
	       }
	       if (temp==1) {
			System.out.println("Name is having special symbol");
		}else {
			System.out.println("Name is proper");
		}
		}
	}


public class trycatch41 {
    public static void main(String[] args) throws AgeNotWithinRange,NameNotValid {
       student3 ab=new student3(8, "Akshat", 14, "BCA");
   }
}
