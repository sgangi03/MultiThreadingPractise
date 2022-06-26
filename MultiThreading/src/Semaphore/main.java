package Semaphore;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Semaphore;

public class main {

	public static void main(String[] args) {
	
		Runnable r=()->System.out.println  ("hi");
		Semaphore cd=new Semaphore(1);
		
		Thread1 t1=new Thread1(cd);
		Thread2 t2=new Thread2(cd);
	
		
		new Thread(t1).start();
		new Thread(t2).start();
		
	}
	
}
