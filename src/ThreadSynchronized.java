
public class ThreadSynchronized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter counterA= new Counter();
		
		Thread threadA =new CounterThread(counterA);
		Thread threadB= new CounterThread(counterA);
		Thread threadC= new Interrupt();
		
		threadA.start();
		threadB.start();
		threadC.start();
		
	}

}
