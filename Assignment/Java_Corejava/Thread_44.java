package Assignment_work;

import java.util.Iterator;

class Thread2 implements Runnable{
    @Override
	public void run() {
    	for(int v=0;v<5;v++) {
    	try {
			Thread.sleep(2000);
			System.out.println("Thread 1");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
   	  }
	}
}

public class Thread_44 {
public static void main(String[] args) {
     Thread2 a=new Thread2();
     Thread b=new Thread(a);
     b.start();
     	for(int v=0;v<5;v++) {
     	try {
 			Thread.sleep(2000);
 			System.out.println("Thread 2");
 		} catch (InterruptedException e) {
 			e.printStackTrace();
 		}
  
 	}
}
}
