package countDownLatch;

import java.util.concurrent.CountDownLatch;

public class Thread1 implements Runnable{

	CountDownLatch cd;
	
	
	Thread1(CountDownLatch cd){
		this.cd=cd;
	}
	
	
	@Override
	public void run() {
		System.out.println("Thread1 about to  started");
		try {
			cd.await();
		
		System.out.println("Thread1 ended");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	
	
	
}
