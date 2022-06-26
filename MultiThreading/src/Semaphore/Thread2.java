package Semaphore;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Semaphore;

public class Thread2 implements Runnable{
	Semaphore cd;

	Thread2(Semaphore cd){
		this.cd=cd;
	}
	
	@Override
	public void run(){
		
		System.out.println("Thread2 started");
		
		try {
			
			Thread.sleep(5000);
			cd.acquire();
			Thread.sleep(5000);
			cd.release();
		System.out.println("Thread2 ended");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
