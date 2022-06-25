package countDownLatch;

import java.util.concurrent.CountDownLatch;

public class Thread2 implements Runnable{

	CountDownLatch cd;

	Thread2(CountDownLatch cd){
		this.cd=cd;
	}
	
	@Override
	public void run(){
		
		System.out.println("Thread2 started");
		
		try {
			cd.countDown();
			Thread.sleep(1000);
		
		
		cd.countDown();
		Thread.sleep(1000);
		cd.countDown();
		Thread.sleep(1000);
		cd.countDown();
		
		Thread.sleep(1000);
		cd.countDown();
		Thread.sleep(1000);
		cd.countDown();
		Thread.sleep(1000);
		cd.countDown();
		System.out.println("Thread2 ended");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
