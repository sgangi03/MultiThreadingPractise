package Semaphore;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Semaphore;

public class Thread1 implements Runnable{

	Semaphore cd;
	
	
	Thread1(Semaphore cd){
		this.cd=cd;
	}
	
	
	@Override
	public void run() {
		System.out.println("Thread1 about to  started");
		try {
			cd.acquire();
			Thread.sleep(5000);
			cd.tryAcquire(1000);
		
		System.out.println("Thread1 ended");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	
	
	
}
