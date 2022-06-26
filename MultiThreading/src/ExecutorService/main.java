package ExecutorService;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class main {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
	
		List<Future<String>> futlist=new ArrayList<>();
		ExecutorService ex=Executors.newFixedThreadPool(10);
		for(int i=0;i<100;i++) {
		Thread2 t2=new Thread2();
		
		futlist.add(ex.submit(t2));
		}

		
		List<Runnable> r=  ex.shutdownNow();
		
		for(Runnable r1: r) {
			System.out.println(r1.toString());
		}
		
		ex.awaitTermination(1, TimeUnit.MILLISECONDS);
		
		for(Future<String> f:futlist) {
			
			System.out.println("IsCancelled:"+ f.isCancelled());
			System.out.println("Is Completed:"+ f.isDone());
			f.cancel(true);
			System.out.println("IsCancelled:"+ f.isCancelled());
		//	System.out.println("get:"+ f.get());
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
 
 
 class Thread2 implements Callable<String>{

	@Override
	public String call() throws Exception {
	Thread.sleep(10000);
		return "Shiva";
	}


	
	
	
}
 
 
 