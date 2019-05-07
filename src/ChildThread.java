
public class ChildThread extends Thread{

	public void run()
	{
		System.out.println("child thread local="+ParentThread.tl.get());

	}
}
