package Assignment_work;

class Thread1 extends Thread{
	public void run() {
		System.out.println("Thread started...");
	}
}

public class Thread_43 {
public static void main(String[] args) {
	Thread1 a=new Thread1();
	a.start();
}
}
