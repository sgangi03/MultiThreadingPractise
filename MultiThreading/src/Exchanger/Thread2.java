package Exchanger;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Exchanger;

public class Thread2 implements Runnable{

	Exchanger<String> cd;

	Thread2(Exchanger<String> cd){
		this.cd=cd;
	}
	
	@Override
	public void run(){
		
		System.out.println("Thread2 started");
		
		try {
			
			Thread.sleep(5000);
			String test=	cd.exchange("b");
			
			System.out.println("Thread2 ended"+ test);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
