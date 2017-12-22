package designpattern;
/**
 * ����ģʽ��һ�������Ϊ�����㷨����������ʱ���ġ��������͵����ģʽ������Ϊ��ģʽ��
 * �ڲ���ģʽ�У����Ǵ�����ʾ���ֲ��ԵĶ����һ����Ϊ���Ų��Զ���ı���ı�� context ���󡣲��Զ���ı� context �����ִ���㷨��
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

// ���������Strategy���ӿڣ�
interface QuackBehavior{
	void quack();// ��������Ѽ�ӽеķ���
}

// ��������ʵ����Ϊ����ConcreteStrategy

class Quack implements QuackBehavior{
	public void quack(){
		System.out.println("������");
	}
}

class Squack implements QuackBehavior{
	public void quack(){
		System.out.println("֨֨֨");
	}
}

class MuteQuack implements QuackBehavior{
	public void quack(){
		System.out.println("�����");
	}
}

class TestDuck{
	private QuackBehavior quacBehavior;// ע�⣬Ҫ�ѱ�����Ƴɽӿڱ���

	// ���캯��������ʵ�����ֽеķ�ʽ
	public TestDuck(QuackBehavior quacBehavior){
		this.quacBehavior = quacBehavior;
	}

	// ��̬�ı�Ѽ�ӽеķ�ʽ
	public void setQuackBehavior(QuackBehavior quacBehavior){
		this.quacBehavior = quacBehavior;
	}

	public void quack(){
		quacBehavior.quack();// ����ʵ���˴˽ӿڵ���Ϊ����ķ���
	}

	public void display(){
		System.out.println("����һֻѼ��");
	}
}
