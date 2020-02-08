import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;

class calc implements  Runnable {
	 AtomicLong noofMethodCall =new AtomicLong(0);
	public void run() {
		
		add(10,20);

	
	}
	
	
	public void add(int a,int b) {
		
		System.out.println("ThreadName :" + Thread.currentThread().getName() + "-"+"Sum : "+ (a+b)+ " "+"Count : "+noofMethodCall.getAndIncrement());
				
		
	}}
	

public class AtomicEx {
	
public static void main(String a[]) {
	calc c=new calc();
	

	ExecutorService exsv=Executors.newCachedThreadPool();
	
	exsv.execute(c);
	exsv.execute(c);
	exsv.execute(c);
		
	
}

}
