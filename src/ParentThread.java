public class ParentThread extends Thread{

	static ThreadLocal tl = new ThreadLocal();

	public void run()
	{
		tl.set("pl");
		System.out.println("Parent thread local="+tl.get());
		ChildThread ct=new ChildThread();
		ct.start();
	}
}
