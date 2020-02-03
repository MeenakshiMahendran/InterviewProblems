import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{

	protected BlockingQueue queue=null;
	
	public Consumer(BlockingQueue queue) {
		this.queue=queue;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		try {
			System.out.println(queue.take());
			System.out.println("taking 1");
			System.out.println(queue.take());
			System.out.println("taking 2");
			System.out.println(queue.take());
			System.out.println("taking 3");
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
