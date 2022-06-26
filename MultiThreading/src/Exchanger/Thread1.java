package Exchanger;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Exchanger;

public class Thread1 implements Runnable{

	Exchanger<String> cd;
	
	
	Thread1(Exchanger<String> cd){
		this.cd=cd;
	}
	
	
	@Override
	public void run() {
		System.out.println("Thread1 about to  started");
		try {
		String test=	cd.exchange("a");
		
		System.out.println("Thread1 ended"+ test);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	
	
	
}
