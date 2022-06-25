package CyclicBarrier;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

public class Thread1 implements Runnable{

	CyclicBarrier cd;
	
	
	Thread1(CyclicBarrier cd){
		this.cd=cd;
	}
	
	
	@Override
	public void run() {
		System.out.println("Thread1 about to  started");
		try {
			cd.await();
		
		System.out.println("Thread1 ended");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	
	
	
}
