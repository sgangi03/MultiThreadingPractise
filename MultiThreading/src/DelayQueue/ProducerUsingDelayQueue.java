package DelayQueue;

import java.util.concurrent.BlockingQueue;

public class ProducerUsingDelayQueue extends Thread{

	BlockingQueue<DelayImp> queue;
	
	ProducerUsingDelayQueue(BlockingQueue<DelayImp> queue){
		this.queue=queue;
		
		
	}
	
	@Override
	public void run() {
		int i=0;
		while(true) {
			try {
				System.out.println("put : "+ i);	
				 queue.add(new DelayImp(i++,5));
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.print(e);
			}
			
			
			
		}
		
		
		// TODO Auto-generated method stub
		
	}

}
