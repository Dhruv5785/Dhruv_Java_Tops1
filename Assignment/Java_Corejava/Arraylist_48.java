package Assignment_work;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist_48 {
public static void main(String[] args) {
	ArrayList ab=new ArrayList();
	ab.add(10);
	ab.add("Java coder");
	ab.add(83.28);
	ab.add(82829);
	
	Iterator ba=ab.iterator();
	while(ba.hasNext()) {
		System.out.println(ba.next());
	}
}
}
