package DelayQueue;

 class threadcheck extends Thread{
	
@Override
public void run() {
	System.out.print("hi");
}



}




public class ThreadRun{

	public static void main(String[] args) {
		
		threadcheck a=new threadcheck();
		threadcheck b=new threadcheck();
		a.start();
		b.start();
		
		
	}
	
	
	
}
