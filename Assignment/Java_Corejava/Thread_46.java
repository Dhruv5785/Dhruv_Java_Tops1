package Assignment_work;

class TestdaemonThread1 extends Thread{
    public void run() {
		System.out.println("Hello");
	}
}

public class Thread_46 {
public static void main(String[] args) {
	System.out.println("run");
	TestdaemonThread1 a=new TestdaemonThread1();
     a.start();
     
     TestdaemonThread1 b=new TestdaemonThread1();
     System.out.println(b.isDaemon());
     b.setDaemon(true);
     System.out.println(b.isDaemon());
     b.start();
}
}
