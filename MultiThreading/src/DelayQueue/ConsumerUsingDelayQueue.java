package DelayQueue;

import java.util.concurrent.BlockingQueue;

public class ConsumerUsingDelayQueue extends Thread{

	BlockingQueue<DelayImp> queue;
	ConsumerUsingDelayQueue(BlockingQueue<DelayImp> queue){
		this.queue=queue;
		
		
	}
	
	@Override
	public void run() {
		
		while(true) {
			try {
				System.out.println("removed : "+ queue.take());
		
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.print(e);
			}
			
			
			
		}
		
	}

}
