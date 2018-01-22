package designpattern;

//处理多线程
public class SingleObjectTwo{

}

/**
* 懒汉式
* 是否Lazy初始化：是
* 是否多线程安全：是
* 实现难度：易
* 描述:这种方式具备很好的lazy loading,能够在多线程中很好的工作，但是效率低（多线程），99%情况下不需要同步。
* 优点：第一次调用才初始化，避免内存浪费
* 缺点必须加锁 synchronized 才能保证单例，但加锁会影响效率。
* getInstance() 的性能对应用程序不是很关键（该方法使用不太频繁）。
*/
class Singleton{
	private static Singleton uniqueInstance;

	private Singleton(){}// 保证只有一个实例化对象

	// 获取实例对象的入口
	// 通过增加synchronized 关键字到getInstance()方法中，我们迫使每个线程在进入这方法之前，要先等候别的线程
	// 离开盖方法，也就是说不会有两个线程可以同时进入这个方法；
	public static synchronized Singleton getInstance(){
		if(null == uniqueInstance) uniqueInstance = new Singleton();
		return uniqueInstance;

	}

}
