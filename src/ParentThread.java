public class ParentThread extends Thread{

	static InheritableThreadLocal tl = new InheritableThreadLocal()
	{

		public Object childValue(Object p)
		{return "abc";}
	};

	public void run()
	{
		tl.set("pl");
		System.out.println("Parent thread local="+tl.get());
		ChildThread ct=new ChildThread();
		ct.start();
	}
}
