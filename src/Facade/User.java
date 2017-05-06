package Facade;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Computer comptuter=new Computer();
		comptuter.startUp();
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
				try {
					Thread.sleep(3000);
					comptuter.shotdown();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}).start();
	}

}
