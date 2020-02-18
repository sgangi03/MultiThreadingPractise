import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class ConsumerUsingLock extends Thread{
	

	private volatile int counter;
	private Condition inccondition;
	private Condition deccondition;
	private Lock lock;
	
	ConsumerUsingLock(int counter,Condition inccondition,Condition deccondition,Lock lock){
		this.inccondition=inccondition;
		this.deccondition=deccondition;
		this.counter=counter;
		this.lock=lock;
	}
	
	@Override
	public void run() {
		
		while(true) {
			lock.lock();
			try {
				while (counter==0)
					deccondition.await();
				
				counter--;
				System.out.print("consumer : " + counter);
				inccondition.signalAll();
				
			
				lock.unlock();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				lock.unlock();
			}
		
		
		}
		
		
	}

}
