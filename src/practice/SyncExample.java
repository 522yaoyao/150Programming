package practice;

public class SyncExample {
	private static Object lockObject=new Object();
	static int x,y;
	private static class Thread1 extends Thread{
		public void run(){
		synchronized(lockObject){
			x=y=0;
				System.out.println(x);
				}
		}
	}
	public void a(){
		
	}
	private  static class Thread2 extends Thread{
		public void run(){
			synchronized(lockObject){
				x=y=1;
				System.out.println(x);
				}
		}
	}
	public static void main(String[] args){
		new Thread1().run();
		new Thread2().run();//只有将某个内部类修饰为静态类，然后才能够在静态类中调用该类的成员变量与成员方法;
	//	new SyncExample().a();
	}
}
