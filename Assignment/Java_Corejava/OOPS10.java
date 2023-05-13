package Assignment_work;

abstract class Bank{
	public abstract void getBalance();
	
}

class BankA{
	public void getBalance() {
		int a=100;
		System.out.println(a);
	}
}

class BankB{
    public void getBalance() {
		int b=150;
		System.out.println(b);
	}
}

class BankC{
    public void getBalance() {
		int c=200;
		System.out.println(c);
	}
}

public class OOPS10 {
public static void main(String[] args) {
	BankA a1=new BankA();
	BankB a2=new BankB();
	BankC a3=new BankC();
	
	a1.getBalance();
	a2.getBalance();
	a3.getBalance();
}
}
