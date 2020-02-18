import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MainUsingLock {
	static volatile int counter;
	public static void main(String[] args) {
		
		 Lock lock=new ReentrantLock();
		 Condition inccondition= lock.newCondition();
		 Condition decconscon=lock.newCondition();
		 
        ProducerUsingLock producer =new ProducerUsingLock(counter,inccondition,decconscon,lock);
		ConsumerUsingLock consumer=new ConsumerUsingLock(counter,inccondition,decconscon,lock);
		
		producer.start();
		consumer.start();
		
	}

}
  