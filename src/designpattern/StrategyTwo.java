package designpattern;

public class StrategyTwo{
	public static void main(String[] args){
		MuQuack muQuack = new MuQuack(new FlyNoWay());
		muQuack.performFly();
		muQuack.setFlyBehavior(new FlyWithWings());
		muQuack.performFly();
	}
}

abstract class Duck{
	FlyBehavior flyBehavior;// 变量声明要是接口

	public void performFly(){
		flyBehavior.fly();
	}

	public void setFlyBehavior(FlyBehavior flyBehavior){
		this.flyBehavior = flyBehavior;
	}
}

// 鸭子飞行方式的接口
interface FlyBehavior{
	void fly();
}

// 两种飞行方法的实现行为类
class FlyNoWay implements FlyBehavior{
	public void fly(){
		System.out.println("I can't fly!");
	}
}

class FlyWithWings implements FlyBehavior{
	public void fly(){
		System.out.println("fly with wings");
	}
}

class MuQuack extends Duck{
	public MuQuack(FlyBehavior flyBehavi){
		flyBehavior = flyBehavi;// 实例化对象的时候初始化鸭子的行为
	}
}
