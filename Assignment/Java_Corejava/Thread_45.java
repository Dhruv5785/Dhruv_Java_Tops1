package Assignment_work;

public class Thread_45 implements Runnable {
public static void main(String[] args) {
	Thread_45 ab=new Thread_45();
	Thread z=new Thread(ab);
	z.start();
	z.start();
}

@Override
public void run() {
System.out.println("Thread started");
	
}
}
