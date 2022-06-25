package CyclicBarrier;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

public class Thread2 implements Runnable{

	CyclicBarrier cd;

	Thread2(CyclicBarrier cd){
		this.cd=cd;
	}
	
	@Override
	public void run(){
		
		System.out.println("Thread2 started");
		
		try {
			
			Thread.sleep(5000);
			cd.await();
		
		
		System.out.println("Thread2 ended");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
