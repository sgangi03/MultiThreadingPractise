package ExecutorService;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class main {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
	
		List<Future> futlist=new ArrayList<>();
		ExecutorService ex=Executors.newFixedThreadPool(10);
		for(int i=0;i<100;i++) {
		Thread2 t2=new Thread2();
		
		futlist.add(ex.submit(t2));
		}

		
		List<Runnable> r= ex.shutdownNow();
		
		for(Runnable r1: r) {
			System.out.println(r1.toString());
		}
		
		ex.awaitTermination(1, TimeUnit.MILLISECONDS);
		
		for(Future f:futlist) {
			
			System.out.println("IsCancelled:"+ f.isCancelled());
			System.out.println("Is Completed:"+ f.isDone());
			
			//System.out.println("get:"+ f.get());
			System.out.println("Thread completed");
			System.out.println("Is Completed:"+ f.isDone());
		}
		
		

	}
}


 class Thread1 implements Runnable{

	@Override
	public void run() {
		try {
			Thread.sleep(5000);
			System.out.print("finished");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
}
 
 
 class Thread2 implements Callable{

	@Override
	public Object call() throws Exception {
	Thread.sleep(1000);
		return "Shiva";
	}


	
	
	
}
 
 
 