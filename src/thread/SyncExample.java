package thread;

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
		new Thread2().run();//ֻ�н�ĳ���ڲ�������Ϊ��̬�࣬Ȼ����ܹ��ھ�̬���е��ø���ĳ�Ա�������Ա����;
	//	new SyncExample().a();
	}
}