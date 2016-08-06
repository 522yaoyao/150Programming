package practice;

public class ThreadPrint {
	/**
	 * 理解线程同步
	 * @param id
	 * @param daemon
	 * @return
	 */
	static Thread makeThread(final String id,boolean daemon){
		Thread t=new Thread(id){
			@Override
			public void run(){
				System.out.println(id);
			}
		};
		t.setDaemon(daemon);
		t.start();
		return t;
	}
	public static void main(String[] args){
   Thread a=makeThread("A",false);
   Thread b=makeThread("B",true);
   System.out.println("END\n");
	}
}
