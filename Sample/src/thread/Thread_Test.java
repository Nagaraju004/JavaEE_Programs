package thread;

public class Thread_Test extends Thread{
	public static void main(String args[])
	{
		Thread t=Thread.currentThread();
		System.out.println("current thread "+t.getName());
		t.setName("naga");
		System.out.println("current thread "+t.getName());
		System.out.println("get priority "+t.getPriority());
		t.setPriority(MAX_PRIORITY);
		System.out.println("get priority "+t.getPriority());
		t.setPriority(MIN_PRIORITY);
		System.out.println("get priority "+t.getPriority());

	}

}


