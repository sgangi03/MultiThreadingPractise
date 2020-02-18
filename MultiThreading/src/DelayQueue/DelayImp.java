package DelayQueue;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class DelayImp implements Delayed{

	public int value;
	public long expTime;
	
	DelayImp(int value,long expTime ){
		this.value=value;
	this.expTime=expTime+System.currentTimeMillis();
	}
	
	@Override
	public int compareTo(Delayed arg0) {
	if(this.expTime< ((DelayImp)arg0).expTime)
		return -1;
	
	if(this.expTime >  ((DelayImp)arg0).expTime)
		return 1;
	else return 0;
	}
	@Override
	public long getDelay(TimeUnit unit) {
		long time=expTime-System.currentTimeMillis();
		return unit.convert(time, TimeUnit.MILLISECONDS);
	}

}
