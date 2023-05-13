package Assignment_work;

public class Thread_42 implements Runnable{
public static void main(String[] args) {
	Thread_42 a=new Thread_42();
	Thread b=new Thread(a);
	b.start(); 
}

@Override
public void run() {
	System.out.println("Thread started");
}
}
