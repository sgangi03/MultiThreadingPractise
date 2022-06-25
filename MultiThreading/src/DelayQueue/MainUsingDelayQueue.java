package DelayQueue;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.DelayQueue;

public class MainUsingDelayQueue {
	
	
	public static void main(String a[]) {
		
		List<String> g=new ArrayList<>();
		
	BlockingQueue<DelayImp> queue=new DelayQueue<DelayImp>();
	
	ProducerUsingDelayQueue prod=new ProducerUsingDelayQueue(queue);
ConsumerUsingDelayQueue cons=new ConsumerUsingDelayQueue(queue);
prod.start();
cons.start();
}
}