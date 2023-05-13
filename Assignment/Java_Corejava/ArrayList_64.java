package Assignment_work;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayList_64 {
public static void main(String[] args) {
ArrayList ab=new ArrayList();
	
	ab.add("Java coder");
	ab.add(83.28);
	ab.add(100000);
	ab.add('D');
	ab.add("java is a programming language");
	
	ArrayList ba=new ArrayList();
	ba.add(28);
	ba.add('D');
	ba.add("Hello");
	
	
	System.out.println(ab.contains(ba));
}
}
