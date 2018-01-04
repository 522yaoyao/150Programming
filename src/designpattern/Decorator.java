package designpattern;

public class Decorator{
	public static void main(String args[]){
		Beverage beverage = new Espresso();// Ũ������
		// δ���κ�װ�ε�Ũ������
		System.out.println(beverage.getDescription() + " $ " + beverage.cost());

		Beverage beverage2 = new HouseBlend();
		beverage2 = new Mocha(beverage2);// ��һ��Ħ��װ������
		beverage2 = new Mocha(beverage2);// �õڶ���Ħ��װ������
		beverage2 = new Whip(beverage2);// ��һ��������װ������

		System.out.println(beverage2.getDescription() + " $ " + beverage2.cost());
	}

}

abstract class Beverage{
	String description = "Unknown Beverage";

	public String getDescription(){
		return description;
	}

	public abstract double cost();// �������ϵļ�Ǯ��������������ʵ��

}

// װ������,������ CondimentDecorator �ܹ�ȡ��Beverage,��� CondimentDecorator ��չ�Դ��ࣻ
abstract class CondimentDecorator extends Beverage{
	public abstract String getDescription();// ���еĵ���װ���߶�����ʵ�ִ˷���
}

/**
 * ---------------------------------------���ϣ�������������壩----------------------------------------------
 * -----------
 */

// ����--->Ũ������
class Espresso extends Beverage{

	public Espresso(){
		description = "Ũ������";
	}

	public double cost(){// ���ؼ�Ǯ
		return 1.99;
	}
}

// ����--->HouseBlend
class HouseBlend extends Beverage{

	public HouseBlend(){
		description = "House Blend Coffee";
	}

	public double cost(){
		return 0.89;
	}
}

/**
 * ---------------------------------------���ϣ�����װ���ߣ�------------------------------------------------
 * ---------
 */

// Ħ����һ��װ���ߣ�������չ��CondimentDecorator��CondimentDecorator��չ��Beverage��
class Mocha extends CondimentDecorator{
	Beverage beverage;

	public Mocha(Beverage beverage){
		this.beverage = beverage;
	}

	public String getDescription(){
		return beverage.getDescription() + " , Mocha";
	}

	// Ҫ�����Mocha���ϵļ�Ǯ�����Ȱѵ���ί�и�װ�ζ��󣬼����Ǯ��Ȼ�����Mochade ��Ǯ���õ��������
	public double cost(){
		return 0.20 + beverage.cost();
	}
}

// ������
class Whip extends CondimentDecorator{
	Beverage beverage;

	public Whip(Beverage beverage){
		this.beverage = beverage;
	}

	public String getDescription(){
		return beverage.getDescription() + " , Whip";
	}

	// Ҫ�����Mocha���ϵļ�Ǯ�����Ȱѵ���ί�и�װ�ζ��󣬼����Ǯ��Ȼ�����Mochade ��Ǯ���õ��������
	public double cost(){
		return 0.99 + beverage.cost();
	}
}
