package CyclicBarrier;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

public class main {

	public static void main(String[] args) {
	
		Runnable r=()->System.out.println("hi");
		CyclicBarrier cd=new CyclicBarrier(2,r);
		
		Thread1 t1=new Thread1(cd);
		Thread2 t2=new Thread2(cd);
	
		
		new Thread(t1).start();
		new Thread(t2).start();
		
	}
	
}
