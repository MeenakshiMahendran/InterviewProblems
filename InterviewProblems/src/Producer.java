import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable{
	
	protected BlockingQueue queue=null;
	
	public Producer(BlockingQueue queue) {
		this.queue=queue;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		try {
			System.out.println("in producer");
			
			queue.put("1");
			Thread.sleep(1000);
			
			System.out.println("adding 1");
			
			queue.put("2");
			Thread.sleep(1000);
			
			System.out.println("adding 2");
			
			queue.put("3");
			
			System.out.println("adding 3");
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
