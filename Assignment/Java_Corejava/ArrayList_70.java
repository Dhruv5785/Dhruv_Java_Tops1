package Assignment_work;

import java.util.ArrayList;

public class ArrayList_70 {
public static void main(String[] args) {
	ArrayList a1=new ArrayList(3);
	a1.add(10);
	a1.add(20);
	a1.add("Hello");
	
	a1.ensureCapacity(5);
	a1.add(67.82);
	a1.add(81);
	
	System.out.println(a1);
}
}
