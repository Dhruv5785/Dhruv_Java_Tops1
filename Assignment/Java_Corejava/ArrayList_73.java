package Assignment_work;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ArrayList_73 {
public static void main(String[] args) {
	Set a=new HashSet();
	a.add(40);
	a.add(29.39);
	a.add("Language");
	a.add("Wonder");
	
	Set b=new HashSet();
	b.add(40);
	b.add("Wonder");
	b.add(50);
	
    a.retainAll(b);
    System.out.println(a);
	
}
}
