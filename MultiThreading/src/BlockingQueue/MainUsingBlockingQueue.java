package BlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;

public class MainUsingBlockingQueue {
	
	
	public static void main(String a[]) {
	BlockingQueue<Integer> queue=new ArrayBlockingQueue<Integer>(1); 
	
	ProducerUsingBlockingQueue prod=new ProducerUsingBlockingQueue(queue);
ConsumerUsingBlockingQueue cons=new ConsumerUsingBlockingQueue(queue);
prod.start();
cons.start();
}
}