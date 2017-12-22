package designpattern;
/**
 * 策略模式：一个类的行为或其算法可以在运行时更改。这种类型的设计模式属于行为型模式。
 * 在策略模式中，我们创建表示各种策略的对象和一个行为随着策略对象改变而改变的 context 对象。策略对象改变 context 对象的执行算法。
 * @author liuyao
 */
public class StrategyOne{
	public static void main(String[] args){
		TestDuck quack = new TestDuck(new Quack());
		quack.quack();
		TestDuck squack = new TestDuck(new Squack());
		squack.quack();
		TestDuck muteQuack = new TestDuck(new MuteQuack());
		muteQuack.quack();
	}
}

// 抽象策略类Strategy（接口）
interface QuackBehavior{
	void quack();// 抽象所有鸭子叫的方法
}

// 三个具体实现行为的类ConcreteStrategy

class Quack implements QuackBehavior{
	public void quack(){
		System.out.println("呱呱呱");
	}
}

class Squack implements QuackBehavior{
	public void quack(){
		System.out.println("吱吱吱");
	}
}

class MuteQuack implements QuackBehavior{
	public void quack(){
		System.out.println("不会叫");
	}
}

class TestDuck{
	private QuackBehavior quacBehavior;// 注意，要把变量设计成接口变量

	// 构造函数，具体实现哪种叫的方式
	public TestDuck(QuackBehavior quacBehavior){
		this.quacBehavior = quacBehavior;
	}

	// 动态改变鸭子叫的方式
	public void setQuackBehavior(QuackBehavior quacBehavior){
		this.quacBehavior = quacBehavior;
	}

	public void quack(){
		quacBehavior.quack();// 调用实现了此接口的行为类里的方法
	}

	public void display(){
		System.out.println("我是一只鸭子");
	}
}
