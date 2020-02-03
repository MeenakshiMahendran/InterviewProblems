import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ProdConsumeUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BlockingQueue queue=new ArrayBlockingQueue(1024);

		ExecutorService es=Executors.newFixedThreadPool(2);
		
		Thread t1=new Thread(new Producer(queue));
		Thread t2=new Thread(new Consumer(queue));
		
		es.execute(t1);
		es.execute(t2);
		
	}

}
