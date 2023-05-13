package Assignment_work;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist_56 {
public static void main(String[] args) {
ArrayList a1=new ArrayList();
	
	a1.add("Java coder");
	a1.add(83.28);
	a1.add(100000);
	a1.add('D');
	
	Collections.shuffle(a1);
	System.out.println(a1);
}
}
