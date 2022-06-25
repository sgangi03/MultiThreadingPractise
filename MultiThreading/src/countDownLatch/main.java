package countDownLatch;

import java.util.concurrent.CountDownLatch;

public class main {

	public static void main(String[] args) {
	
		CountDownLatch cd=new CountDownLatch(4);
		
		Thread1 t1=new Thread1(cd);
		Thread2 t2=new Thread2(cd);
		
		
		new Thread(t1).start();
		new Thread(t2).start();
		
	}
	
}
