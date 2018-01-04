package designpattern;

public class Decorator{
	public static void main(String args[]){
		Beverage beverage = new Espresso();// 浓缩咖啡
		// 未加任何装饰的浓缩咖啡
		System.out.println(beverage.getDescription() + " $ " + beverage.cost());

		Beverage beverage2 = new HouseBlend();
		beverage2 = new Mocha(beverage2);// 用一份摩卡装饰它；
		beverage2 = new Mocha(beverage2);// 用第二份摩卡装饰它；
		beverage2 = new Whip(beverage2);// 用一份生奶油装饰它；

		System.out.println(beverage2.getDescription() + " $ " + beverage2.cost());
	}

}

abstract class Beverage{
	String description = "Unknown Beverage";

	public String getDescription(){
		return description;
	}

	public abstract double cost();// 计算饮料的价钱，必须在子类中实现

}

// 装饰者类,必须让 CondimentDecorator 能够取代Beverage,因此 CondimentDecorator 扩展自此类；
abstract class CondimentDecorator extends Beverage{
	public abstract String getDescription();// 所有的调料装饰者都必须实现此方法
}

/**
 * ---------------------------------------饮料（具体组件，主体）----------------------------------------------
 * -----------
 */

// 饮料--->浓缩咖啡
class Espresso extends Beverage{

	public Espresso(){
		description = "浓缩咖啡";
	}

	public double cost(){// 返回价钱
		return 1.99;
	}
}

// 饮料--->HouseBlend
class HouseBlend extends Beverage{

	public HouseBlend(){
		description = "House Blend Coffee";
	}

	public double cost(){
		return 0.89;
	}
}

/**
 * ---------------------------------------调料（具体装饰者）------------------------------------------------
 * ---------
 */

// 摩卡是一个装饰者，所以扩展自CondimentDecorator（CondimentDecorator扩展自Beverage）
class Mocha extends CondimentDecorator{
	Beverage beverage;

	public Mocha(Beverage beverage){
		this.beverage = beverage;
	}

	public String getDescription(){
		return beverage.getDescription() + " , Mocha";
	}

	// 要计算带Mocha饮料的价钱，首先把调用委托给装饰对象，计算价钱，然后加上Mochade 价钱，得到最后结果。
	public double cost(){
		return 0.20 + beverage.cost();
	}
}

// 生奶油
class Whip extends CondimentDecorator{
	Beverage beverage;

	public Whip(Beverage beverage){
		this.beverage = beverage;
	}

	public String getDescription(){
		return beverage.getDescription() + " , Whip";
	}

	// 要计算带Mocha饮料的价钱，首先把调用委托给装饰对象，计算价钱，然后加上Mochade 价钱，得到最后结果。
	public double cost(){
		return 0.99 + beverage.cost();
	}
}
