package Assignment_work;

/*We have to calculate the percentage of marks obtained in three subjects (each out of 
100) by student A and in four subjects (each out of 100) by student B. Create an 
abstract class 'Marks' with an abstract method 'getPercentage'. It is inherited by two 
other classes 'A' and 'B' each having a method with the same name which returns the 
percentage of the students. The constructor of student A takes the marks in three 
subjects as its parameters and the marks in four subjects as its parameters for student 
B. Create an object for each of the two classes and print the percentage of marks for 
both the students.*/

 abstract class Marks{
	
	double Maths;
	double Science;
	double Hindi;
	double History; 
	double Result1;
	double result2;
	
    public abstract void getPercentage();
		
}


class A extends Marks{
	
	public A(int Maths2,int Science2,int Hindi2) {
		this.Maths=Maths2;
		this.Science=Science2;
		this.Hindi=Hindi2;
	}
    
	public void getPercentage() {
		Result1=((Maths+Science+Hindi)*100)/300;
		System.out.println("Percentage of student A is: "+Result1);
	}
}

class B extends Marks{
  

	public B(int Maths2, int Science2, int Hindi2,int History) {
		        this.Maths=Maths2;
		        this.Science=Science2;
	         	this.Hindi=Hindi2;
          		this.History=History;
		
	}

	public void getPercentage() {
		result2=((Maths+Science+Hindi+History)*100)/400;
		System.out.println("Percentage of student B is: "+result2);
	}
}
public class OOPS11 {
public static void main(String[] args) {
	A a=new A(67, 65, 72);
	B b=new B(63, 67, 59, 65);
	a.getPercentage();
	b.getPercentage();
}

}
