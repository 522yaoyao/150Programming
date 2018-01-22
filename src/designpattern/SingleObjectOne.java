package designpattern;

public class SingleObjectOne{
	public static void main(String[] args){
		// 构造函数在类以外是不可见的
		// SingleObject object=new SingleObject();

		// 获取唯一可用的对象
		SingleObject object = SingleObject.getInstance();
		object.showMessage();
	}
}

/**
 * 饿汉式
 * 是否Lazy初始化：否
 * 是否多线程安全：是
 * 实现难度：易
 * 描述:这种方式比较常用，但是容易产生垃圾对象
 * 优点：没有加锁，执行效率会提高
 * 缺点：类加载时就初始化，浪费内存。
 * 基于classloder机制避免了多线程的同步问题，不过，instance在类装载时就实例化
 */
class SingleObject{

	// 变量设置成静态的原因是这个类只能有一个实例，静态变量的含义就是“所有的实例对象共享这一个成员变量”
	private static SingleObject instance = new SingleObject();// 容易产生垃圾对象，浪费内存

	// 构造函数设置成private，类就不会被实例化
	private SingleObject(){}

	public static SingleObject getInstance(){
		return instance;
	}

	public void showMessage(){
		System.out.println("Hello World");
	}

}
