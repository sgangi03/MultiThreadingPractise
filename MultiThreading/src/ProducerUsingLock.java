import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class ProducerUsingLock extends Thread{

	private final int MAX_VAL=10;
	private volatile int counter;
	private Condition inccondition;
	private Condition deccondition;
	private Lock lock;
	
	ProducerUsingLock(int counter,Condition inccondition,Condition deccondition,Lock lock){
		this.counter=counter;
		this.inccondition=inccondition;
		this.deccondition=deccondition;
		this.lock=lock;
	}
	
	@Override
	public void run() {
		
		while(true) {
			lock.lock();
			try {
				while (counter==MAX_VAL)
					inccondition.await();
				
					counter++;
				deccondition.signalAll();
				System.out.print("Producer : " + counter);
				
				lock.unlock();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
			lock.unlock();
			}
		
		
		}
		
	}

}
