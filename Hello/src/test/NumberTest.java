package test;

public class NumberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world.");
		NumberHolder numberHolder=new NumberHolder();
		Thread t1=new IncreaseThread(numberHolder);
		Thread t2=new DecreaseThread(numberHolder);
		t1.start();
		t2.start();
		
		Thread t3=new IncreaseThread(numberHolder);
		Thread t4=new DecreaseThread(numberHolder);
		t3.start();
		t4.start();
		
		Thread t5=new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		t5.start();
	}

}
