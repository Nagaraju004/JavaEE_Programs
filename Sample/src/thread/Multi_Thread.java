package thread;

public class Multi_Thread extends Thread {
	public void run() {
		looping();
	}

	public void looping() {
		for (int i = 0; i < 10; i++) {

			System.out.println(Thread.currentThread().getName() + ":" + i);
			try {
				Thread.sleep(11500);
			} catch (Exception e) {
				System.out.println(e);
			}

		}
	}

	public static void main(String args[]) {
		Thread obj = new Multi_Thread();
		obj.start();
		Thread obj2 = new Multi_Thread();
		obj2.start();
		Thread obj3 = new Multi_Thread();
		obj3.start();
	}

}


