
public class CounterThread extends Thread {
	private Counter counter=null;
	
	public CounterThread(Counter counter){
		this.counter=counter;

}
	
	public void run() {
		
			
			for(int i=0;i<10000;i++){
				counter.add(100);
				try {
					this.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(counter.getCounter());
			
		}
		System.out.println(this.getName()+":"+counter.getCounter());
	}
}