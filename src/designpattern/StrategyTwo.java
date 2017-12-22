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
	FlyBehavior flyBehavior;// ��������Ҫ�ǽӿ�

	public void performFly(){
		flyBehavior.fly();
	}

	public void setFlyBehavior(FlyBehavior flyBehavior){
		this.flyBehavior = flyBehavior;
	}
}

// Ѽ�ӷ��з�ʽ�Ľӿ�
interface FlyBehavior{
	void fly();
}

// ���ַ��з�����ʵ����Ϊ��
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
		flyBehavior = flyBehavi;// ʵ���������ʱ���ʼ��Ѽ�ӵ���Ϊ
	}
}
