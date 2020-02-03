import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadsUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExecutorService es=Executors.newFixedThreadPool(2);
		
		Thread t1=new Thread(new Thread1());
		
		
		Thread t2=new Thread(new Thread2());
		
		es.execute(t1);
		es.execute(t2);
		
	}

}
