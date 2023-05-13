package Assignment_work;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class ArrayList_67 {
public static void main(String[] args) {
	HashSet a=new HashSet();
	a.add("20");
	a.add("Hello");
	a.add("92.56");
	
    String ab[]=new String[a.size()];
    
    a.toArray(ab);
    
    for(String b:ab) {
    	System.out.println(b);
    }
    }
}
