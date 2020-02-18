package BlockingQueue;

import java.util.concurrent.BlockingQueue;

public class ConsumerUsingBlockingQueue extends Thread{

	BlockingQueue<Integer> queue;
	ConsumerUsingBlockingQueue(BlockingQueue<Integer> queue){
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
