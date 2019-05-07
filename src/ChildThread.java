
public class ChildThread extends Thread{

	public void run()
	{
		System.out.println(ParentThread.tl.get());

	}
}
