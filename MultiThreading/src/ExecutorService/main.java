package ExecutorService;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.Semaphore;

public class main {

	public static void main(String[] args) {
	
		ExecutorService ex=Executors.newSingleThreadExecutor();
		
		Thread2 t1=new Thread2();
		
Future fut=		ex.submit(t1);
		

System.out.println(fut.isDone());

try {
	System.out.print(fut.get());
	System.out.println("Completed");	
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
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
		// TODO Auto-generated method stub
		return "Shiva";
	}


	
	
	
}
 
 
 