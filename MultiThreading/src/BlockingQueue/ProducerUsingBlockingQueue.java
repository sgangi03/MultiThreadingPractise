package BlockingQueue;

import java.util.concurrent.BlockingQueue;

public class ProducerUsingBlockingQueue extends Thread{

	BlockingQueue<Integer> queue;
	
	ProducerUsingBlockingQueue(BlockingQueue<Integer> queue){
		this.queue=queue;
		
		
	}
	
	@Override
	public void run() {
		int i=0;
		while(true) {
			try {
				System.out.println("put : "+ i);	
				queue.put(i++);
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.print(e);
			}
			
			
			
		}
		
		
		// TODO Auto-generated method stub
		
	}

}
