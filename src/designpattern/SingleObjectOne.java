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

class SingleObject{

	// 变量设置成静态的原因是这个类只能有一个实例，静态变量的含义就是“所有的实例对象共享这一个成员变量”
	private static SingleObject instance = new SingleObject();

	// 构造函数设置成private，类就不会被实例化
	private SingleObject(){}

	public static SingleObject getInstance(){
		return instance;
	}

	public void showMessage(){
		System.out.println("Hello World");
	}

}
