package Assignment_work;

import java.util.ArrayList;
public class ArrayList_66 {
public static void main(String[] args) {
  ArrayList ab=new ArrayList();
	
	ab.add("Java coder");
	ab.add(83.28);
	ab.add(100000);
	ab.add('D');
	ab.add("java is a programming language");
	
	ArrayList ba=new ArrayList(ab);
	
	ba.add(82);
	ba.add("Hello");
	
	System.out.println(ba);
}
}
